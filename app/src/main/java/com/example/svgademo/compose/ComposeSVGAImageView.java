package com.example.svgademo.compose;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.opensource.svgaplayer.SVGAImageView;

public class ComposeSVGAImageView extends SVGAImageView {

    /**
     * 用作tag用
     */
    private Object obj;

    public ComposeSVGAImageView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ComposeSVGAImageView(@NonNull Context context) {
        super(context);
    }

    public ComposeSVGAImageView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



}
