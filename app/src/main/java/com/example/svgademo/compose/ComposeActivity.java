package com.example.svgademo.compose;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.svgademo.R;
import com.example.svgademo.cache.CacheActivity1;
import com.example.svgademo.cache.CacheActivity2;
import com.example.svgademo.cache.CacheActivity3;

public class ComposeActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);
    }

    /**
     * 单个测试
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, ComposeActivity1.class));
    }

    /**
     * 列表
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, ComposeActivity2.class));
    }


}