package com.example.svgademo.cache.manager;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;

import androidx.annotation.NonNull;

import com.example.svgademo.Utils;
import com.example.svgademo.cache.okhttp.FileDownLoadManager;
import com.example.svgademo.cache.utils.Md5Utils;
import com.jakewharton.disklrucache.DiskLruCache;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SvgaAnimManager implements FileDownLoadManager.OnHttpFileDownLoadListener{

    private static SvgaAnimManager INSTANCE = null;
    private static final int DISK_CACHE_SIZE = 1024 * 1024 * 100; // 磁盘缓存的大小为50M
    private static final int CACHE_SIZE = 10;
    private static final ExecutorService DOWNLOAD_EXECUTOR = Executors.newFixedThreadPool(3);
    private FileDownLoadManager mFileDownLoadManager;
    private Context mContext;
    private String absolutePath;
    private String downloadPath;
    private LruCache<String, SVGAVideoEntity> mCache;
    private DiskLruCache mDiskLruCache;

    public static SvgaAnimManager getInstance() {
        if (INSTANCE == null) {
            synchronized (SvgaAnimManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SvgaAnimManager();
                }
            }
        }
        return INSTANCE;
    }

    private SvgaAnimManager() {

    }

    private DiskLruCache getDiskLruCache() {
        if(mDiskLruCache == null) {
            try {
                File cacheDir = new File(getFilePath(getFilePath(absolutePath, "anim"), "svga"));
                if (!cacheDir.exists()) {
                    cacheDir.mkdirs();
                }
                mDiskLruCache = DiskLruCache.open(cacheDir, 1, 1, DISK_CACHE_SIZE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return mDiskLruCache;
    }

    public void init(Context context) {
        if(context != null) {
            mContext = context.getApplicationContext();
            absolutePath = mContext.getFilesDir().getAbsolutePath();
            getDownloadFilePath();
        }
    }

    public void loadAmin(String url, SVGAImageView v) {
        if(v != null && !TextUtils.isEmpty(url)) {
            v.setTag(url);
            loadAnim(url, v, new SVGAParser.ParseCompletion() {
                @Override
                public void onComplete(@NonNull SVGAVideoEntity svgaVideoEntity) {
                    try {
                        if (v != null && !TextUtils.isEmpty(url) && url.equals(v.getTag())) {
                            v.setVideoItem(svgaVideoEntity);
                            v.stepToFrame(0, true);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                }

                @Override
                public void onError() {

                }
            });
        }
    }

    public void loadAnim(String url, SVGAImageView v, final SVGAParser.ParseCompletion completion) {
        try {
            if(v != null && !TextUtils.isEmpty(url)) {
                v.setTag(url);
            }
            final String fileName = getFileName(url);
            String key = Md5Utils.hashKeyForDisk(url); // 通过md5加密了这个URL，生成一个key
            if (getCache() != null && getCache().get(fileName) != null) {
                if (completion != null) {
                    completion.onComplete(getCache().get(fileName));
                }
            } else if (getDiskLruCache() != null && getDiskLruCache().get(key) != null) {
                if (v != null && !TextUtils.isEmpty(url) && url.equals(v.getTag())) {
                    DiskLruCache.Snapshot snapShot = getDiskLruCache().get(key);// 通过key获取Snapshot对象
                    if (snapShot != null) {
                        InputStream is = snapShot.getInputStream(0);// 通过Snapshot对象获取缓存文件的输入流
                        decodeSvgaFile(key, is, completion);
                    }
                }
            } else {
                if (mFileDownLoadManager == null) {
                    mFileDownLoadManager = new FileDownLoadManager(mContext, getDiskLruCache(), this);
                }
                DOWNLOAD_EXECUTOR.execute(new Runnable() {
                    @Override
                    public void run() {
                        mFileDownLoadManager.executeHttpFile2(getDownloadFile(fileName), url, key, new FileDownLoadManager.OnHttpFileDownLoadListener() {
                            @Override
                            public void onPrepareDownLoad() {
                                FileDownLoadManager.OnHttpFileDownLoadListener.super.onPrepareDownLoad();
                            }

                            @Override
                            public void onCheckHttpFileSize(boolean isCheckSuccess, long fileTotalSize) {
                                FileDownLoadManager.OnHttpFileDownLoadListener.super.onCheckHttpFileSize(isCheckSuccess, fileTotalSize);
                            }

                            @NonNull
                            @Override
                            public long[] onSetRange() {
                                return FileDownLoadManager.OnHttpFileDownLoadListener.super.onSetRange();
                            }

                            @Override
                            public void onAlreadyDownLoadLength(long length, long total, int progress) {
                                FileDownLoadManager.OnHttpFileDownLoadListener.super.onAlreadyDownLoadLength(length, total, progress);
                            }

                            @Override
                            public void onDownLoadSuccess(boolean success, String key) {
                                FileDownLoadManager.OnHttpFileDownLoadListener.super.onDownLoadSuccess(success, fileName);
                                if (v != null && !TextUtils.isEmpty(url) && url.equals(v.getTag()) && !TextUtils.isEmpty(fileName) && getDiskLruCache() != null) {
                                    try {
                                        DiskLruCache.Snapshot snapShot = getDiskLruCache().get(key);// 通过key获取Snapshot对象
                                        if (snapShot != null) {
                                            InputStream is = snapShot.getInputStream(0);// 通过Snapshot对象获取缓存文件的输入流
                                            decodeSvgaFile(key, is, completion);
                                        }
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }

                                }

                            }
                        });
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void decodeSvgaFile(String key, InputStream is, final SVGAParser.ParseCompletion completion) {
        try {
            SVGAParser svgaParser = SVGAParser.Companion.shareParser();
            if (svgaParser != null) {
                svgaParser.decodeFromInputStream(is, key, new SVGAParser.ParseCompletion() {
                    @Override
                    public void onComplete(SVGAVideoEntity svgaVideoEntity) {
                        getCache().put(key, svgaVideoEntity);
                        if(completion != null)
                            completion.onComplete(svgaVideoEntity);
                        try {
                            if (is != null) {
                                is.close();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError() {
                        if(completion != null)
                            completion.onError();
                        try {
                            if (is != null) {
                                is.close();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }, true, null, key);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private LruCache<String, SVGAVideoEntity> getCache() {
        if(mCache == null)
            mCache = new LruCache<>(CACHE_SIZE);
        return mCache;
    }

    /**
     * 获取文件名
     * https://img. ayomet.com/upload/entrance_float/animation/2923-10-11/10f461e9459f2981287ebb4367566e3b.svga?imageslin
     * @return
     */
    private String getFileName(String url) {
        if(TextUtils.isEmpty(url)) {
            return url;
        }
        if(url.contains("?imageslim"))
            url = url.replace("?imageslim", "");
        return url.substring(url.lastIndexOf("/") + 1);
    }


    private String getDownloadFilePath() {
        if(TextUtils.isEmpty(downloadPath)) {
            downloadPath = getFilePath(getFilePath(absolutePath, "anim"), "svga");
        }
        return downloadPath;
    }

    private static String getFilePath(String rootPath, String name) {
        String path = rootPath + File.separator + name;
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        return path;
    }

    private File getDownloadFile(String name) {
        String fileName = getDownloadFilePath() + File.separator + name;
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    @Override
    public void onPrepareDownLoad() {
        FileDownLoadManager.OnHttpFileDownLoadListener.super.onPrepareDownLoad();
        Utils.log("onPrepareDownLoad");
    }

    @Override
    public void onCheckHttpFileSize(boolean isCheckSuccess, long fileTotalSize) {
        FileDownLoadManager.OnHttpFileDownLoadListener.super.onCheckHttpFileSize(isCheckSuccess, fileTotalSize);
        Utils.log("onCheckHttpFileSize isCheckSuccess: " + isCheckSuccess + "   fileTotalSize: " + fileTotalSize);
    }

    @NonNull
    @Override
    public long[] onSetRange() {
        Utils.log("onSetRange");
        return FileDownLoadManager.OnHttpFileDownLoadListener.super.onSetRange();
    }

    @Override
    public void onAlreadyDownLoadLength(long length, long total, int progress) {
        FileDownLoadManager.OnHttpFileDownLoadListener.super.onAlreadyDownLoadLength(length, total, progress);
        Utils.log("onAlreadyDownLoadLength length: " + length + "   total: " + total + "   progress: " + progress);
    }

    @Override
    public void onDownLoadSuccess(boolean success, String msg) {
        FileDownLoadManager.OnHttpFileDownLoadListener.super.onDownLoadSuccess(success, msg);
        Utils.log("onCheckHttpFileSize success: " + success + "   msg: " + msg);
    }

}
