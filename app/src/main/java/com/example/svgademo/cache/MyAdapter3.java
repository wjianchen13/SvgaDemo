package com.example.svgademo.cache;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.svgademo.R;
import com.example.svgademo.cache.manager.AnimData;
import com.example.svgademo.cache.manager.SvgaAnimManager;
import com.opensource.svgaplayer.SVGAImageView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by baoyz on 2014/6/29.
 */
public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.ViewHolder>{

    private WeakReference<Context> mContext;
    private List<AnimData> mDataset;

    public MyAdapter3(Context context, List<AnimData> dataset) {
        super();
        mContext = new WeakReference<>(context);
        mDataset = dataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = View.inflate(viewGroup.getContext(), R.layout.item_svga3, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        SvgaAnimManager.getInstance().loadAmin(mDataset.get(i).getmUrl(), viewHolder.svgaTest);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public SVGAImageView svgaTest;

        public ViewHolder(View itemView) {
            super(itemView);
            svgaTest = (SVGAImageView) itemView.findViewById(R.id.svga_test);
        }
    }
}
