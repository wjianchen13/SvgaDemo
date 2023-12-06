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

public class CacheActivity2 extends AppCompatActivity {

    private static final ExecutorService DOWNLOAD_EXECUTOR = Executors.newFixedThreadPool(4);

    private String mUrl = "https://img.ayomet.com/upload/headwear_svga/2023-05-26/f3adf43912c7379decea77d6366d6b03.svga?imageslim";
    private String mUrl2 = "https://img.ayomet.com/upload/headwear_svga/2023-08-25/4b56452adc6e1af2355be1b30740d711.svga?imageslim";
    private String mUrl3 = "https://img.ayomet.com/upload/headwear_svga/2023-08-25/55345517678a7abf9a4cc0e0877d85bf.svga?imageslim";
    private String mUrl4 = "https://img.ayomet.com/upload/headwear_svga/2023-08-25/ffc376e7925b8ddb76f4243cf8a13cb9.svga?imageslim";
    private String mUrl5 = "https://img.ayomet.com/upload/headwear_svga/2023-10-12/a16e0f8f15d0d00caf94306608e84f6d.svga?imageslim";
    private SVGAImageView svgaTest;
    private SVGAImageView svgaTest2;
    private SVGAImageView svgaTest3;
    private SVGAImageView svgaTest4;
    private SVGAImageView svgaTest5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cache2);
        SvgaAnimManager.getInstance().init(this);
        svgaTest = findViewById(R.id.svga_test);
        svgaTest2 = findViewById(R.id.svga_test2);
        svgaTest3 = findViewById(R.id.svga_test3);
        svgaTest4 = findViewById(R.id.svga_test4);
        svgaTest5 = findViewById(R.id.svga_test5);
    }

    /**
     * 下载svga文件
     * @param v
     */
    public void onTest1(View v) {
        SvgaAnimManager.getInstance().loadAmin(mUrl, svgaTest);
        SvgaAnimManager.getInstance().loadAmin(mUrl2, svgaTest2);
        SvgaAnimManager.getInstance().loadAmin(mUrl3, svgaTest3);
        SvgaAnimManager.getInstance().loadAmin(mUrl4, svgaTest4);
        SvgaAnimManager.getInstance().loadAmin(mUrl5, svgaTest5);
    }



}