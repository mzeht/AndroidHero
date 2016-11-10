package com.wpmac.androidhero.unit3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wpmac.androidhero.R;


/**
 * 第三章 Android控件架构与自定义控件详解
 *
 * @author wpmac
 */
public class Unit3Activity extends AppCompatActivity {


    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit3);
//        mIntent = new Intent(this, MyViewTestActivity.class);
    }

    public void btnTeaching(View view) {
        mIntent = new Intent(this, TeachingViewActivity.class);
        startActivity(mIntent);

    }

    public void btnMyTextView(View view) {
        mIntent = new Intent(this, MyTextViewActivity.class);
        startActivity(mIntent);
    }

    public void btnShineTextView(View view) {
        mIntent = new Intent(this, ShineTextViewActivity.class);
        startActivity(mIntent);
    }

    public void btnCircleProgress(View view) {
        mIntent = new Intent(this, CircleProgressActivity.class);
        startActivity(mIntent);
    }
//
    public void btnVolumeView(View view) {
        mIntent=new Intent(this,VolumeViewActivity.class);
        startActivity(mIntent);
    }
//
    public void btnMyScrollView(View view) {
        mIntent=new Intent(this,ScrollViewActivity.class);
        startActivity(mIntent);
    }

    public void btnTopBar(View view) {
        startActivity(new Intent(this, TopBarTestActivity.class));
    }
}
