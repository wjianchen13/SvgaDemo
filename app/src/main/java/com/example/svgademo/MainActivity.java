package com.example.svgademo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.svgademo.base.SvgaActivity;
import com.example.svgademo.cache.CacheActivity;
import com.example.svgademo.compose.ComposeActivity;
import com.example.svgademo.glide.GlideActivity;
import com.example.svgademo.webp.WebpActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTest1(View v) {
        startActivity(new Intent(this, SvgaActivity.class));
    }

    /**
     * Svga 动画缓存
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, CacheActivity.class));
    }

    /**
     * Webp动画
     * @param v
     */
    public void onTest3(View v) {
        startActivity(new Intent(this, WebpActivity.class));
    }

    /**
     * Glide加载图片
     * @param v
     */
    public void onTest4(View v) {
        startActivity(new Intent(this, GlideActivity.class));
    }

    /**
     * Svga webp 动画组合测试
     * @param v
     */
    public void onTest5(View v) {
        startActivity(new Intent(this, ComposeActivity.class));
    }


}