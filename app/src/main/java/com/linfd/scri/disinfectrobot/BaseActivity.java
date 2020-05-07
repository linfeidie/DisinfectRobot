package com.linfd.scri.disinfectrobot;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import com.stx.xhb.commontitlebar.CustomTitleBar;
import com.td.framework.module.dialog.DialogHelper;
import com.td.framework.module.dialog.inf.OnDialogCancelListener;

/*
*
* */
public  class BaseActivity extends AppCompatActivity implements OnDialogCancelListener {
    protected CustomTitleBar mTopBar;
    protected DialogHelper mDialogHelper;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        initView();
        if (mDialogHelper == null) {
            mDialogHelper = new DialogHelper(BaseActivity.this, this);
        }
        initListener();
        initData();
    }

    protected void initData() {
    }
    protected void initListener(){

    };
    public void initView() {
        mTopBar = (CustomTitleBar) findViewById(R.id.titlebar);
        mTopBar.setTitle(R.string.app_name);

    };


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDialogCancelListener(AlertDialog dialog) {

    }
}
