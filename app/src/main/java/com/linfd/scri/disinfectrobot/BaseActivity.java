package com.linfd.scri.disinfectrobot;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.stx.xhb.commontitlebar.CustomTitleBar;

/*
*
* */
public  class BaseActivity extends AppCompatActivity {
    protected CustomTitleBar mTopBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        initView();
    }

    public void initView() {
        mTopBar = (CustomTitleBar) findViewById(R.id.titlebar);
        mTopBar.setTitle(R.string.app_name);

    };


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
