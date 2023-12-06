package com.example.svgademo.compose;

import android.content.Context;

import com.example.svgademo.GlideApp;
import com.example.svgademo.cache.manager.AnimData;
import com.example.svgademo.cache.manager.SvgaAnimManager;

public class AnimUtils {

    public static void loadAnim(Context context, AnimData data, ComposeSVGAImageView v) {
        if(context != null && data != null && v != null) {
            if(data.getType() == 1) {
                SvgaAnimManager.getInstance().loadAmin(data.getmUrl(), v);
            } else if(data.getType() == 2) {
                GlideApp.with(context)
                        .load(data.getmUrl())
                        .into(v);
            }
        }

    }

}
