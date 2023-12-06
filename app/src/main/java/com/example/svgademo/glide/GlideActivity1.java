package com.example.svgademo.glide;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.svgademo.GlideApp;
import com.example.svgademo.R;
import com.example.svgademo.Utils;

public class GlideActivity1 extends AppCompatActivity  {

    private String url = "https://img.ayomet.com/upload/headwear/2023-11-29/34807331dfab1213190e39760ef00581.png?imageslim";
    private String webpUrl = "WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD8F/xDdDw17gu67wXPRClhc5zptKgCq+TwGJxneWGUk1Z3w/SG8wvLEjwftSJtYlPckUFW+sXr9VTsnnLgn/EZV6hNJieaIQM=";
    private String webpUrl1 = "WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD8F/xDdDw17gu67wXPRClhCs90RZseOR13otWJ2YsPpda257joTymT7KCxP1kIJVXLpuHvGf8DCFTsnnLgn/EZV6hNJieaIQM=";
    private ImageView imgvTest;
    private ImageView imgvTest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide1);
        imgvTest = findViewById(R.id.imgv_test);
        imgvTest2 = findViewById(R.id.imgv_test2);
    }

    public void onLoad(View v) {
//        String u = Utils.DESAndBase64Decrypt(webpUrl1);
//        String u = "https://img.ayomet.com/images/default_headimage/v1/head_1_4.png";
        String u = "https://cdn.blog.fonepaw.com/images/animated-gif-wallpaper.gif";
        GlideApp.with(this)
                .load(u)
                .circleCrop()
//                .fitCenter()
                .into(imgvTest);
    }

    public void onLoad2(View v) {
//        String u = Utils.DESAndBase64Decrypt(webpUrl1);
//        String u = "https://img.ayomet.com/images/default_headimage/v1/head_1_4.png";
//        GlideApp.with(this)
//                .load(u)
//                .circleCrop()
////                .fitCenter()
//                .into(imgvTest2);
        String u = "https://cdn.blog.fonepaw.com/images/animated-gif-wallpaper.gif";
        RequestOptions options = new RequestOptions()
                .transforms(new CenterCrop(), new RoundedCorners(20));
        Glide.with(this).load(u).centerCrop().apply(options).into(imgvTest2);
    }
}