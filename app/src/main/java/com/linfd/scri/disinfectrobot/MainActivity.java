package com.linfd.scri.disinfectrobot;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.linfd.scri.disinfectrobot.entity.DesinStateCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.RobotStatusCallbackEntity;
import com.linfd.scri.disinfectrobot.eventbus.EventMessage;
import com.linfd.scri.disinfectrobot.manager.MapDataObtainManager;
import com.linfd.scri.disinfectrobot.manager.UdpControlSendManager;
import com.linfd.scri.disinfectrobot.manager.UpdateStateControlManager;
import com.linfd.scri.disinfectrobot.view.MyStatusLayout;
import com.linfd.scri.disinfectrobot.view.PinchImageView;
import com.linfd.scri.disinfectrobot.view.SmButton;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

import cn.iwgang.countdownview.CountdownView;
import ezy.ui.view.RoundButton;


public class MainActivity extends BaseActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private WaterWaveView wave_view_electric;
    private RoundButton bt_set, bt_manual, bt_set_action_cmd_pause, bt_set_action_cmd_resume, bt_set_action_cmd_stop;
    private CountdownView countdown_view;
    private PinchImageView pinchImageView;
    private MyStatusLayout status_layout_spary, status_layout_box_spary, status_layout_box_store;

    public void initView() {
        setContentView(R.layout.activity_main);
        wave_view_electric = findViewById(R.id.wave_view_electric);
        bt_set = findViewById(R.id.bt_set);
        countdown_view = findViewById(R.id.countdown_view);
        pinchImageView = findViewById(R.id.iv_bitmap);
        status_layout_spary = findViewById(R.id.status_layout_spary);
        status_layout_box_spary = findViewById(R.id.status_layout_box_spary);
        status_layout_box_store = findViewById(R.id.status_layout_box_store);
        bt_manual = findViewById(R.id.bt_manual);//手动巡航
        bt_set_action_cmd_pause = findViewById(R.id.bt_set_action_cmd_pause);
        bt_set_action_cmd_resume = findViewById(R.id.bt_set_action_cmd_resume);
        bt_set_action_cmd_stop = findViewById(R.id.bt_set_action_cmd_stop);

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
                Log.e("cs", "bitmapFinish()回调MainActivity");
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
            params.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE;
            _window.setAttributes(params);
        }
    }

    @Override
    protected void initListener() {
        super.initListener();
        bt_manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DrawableMapActivity.class);
                startActivity(intent);
            }
        });
        bt_set.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });
        //任务暂停
        bt_set_action_cmd_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast("任务暂停");
                UdpControlSendManager.getInstance().set_action_cmd_pause(Contanst.id, Contanst.to_id);
                bt_set_action_cmd_resume.setVisibility((View.VISIBLE));
                bt_manual.setVisibility(View.GONE);
                bt_set_action_cmd_pause.setVisibility(View.GONE);
                bt_set_action_cmd_stop.setVisibility(View.GONE);

            }
        });
        //任务恢复
        bt_set_action_cmd_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast("任务恢复");
                UdpControlSendManager.getInstance().set_action_cmd_resume(Contanst.id, Contanst.to_id);
                bt_manual.setVisibility(View.GONE);
                bt_set_action_cmd_resume.setVisibility((View.GONE));
                bt_set_action_cmd_pause.setVisibility(View.VISIBLE);
                bt_set_action_cmd_stop.setVisibility(View.VISIBLE);
            }
        });

        //任务停止
        bt_set_action_cmd_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast("任务停止");
                UdpControlSendManager.getInstance().set_action_cmd_stop(Contanst.id, Contanst.to_id);
                bt_set_action_cmd_resume.setVisibility((View.GONE));
                bt_manual.setVisibility(View.VISIBLE);
                bt_set_action_cmd_pause.setVisibility(View.GONE);
                bt_set_action_cmd_stop.setVisibility(View.GONE);
            }
        });
    }

    @Override
    protected void initData() {

        countdown_view.updateShow(60 * 1000);
        //status_layout_spary.changeStatus(2);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        String action_key = intent.getAction();
        if (action_key == Contanst.KEY_SHOW01) {
            bt_manual.setVisibility(View.GONE);
            bt_set_action_cmd_resume.setVisibility((View.GONE));
            bt_set_action_cmd_pause.setVisibility(View.VISIBLE);
            bt_set_action_cmd_stop.setVisibility(View.VISIBLE);

        } else {
            bt_set_action_cmd_resume.setVisibility((View.GONE));
            bt_manual.setVisibility(View.VISIBLE);
            bt_set_action_cmd_pause.setVisibility(View.GONE);
            bt_set_action_cmd_stop.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    /*
     * 接收消毒状态
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(DesinStateCallbackEntity entity) {
        // Log.e(TAG, "onReceiveMsg: " + entity.toString());
        status_layout_spary.changeStatus(entity.getSpray_level());
        status_layout_box_spary.changeStatus(entity.getBox_spary());
        status_layout_box_store.changeStatus(entity.getBox_store());
        countdown_view.updateShow((int) entity.getDisin_time());
    }

    /*
     * 接收机器人状态
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(RobotStatusCallbackEntity entity) {
        wave_view_electric.setmWaterLevel((float) (entity.getBattery_percent() / 1000));//(float) (entity.getBattery_percent()/10)
    }

}
