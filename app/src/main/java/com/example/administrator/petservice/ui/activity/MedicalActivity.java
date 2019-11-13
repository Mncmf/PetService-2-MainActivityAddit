package com.example.administrator.petservice.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.administrator.petservice.R;
import com.example.administrator.petservice.ui.adapter.RecommedFoodAdapter;
import com.example.administrator.petservice.widget.BannerLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import static com.example.administrator.petservice.ui.utils.ImageUtil.imageUrls;


public class MedicalActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView map,backButton;
    private RecyclerView recommendFoodRecyclerView;
    private Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 去除顶部标题栏
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_medical);

        initView();
        initData();
        initListener();
    }

    private void initView(){
        map = findViewById(R.id.iv_map);
        backButton = findViewById(R.id.iv_back);
    }

    private void initData(){


    }


    private void initListener(){
        map.setOnClickListener(this);
        backButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch ((view.getId())){
            case R.id.iv_map:
                intent = new Intent(this,MapActivity.class);
                startActivity(intent);
                break;
            case R.id.iv_back:
                intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                finish();
                break;
            default:
                break;
        }
    }
}
