package com.linfd.scri.disinfectrobot;

import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import cn.iwgang.countdownview.CountdownView;
import ezy.ui.view.RoundButton;


public class MainActivity extends BaseActivity {
    private WaterWaveView wave_view_electric,wave_view_water;
    private RoundButton bt_set;
    private CountdownView countdown_view;

    public void initView() {
        setContentView(R.layout.activity_main);
        wave_view_electric = findViewById(R.id.wave_view_electric);
        wave_view_water = findViewById(R.id.wave_view_water);
        bt_set = findViewById(R.id.bt_set);
        countdown_view = findViewById(R.id.countdown_view);
        super.initView();

//        mTopBar.addRightImageButton(R.mipmap.ic_setting,R.id.topbar_right_button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,SettingActivity.class);
//                startActivity(intent);
//            }
//        });
//        mTopBar.setTitle("正在开启");
//        mTopBar.setSubTitle("电量:85%");
        mTopBar.setVisibility(View.GONE);
        //hideBottomMenu();
        //hideBottomUIMenu(); 使用这个
    }
    protected void hideBottomMenu() {
        //隐藏虚拟按键，并且全屏
        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) { // lower api
            View v = this.getWindow().getDecorView();
            v.setSystemUiVisibility(View.GONE);
        } else if (Build.VERSION.SDK_INT >= 19) {
            //for new api versions.
            View decorView = getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }

    protected void hideBottomUIMenu() {
        //隐藏虚拟按键，并且全屏
        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) { // lower api
            View v = this.getWindow().getDecorView();
            v.setSystemUiVisibility(View.GONE);
        } else if (Build.VERSION.SDK_INT >= 19) {

            Window _window = getWindow();
            WindowManager.LayoutParams params = _window.getAttributes();
            params.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|View.SYSTEM_UI_FLAG_IMMERSIVE;
            _window.setAttributes(params);
        }
    }

    @Override
    protected void initData() {
        wave_view_electric.startWave();
        wave_view_water.startWave();
        bt_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SettingActivity.class);
                startActivity(intent);
            }
        });
        //countdown_view.start(995550000);
        for (int time=0; time<1000; time++) {
            countdown_view.updateShow(time);
        }
    }
}
