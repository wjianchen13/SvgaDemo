package com.example.svgademo.glide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.svgademo.R;
import com.example.svgademo.cache.CacheActivity2;
import com.example.svgademo.cache.CacheActivity3;
import com.example.svgademo.webp.WebpActivity1;

public class GlideActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
    }

    /**
     * 加载图片测试
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, GlideActivity1.class));
    }

    /**
     * 多个测试
     * @param v
     */
    public void onTest2(View v) {

    }

    /**
     * 列表
     * @param v
     */
    public void onTest3(View v) {

    }


}