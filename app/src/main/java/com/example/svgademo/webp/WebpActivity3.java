package com.example.svgademo.webp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svgademo.R;
import com.example.svgademo.Utils;
import com.example.svgademo.cache.MyAdapter3;
import com.example.svgademo.cache.manager.AnimData;
import com.example.svgademo.cache.manager.SvgaAnimManager;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 列表加载Webp
 */
public class WebpActivity3 extends AppCompatActivity {

    private WebpAdapter3 adapter;

    private LinearLayoutManager layoutManager;
    private RecyclerView rvWebp;

    private String mUrl1 = "https://img.ayomet.com/upload/headwear_svga/2023-05-26/f3adf43912c7379decea77d6366d6b03.svga?imageslim";
    private String mUrl2 = "https://img.ayomet.com/upload/headwear_svga/2023-08-25/4b56452adc6e1af2355be1b30740d711.svga?imageslim";
    private String mUrl3 = "https://img.ayomet.com/upload/headwear_svga/2023-08-25/55345517678a7abf9a4cc0e0877d85bf.svga?imageslim";
    private String mUrl4 = "https://img.ayomet.com/upload/headwear_svga/2023-08-25/ffc376e7925b8ddb76f4243cf8a13cb9.svga?imageslim";
    private String mUrl5 = "https://img.ayomet.com/upload/headwear_svga/2023-10-12/a16e0f8f15d0d00caf94306608e84f6d.svga?imageslim";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webp3);
        SvgaAnimManager.getInstance().init(this);
        initRv();
    }

    public void initRv(){
        rvWebp = findViewById(R.id.rv_svga);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvWebp.setLayoutManager(layoutManager);
//        List<String> datas = new ArrayList<>();
//        String s1 = mUrl1;
//        datas.add(s1);
//        String s2 = mUrl2;
//        datas.add(s2);
//        String s3 = mUrl3;
//        datas.add(s3);
//        String s4 = mUrl4;
//        datas.add(s4);
//        String s5 = mUrl5;
//        datas.add(s5);
    }

    public void onTest1(View v) {
        List<AnimData> list = new ArrayList<>();
        for(int i = 0; i < 100; i ++) {
            AnimData data = new AnimData();
            data.setmUrl("https://img.ayomet.com/upload/headwear_webp/2023-11-27/dedf12b12fc8bccd08896dd22b2f6e11.webp?imageslim");
            list.add(data);
        }
        adapter = new WebpAdapter3(this, list);
        rvWebp.setAdapter(adapter);
    }



}