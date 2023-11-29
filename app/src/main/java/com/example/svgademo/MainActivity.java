package com.example.svgademo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.svgademo.base.SvgaActivity;
import com.example.svgademo.cache.CacheActivity;

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

}