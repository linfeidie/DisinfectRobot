package com.linfd.scri.disinfectrobot;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.linfd.scri.disinfectrobot.entity.ApmtStateCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.ChargerPoseCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.DataEntity;
import com.linfd.scri.disinfectrobot.entity.DesinStateCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.LoginCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.MachTypeCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.OnlineIdsCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.RobotAckCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.RobotStatusCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.SetBindCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.SetHeartbeatCallbackEntity;
import com.linfd.scri.disinfectrobot.listener.SimpleUdpListener;
import com.linfd.scri.disinfectrobot.manager.HeartbeatManager;
import com.linfd.scri.disinfectrobot.manager.MapDataObtainManager;
import com.linfd.scri.disinfectrobot.manager.TimerManager;
import com.linfd.scri.disinfectrobot.manager.UdpControlSendManager;
import com.linfd.scri.disinfectrobot.manager.UpdateStateControlManager;
import com.linfd.scri.disinfectrobot.observer.DataChanger;
import com.linfd.scri.disinfectrobot.observer.DataWatcher;
import com.linfd.scri.disinfectrobot.view.PinchImageView;
import com.linfd.scri.disinfectrobot.view.SmButton;

import java.util.List;

import cn.iwgang.countdownview.CountdownView;
import ezy.ui.view.RoundButton;


public class MainActivity extends BaseActivity {
    private WaterWaveView wave_view_electric,wave_view_water;
    private RoundButton bt_set;
    private CountdownView countdown_view;
    private PinchImageView pinchImageView;
    private RoundButton tv_get_map;

    public void initView() {
        setContentView(R.layout.activity_main);
        wave_view_electric = findViewById(R.id.wave_view_electric);
        wave_view_water = findViewById(R.id.wave_view_water);
        bt_set = findViewById(R.id.bt_set);
        countdown_view = findViewById(R.id.countdown_view);
        pinchImageView = findViewById(R.id.iv_bitmap);
        tv_get_map = findViewById(R.id.tv_get_map);
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

        UpdateStateControlManager.getInstance().setBitmapCallback(new UpdateStateControlManager.BitmapCallback() {
            @Override
            public void bitmapFinish(Bitmap bitmap) {
                //currentBitmap = bitmap;
                pinchImageView.setImageBitmap(bitmap);
            }
        });
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
    protected void initListener() {
        super.initListener();
        /*
         * 获取地图
         * */
        tv_get_map.setOnClickListener(new SmButton.OnSmClickListener() {
            @Override
            public void onSmClick(View v) {
               // Tools.showToast("获取地图");
                //pinchImageView.setImageBitmap(Tools.drawableToBitmap(getResources().getDrawable(R.drawable.logo)));
                //MapDataObtainManager.getInstance().start();
                UdpControlSendManager.getInstance().get_charger_pose(Contanst.id,Contanst.to_id);

            }
        });
    }

    @Override
    protected void initData() {
        wave_view_electric.startWave();
        wave_view_water.startWave();
        bt_set.setOnClickListener(new View.OnClickListener() {
            LooperRunnable r = new LooperRunnable() {
                @Override
                public void call() {
                    UdpControlSendManager.getInstance().get_robot_status(Contanst.id,Contanst.to_id);
                }
            };
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,SettingActivity.class);
//                startActivity(intent);
                Tools.showToast("机器人状态");
                TimerManager.getInstance().start(r);


            }
        });
        countdown_view.start(995550000);
        setCallBack();

    }

    private void setCallBack() {
        UdpControlSendManager.getInstance().addUdpClientListener(new SimpleUdpListener());
    }
}
