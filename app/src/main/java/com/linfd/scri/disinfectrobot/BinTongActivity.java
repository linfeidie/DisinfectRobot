package com.linfd.scri.disinfectrobot;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

import com.daimajia.numberprogressbar.NumberProgressBar;
import com.linfd.scri.disinfectrobot.entity.DesinStateCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.ExceptionCodesCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.ExceptionEntity;
import com.linfd.scri.disinfectrobot.entity.RobotStatusCallbackEntity;
import com.linfd.scri.disinfectrobot.manager.ExceptionCodesHelper;
import com.linfd.scri.disinfectrobot.manager.UdpControlSendManager;
import com.linfd.scri.disinfectrobot.nicedialog.NiceDialog;
import com.linfd.scri.disinfectrobot.view.MyStatusLayout;
import com.linfd.scri.disinfectrobot.view.PinchImageView;
import com.linfd.scri.disinfectrobot.view.battery.BaseHandlerCallBack;
import com.linfd.scri.disinfectrobot.view.battery.PowerConsumptionRankingsBatteryView;
import com.linfd.scri.disinfectrobot.view.recyclerviewpoll.AutoPollAdapter;
import com.linfd.scri.disinfectrobot.view.recyclerviewpoll.AutoPollRecyclerView;
import com.td.framework.module.dialog.inf.OnDialogConfirmListener;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import cn.iwgang.countdownview.CountdownView;

public class BinTongActivity extends  BaseActivity implements BaseHandlerCallBack  {

    public static final String TAG = BinTongActivity.class.getSimpleName();
    private PowerConsumptionRankingsBatteryView mPowerConsumptionRankingsBatteryView;
    private NumberProgressBar numberProgressBar;
    private CountdownView countdown_view;
    private MyStatusLayout status_layout_spary, status_layout_box_store;
    private AutoPollRecyclerView mRecyclerView;
    private int power;

    private NoLeakHandler mHandler;
    private AutoPollAdapter adapter;


    @Override
    public void initView() {
        setContentView(R.layout.activity_bintong);
        mHandler = new NoLeakHandler(this);
        mPowerConsumptionRankingsBatteryView = (PowerConsumptionRankingsBatteryView) findViewById(R.id.mPowerConsumptionRankingsBatteryView);
        countdown_view = findViewById(R.id.countdown_view);
        status_layout_spary = findViewById(R.id.status_layout_spary);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
               // mHandler.sendEmptyMessage(0);
            }
        }, 0, 100);
        super.initView();
        mTopBar.setVisibility(View.GONE);
        hideBottomMenu();


        mRecyclerView = (AutoPollRecyclerView) findViewById(R.id.recycleView);

        adapter = new AutoPollAdapter();
        adapter.setOnItemClickListener(new AutoPollAdapter.OnItemClickListener() {
            @Override
            public void onClick(ExceptionEntity entity) {
               // Tools.showToast(entity.toString());
                NiceDialog.init().setLayoutId(R.layout.dialog_exception).setWidth(300).setHeight(250).setPosition(Gravity.CENTER).show(getSupportFragmentManager());
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        mRecyclerView.setAdapter(adapter);
        mRecyclerView.start();
    }

    @Override
    protected void onStart() {
        super.onStart();

        List<Integer> list = new ArrayList<>();
        list.add(10101);
        list.add(21101);
        List<ExceptionEntity> entities = ExceptionCodesHelper.instance.obtainExceptionEntitys(list);
        adapter.setmData(entities);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHandler.removeCallbacksAndMessages(null);
        if(null != mRecyclerView){
            mRecyclerView.stop();
        }
    }

    @Override
    public void callBack(Message msg) {
        switch (msg.what) {
            case 0:
                mPowerConsumptionRankingsBatteryView.setLevelHeight(power += 5);
                if (power == 100) {
                    power = 0;
                }
//                if (power < 30) {
//                    mPowerConsumptionRankingsBatteryView.setLowerPower();
//                } else if (power < 60) {
//                    mPowerConsumptionRankingsBatteryView.setOffline();
//                } else {
//                    mPowerConsumptionRankingsBatteryView.setOnline();
//                }
                break;
            default:
                break;
        }
    }



    private static class NoLeakHandler<T extends BaseHandlerCallBack> extends Handler {
        private WeakReference<T> wr;

        public NoLeakHandler(T t) {
            wr = new WeakReference<>(t);
        }

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            T t = wr.get();
            if (t != null) {
                t.callBack(msg);
            }
        }
    }
    /*
     * 接收机器人状态
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(RobotStatusCallbackEntity entity) {
       // wave_view_electric.setmWaterLevel((float) (entity.getBattery_percent() / 1000));//(float) (entity.getBattery_percent()/10)
        mPowerConsumptionRankingsBatteryView.setLevelHeight((int)entity.getBattery_percent());
        //如果有异常字段为真
        if (entity.isException()){
            //获取异常
            UdpControlSendManager.getInstance().get_robot_exception(Contanst.id,Contanst.to_id);
        };
    }

    /*
     * 接收消毒状态
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(DesinStateCallbackEntity entity) {
        // Log.e(TAG, "onReceiveMsg: " + entity.toString());
        status_layout_spary.changeStatus(entity.getSpray_level());
        status_layout_box_store.changeStatus(entity.getBox_store());
        countdown_view.updateShow((int) entity.getDisin_time() * 1000);
    }

    /*
     * 接收异常代码
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(ExceptionCodesCallbackEntity entity) {
        Tools.showToast("异常出现了："+ entity.getCodes().toString());
    }
}
