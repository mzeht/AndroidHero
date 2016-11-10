package com.wpmac.androidhero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wpmac.androidhero.unit3.Unit3Activity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /**
     *  第三章 Android控件架构与自定义控件详解
     */
    @OnClick(R.id.unit3)
    void unit3(){

        Intent intent=new Intent(getApplicationContext(), Unit3Activity.class);
        startActivity(intent);
    }
}
