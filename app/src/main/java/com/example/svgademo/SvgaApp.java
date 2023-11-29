package com.example.svgademo;

import android.app.Application;
import android.content.Context;

import com.opensource.svgaplayer.SVGAParser;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SvgaApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SVGAParser.Companion.shareParser().init(this);
        SVGAParser.Companion.setThreadPoolExecutor(new ThreadPoolExecutor(2, 2,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(),
                 new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "SVGAParser-Thread-${threadNum.getAndIncrement()}");
            }
        }));
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

}