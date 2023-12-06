package com.example.svgademo.compose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.svgademo.GlideApp;
import com.example.svgademo.R;
import com.example.svgademo.cache.MyAdapter3;
import com.example.svgademo.cache.manager.AnimData;
import com.example.svgademo.cache.manager.SvgaAnimManager;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by baoyz on 2014/6/29.
 */
public class ComposeAdapter2 extends RecyclerView.Adapter<ComposeAdapter2.ViewHolder>{

    private WeakReference<Context> mContext;
    private List<AnimData> mDataset;

    public ComposeAdapter2(Context context, List<AnimData> dataset) {
        super();
        mContext = new WeakReference<>(context);
        mDataset = dataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = View.inflate(viewGroup.getContext(), R.layout.item_compose2, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        AnimUtils.loadAnim(mContext.get(), mDataset.get(i), viewHolder.svgaTest);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ComposeSVGAImageView svgaTest;

        public ViewHolder(View itemView) {
            super(itemView);
            svgaTest = itemView.findViewById(R.id.svga_test);
        }
    }
}
