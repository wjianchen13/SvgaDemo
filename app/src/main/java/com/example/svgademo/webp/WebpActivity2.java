package com.example.svgademo.webp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.svgademo.GlideApp;
import com.example.svgademo.R;
import com.example.svgademo.Utils;

public class WebpActivity2 extends AppCompatActivity  {

    private String url = "https://img.ayomet.com/upload/headwear/2023-11-29/34807331dfab1213190e39760ef00581.png?imageslim";
    private String webpUrl = "WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD8F/xDdDw17gu67wXPRClhc5zptKgCq+TwGJxneWGUk1Z3w/SG8wvLEjwftSJtYlPckUFW+sXr9VTsnnLgn/EZV6hNJieaIQM=";
    private String webpUrl1 = "WDEVgFVF9xof4U3NthyHSg1uStOnn9bShxAFMSNXSTD8F/xDdDw17gu67wXPRClhCs90RZseOR13otWJ2YsPpda257joTymT7KCxP1kIJVXLpuHvGf8DCFTsnnLgn/EZV6hNJieaIQM=";
    private ImageView imgvTest1;
    private ImageView imgvTest2;
    private ImageView imgvTest3;
    private ImageView imgvTest4;
    private ImageView imgvTest5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webp2);
        imgvTest1 = findViewById(R.id.imgv_test1);
        imgvTest2 = findViewById(R.id.imgv_test2);
        imgvTest3 = findViewById(R.id.imgv_test3);
        imgvTest4 = findViewById(R.id.imgv_test4);
        imgvTest5 = findViewById(R.id.imgv_test5);
    }

    public void onLoad(View v) {
        String u = Utils.DESAndBase64Decrypt(webpUrl);
//        u = "https://img.ayomet.com/upload/user_tag/2023-11-02/b5f28f2c256c1aacb3c272d6680d0b69.png?imageslim";
        GlideApp.with(this)
                .load(u)
//                .circleCrop()
//                .fitCenter()
                .into(imgvTest1);

        GlideApp.with(this)
                .load(u)
//                .circleCrop()
//                .fitCenter()
                .into(imgvTest2);
        GlideApp.with(this)
                .load(u)
//                .circleCrop()
//                .fitCenter()
                .into(imgvTest3);

        GlideApp.with(this)
                .load(u)
//                .circleCrop()
//                .fitCenter()
                .into(imgvTest4);

        GlideApp.with(this)
                .load(u)
//                .circleCrop()
//                .fitCenter()
                .into(imgvTest5);

    }


}