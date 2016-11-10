package com.wpmac.androidhero.unit3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.wpmac.androidhero.R;
import com.wpmac.androidhero.unit3.view.TopBar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopBarTestActivity extends AppCompatActivity {


    @BindView(R.id.topBar)
    TopBar mTopBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_bar_test);
        ButterKnife.bind(this);

        mTopBar.setOnTopbarClickListener(new TopBar.topbarClickListener() {
            @Override
            public void leftClick() {
                Toast.makeText(TopBarTestActivity.this,
                        "left", Toast.LENGTH_SHORT)
                        .show();
            }

            @Override
            public void rightClick() {
                Toast.makeText(TopBarTestActivity.this,
                        "right", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        // 控制topbar上组件的状态
        mTopBar.setButtonVisable(0, true);
        mTopBar.setButtonVisable(1, false);
    }
}
