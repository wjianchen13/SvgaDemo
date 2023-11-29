package com.example.svgademo.cache;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.svgademo.R;
import com.example.svgademo.Utils;
import com.example.svgademo.cache.manager.SvgaAnimManager;
import com.example.svgademo.cache.okhttp.FileDownLoadManager;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheActivity1 extends AppCompatActivity implements FileDownLoadManager.OnHttpFileDownLoadListener {

    private static final ExecutorService DOWNLOAD_EXECUTOR = Executors.newFixedThreadPool(4);
    private FileDownLoadManager mFileDownLoadManager;
    private String mUrl = "https://img.ayomet.com/upload/headwear_svga/2023-05-26/f3adf43912c7379decea77d6366d6b03.svga?imageslim";
    private String mUrl2 = "https://img.ayomet.com/upload/headwear_svga/2023-08-25/4b56452adc6e1af2355be1b30740d711.svga?imageslim";
    private String mUrl3 = "https://img.ayomet.com/upload/headwear_svga/2023-08-25/55345517678a7abf9a4cc0e0877d85bf.svga?imageslim";
    private SVGAImageView svgaTest;
    private SVGAImageView svgaTest2;
    private SVGAImageView svgaTest3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cache1);
        mFileDownLoadManager = new FileDownLoadManager(this, this);
        svgaTest = findViewById(R.id.svga_test);
        svgaTest2 = findViewById(R.id.svga_test2);
        svgaTest3 = findViewById(R.id.svga_test3);
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

    /**
     * 下载svga文件
     * @param v
     */
    public void onTest1(View v) {
        DOWNLOAD_EXECUTOR.execute(new Runnable() {
            @Override
            public void run() {
                mFileDownLoadManager.executeHttpFile(getFileName("hello.svga"), mUrl, "");
            }
        });
    }

    private String getDownloadFilePath() {
        return getFilePath(getFilePath(getFilesDir().getAbsolutePath(), "anim"), "svga");
    }

    private static String getFilePath(String rootPath, String name) {
        String path = rootPath + File.separator + name;
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        return path;
    }

    private File getFileName(String name) {
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

    /**
     * Svga 播放svga动画1
     * @param v
     */
    public void onTest2(View v) {
        try {
            String name = getDownloadFilePath() + File.separator + "hello.svga";
            SVGAParser svgaParser = SVGAParser.Companion.shareParser();
            File animFile = getFileName("hello.svga");
            FileInputStream fileInputStream = new FileInputStream(animFile);
            if (svgaParser != null) {
                svgaParser.decodeFromInputStream(fileInputStream, name, new SVGAParser.ParseCompletion() {
                    @Override
                    public void onComplete(SVGAVideoEntity svgaVideoEntity) {
                        try {
                            svgaTest.setVideoItem(svgaVideoEntity);
                            svgaTest.stepToFrame(0, true);

                        } catch (Exception e) {
                            e.printStackTrace();

                        }
                    }

                    @Override
                    public void onError() {

                    }
                }, true, null, name);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Svga 播放svga动画2
     * @param v
     */
    public void onTest3(View v) {
        SvgaAnimManager.getInstance().init(this);
        SvgaAnimManager.getInstance().loadAnim(mUrl, svgaTest2, new SVGAParser.ParseCompletion() {
            @Override
            public void onComplete(@NonNull SVGAVideoEntity svgaVideoEntity) {
                try {
                    svgaTest2.setVideoItem(svgaVideoEntity);
                    svgaTest2.stepToFrame(0, true);
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }

            @Override
            public void onError() {

            }
        });

    }

    /**
     * Svga 播放svga动画3
     * @param v
     */
    public void onTest4(View v) {
        SvgaAnimManager.getInstance().init(this);
        SvgaAnimManager.getInstance().loadAnim(mUrl3, svgaTest3, new SVGAParser.ParseCompletion() {
            @Override
            public void onComplete(@NonNull SVGAVideoEntity svgaVideoEntity) {
                try {
                    svgaTest3.setVideoItem(svgaVideoEntity);
                    svgaTest3.stepToFrame(0, true);
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