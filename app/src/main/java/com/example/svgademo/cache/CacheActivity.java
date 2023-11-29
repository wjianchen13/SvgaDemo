package com.example.svgademo.cache;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.svgademo.R;

public class CacheActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cache);
    }

    /**
     * 单个测试
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, CacheActivity1.class));
    }

    /**
     * 多个测试
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, CacheActivity2.class));
    }

    /**
     * 列表
     * @param v
     */
    public void onTest3(View v) {
        startActivity(new Intent(this, CacheActivity3.class));
    }


}