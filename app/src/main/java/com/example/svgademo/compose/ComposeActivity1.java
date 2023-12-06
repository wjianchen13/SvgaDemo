package com.example.svgademo.compose;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.example.svgademo.GlideApp;
import com.example.svgademo.R;
import com.example.svgademo.Utils;
import com.example.svgademo.cache.okhttp.FileDownLoadManager;
import com.github.penfeizhou.animation.webp.WebPDrawable;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import okhttp3.internal.Util;

public class ComposeActivity1 extends AppCompatActivity implements FileDownLoadManager.OnHttpFileDownLoadListener {

    private static final ExecutorService DOWNLOAD_EXECUTOR = Executors.newFixedThreadPool(4);
    private FileDownLoadManager mFileDownLoadManager;
    private String mUrl = "https://img.ayomet.com/upload/headwear_svga/2023-05-26/f3adf43912c7379decea77d6366d6b03.svga?imageslim";
    private String mUrl2 = "https://img.ayomet.com/upload/headwear_svga/2023-08-25/4b56452adc6e1af2355be1b30740d711.svga?imageslim";
    private String mUrl3 = "https://img.ayomet.com/upload/headwear_svga/2023-08-25/55345517678a7abf9a4cc0e0877d85bf.svga?imageslim";
    private String webpUrl = "https://img.ayomet.com/upload/headwear_webp/2023-11-27/dedf12b12fc8bccd08896dd22b2f6e11.webp?imageslim";
    private SVGAImageView svgaTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose1);
        mFileDownLoadManager = new FileDownLoadManager(this, this);
        svgaTest = findViewById(R.id.svga_test);
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
     * 清理Svga播放状态
     * @param v
     */
    public void onTest3(View v) {
        svgaTest.stopAnimation();
        svgaTest.clear();
    }

    /**
     * 播放Webp动画
     * @param v
     * WebPDrawable
     */
    public void onTest4(View v) {
//        svgaTest.setTag("hello");
//        GlideApp.with(this)
//                .load(webpUrl)
//                .into(svgaTest);
//        Utils.log("tag: " + svgaTest.getTag());

        // 这个可以直接加载WebPDrawable
//        GlideApp.with(this)
//                .asDrawable()
//                .load(webpUrl)
//                .into(new CustomTarget<Drawable>() {
//                    @Override
//                    public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
////                        WebPDrawable d = null;
////                        d.start();
//                        if(svgaTest != null && resource instanceof WebPDrawable) {
//                            ((WebPDrawable) resource).start();
//                            svgaTest.setImageDrawable(resource);
//                        }
//                    }
//
//                    @Override
//                    public void onLoadCleared(@Nullable Drawable placeholder) {
//
//                    }
//                });


        // Glide终端加载图片的过程
        Glide.with(this)
                .asDrawable()
                .load(webpUrl)
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        return true;
                    }
                })
                .into(svgaTest);




//            override fun onLoadFailed(
//                    @Nullable e: GlideException?,
//                    model: Any?,
//                    target: Target<Drawable?>,
//            isFirstResource: Boolean
//                ): Boolean {
//                // 在加载失败时执行的操作
//                return false
//            }
//            override fun onResourceReady(
//                    resource: Drawable,
//                    model: Any,
//                    target: Target<Drawable?>?,
//            dataSource: DataSource,
//                    isFirstResource: Boolean
//                ): Boolean {
//                if (resource is GifDrawable) {
//                    val gifDrawable = resource
//
//                    // 在这里可以对 GifDrawable 进行操作，例如播放、停止动画等
//                    gifDrawable.setLoopCount(GifDrawable.LOOP_FOREVER) // 设置循环次数
//                    gifDrawable.start() // 启动动画
//
//                    // 返回 true，表示已经完全处理了资源，Glide 不再继续默认的设置操作
//                    return true
//                }
//
//                // 返回 false，表示继续 Glide 默认的设置操作
//                return false
//            }
//        })
//            .into(ivHW)
    }

    /**
     * 清理Webp播放状态
     * @param v
     */
    public void onTest5(View v) {
        svgaTest.setImageDrawable(null);
    }


}