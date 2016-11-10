package com.wpmac.androidhero.unit3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wpmac.androidhero.R;
import com.wpmac.androidhero.unit3.view.CircleProgressView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CircleProgressActivity extends AppCompatActivity {

    @BindView(R.id.circle)
    CircleProgressView mCircleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_progress);
        ButterKnife.bind(this);
        mCircleProgressView.setSweepValue(0);
    }
}
