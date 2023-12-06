package com.example.svgademo.webp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.svgademo.GlideApp;
import com.example.svgademo.R;
import com.example.svgademo.cache.manager.AnimData;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by baoyz on 2014/6/29.
 */
public class WebpAdapter3 extends RecyclerView.Adapter<WebpAdapter3.ViewHolder>{

    private WeakReference<Context> mContext;
    private List<AnimData> mDataset;

    public WebpAdapter3(Context context, List<AnimData> dataset) {
        super();
        mContext = new WeakReference<>(context);
        mDataset = dataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = View.inflate(viewGroup.getContext(), R.layout.item_webp, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        GlideApp.with(mContext.get())
                .load(mDataset.get(i).getmUrl())
//                .circleCrop()
//                .fitCenter()
                .into(viewHolder.imgvTest);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgvTest;

        public ViewHolder(View itemView) {
            super(itemView);
            imgvTest = (ImageView) itemView.findViewById(R.id.imgv_test);
        }
    }
}
