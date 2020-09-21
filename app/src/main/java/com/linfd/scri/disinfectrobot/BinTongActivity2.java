package com.linfd.scri.disinfectrobot;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.numberprogressbar.NumberProgressBar;
import com.linfd.scri.disinfectrobot.entity.DesinStateCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.ExceptionCodesCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.ExceptionEntity;
import com.linfd.scri.disinfectrobot.entity.RobotStatusCallbackEntity;
import com.linfd.scri.disinfectrobot.manager.AckListenerService;
import com.linfd.scri.disinfectrobot.manager.ExceptionCodesHelper;
import com.linfd.scri.disinfectrobot.manager.UdpControlSendManager;
import com.linfd.scri.disinfectrobot.nicedialog.BaseNiceDialog;
import com.linfd.scri.disinfectrobot.nicedialog.NiceDialog;
import com.linfd.scri.disinfectrobot.nicedialog.ViewConvertListener;
import com.linfd.scri.disinfectrobot.nicedialog.ViewHolder;
import com.linfd.scri.disinfectrobot.view.MyStatusLayout;
import com.linfd.scri.disinfectrobot.view.battery.BaseHandlerCallBack;
import com.linfd.scri.disinfectrobot.view.battery.PowerConsumptionRankingsBatteryView;
import com.linfd.scri.disinfectrobot.view.recyclerviewpoll.AutoPollAdapter;
import com.linfd.scri.disinfectrobot.view.recyclerviewpoll.AutoPollRecyclerView;
import com.td.framework.module.dialog.DialogHelper;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import cn.iwgang.countdownview.CountdownView;
import ezy.ui.view.RoundButton;
import fj.mtsortbutton.lib.DynamicSoreView;
import fj.mtsortbutton.lib.Interface.IDynamicSore;

public class BinTongActivity2 extends  BaseActivity   implements IDynamicSore, BaseHandlerCallBack {

    public static final String TAG = BinTongActivity2.class.getSimpleName();

    private DynamicSoreView dynamicSoreView;
    private List buttonList;
    private TextView tv_exception;
    private List<ExceptionEntity> entities;
    private PowerConsumptionRankingsBatteryView mBatteryView;
    private BinTongActivity2.NoLeakHandler mHandler;
    private int power;
    private boolean isCharge = false;// 是否在充电
    private TextView tv_power;
    private CountdownView countdown_view;
    private MyStatusLayout status_layout_spary, status_layout_box_store;
    @Override
    public void initView() {
        setContentView(R.layout.activity_bintong2);
        dynamicSoreView = findViewById(R.id.dynamicSoreView);
        tv_exception = findViewById(R.id.tv_exception);
        mBatteryView = findViewById(R.id.mPowerConsumptionRankingsBatteryView);
        countdown_view = findViewById(R.id.countdown_view);
        mHandler = new BinTongActivity2.NoLeakHandler(this);
        tv_power = findViewById(R.id.tv_power);
        status_layout_spary = findViewById(R.id.status_layout_spary);
        status_layout_box_store = findViewById(R.id.status_layout_box_store);
        data();
        super.initView();
        mTopBar.setVisibility(View.GONE);
        hideBottomMenu();


    }
    private void data(){
        buttonList = setData();//模拟服务器获取到的按钮列表
        //设置界面监听
        dynamicSoreView.setiDynamicSore(this);
        //控件相关设置
        dynamicSoreView.setGridView(R.layout.viewpager_page).init(buttonList);
    }
    @Override
    protected void initListener() {
        super.initListener();
        tv_exception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        List<Integer> list = new ArrayList<>();
        list.add(99999);
        list.add(12405);
        ExceptionCodesCallbackEntity entity = new ExceptionCodesCallbackEntity();
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        entity.setNums(list2);
        entity.setCodes(list);
        List<Integer> list3 = new ArrayList<>();
        list3.add(145455);
        list3.add(334636);
        entity.setStamps(list3);


        entities = ExceptionCodesHelper.instance.obtainExceptionEntitys(entity);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }


    /*
     * 接收机器人状态
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(RobotStatusCallbackEntity entity) {
// wave_view_electric.setmWaterLevel((float) (entity.getBattery_percent() / 1000));//(float) (entity.getBattery_percent()/10)
        mBatteryView.setLevelHeight((int)entity.getBattery_percent()/10);
        tv_power.setText("电量:"+ (int)entity.getBattery_percent()/10 + "%");

        //如果有异常字段为真
        if (entity.isException()){
            //获取异常
            UdpControlSendManager.getInstance().get_robot_exception(Contanst.id,Contanst.to_id);
        }else {

        };

        if (entity.isCharge_state()){
            startCharge();
        }else{
            // Tools.showToast("停止充电");
            stopCharge();
        }
    }

    /*
     * 接收消毒状态
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(DesinStateCallbackEntity entity) {
        // Log.e(TAG, "onReceiveMsg: " + entity.toString());
        status_layout_spary.changeStatus(entity.getSpray_level());//喷雾强度
        status_layout_box_store.changeStatus(entity.getBox_store());//蓄水室液位
        countdown_view.updateShow((int) entity.getDisin_time() * 1000);//时间

    }

    /*
     * 接收异常代码
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(ExceptionCodesCallbackEntity entity) {


    }

    @Override
    public void setGridView(View view, final int type, List data) {
        List<ButtonModel> buttonModels= data;
        GridView gridView = (GridView) view.findViewById(R.id.gridView);
        dynamicSoreView.setNumColumns(gridView);
        SortButtonAdapter adapter = new SortButtonAdapter(this,buttonModels);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(view.getContext(),"第"+type+"页"+position,Toast.LENGTH_LONG).show();
               switch (type){
                   case 0:
                       if (position == 0){
                           Tools.showToast("消毒任务");
                           actionStart();
                       }else if(position == 1){
                           Tools.showToast("任务停止");
                           action_cmd_stop();
                       }else if(position == 2){
                           navi_mode_build();
                       }else if(position == 3){
                           auto_q();
                       }else if(position == 4){
                           auto_r();
                       }else if(position == 5){
                           Tools.showToast("喷雾关");
                           disin_cmd_spray_off();
                       }

                       break;
                   case 1:
                       if (position == 0){
                           navi_mode_loc();
                       }else if(position == 1){
                           Tools.showToast("解锁");
                           switch_open();
                       }else if(position == 2){
                           Tools.showToast("加锁");
                           switch_close();
                       }else if(position == 3){
                           Tools.showToast("打开热点");
                           robot_wifi_open();
                       }else if(position == 4){
                           Tools.showToast("关闭热点");
                           robot_wifi_close();
                       }else if(position == 5){
                           Tools.showToast("连接AP");
                           robot_wifi_ap_open();
                       }
                       break;
                   case 2:
                       if (position == 0){
                           Tools.showToast("断开AP");
                           robot_wifi_ap_close();
                       }else if(position == 1){
                           Tools.showToast("控制");
                       }else if(position == 2){
                           Tools.showToast("锁屏");
                           lock_screen();
                       }else if(position == 3){
                           Tools.showToast("关机");
                       }else if(position == 4){
                           Tools.showToast("描点");
                       }else if(position == 5){
                           set_save_map();
                       }
                       break;


               }
            }
        });
    }

    private void lock_screen() {
        Tools.showToast("锁屏");
        Intent intent = new Intent(BinTongActivity2.this,LockScreenActivity.class);
        startActivity(intent);
    }

    private void robot_wifi_ap_close() {
        Tools.showToast("断开AP");
        UdpControlSendManager.getInstance().set_robot_wifi_ap_close(Contanst.id,Contanst.to_id);
    }

    private void robot_wifi_ap_open() {
        Tools.showToast("连接AP");
        UdpControlSendManager.getInstance().set_robot_wifi_ap_open(Contanst.id,Contanst.to_id);
    }

    private void robot_wifi_close() {
        UdpControlSendManager.getInstance().set_robot_wifi_close(Contanst.id,Contanst.to_id);
    }

    private void robot_wifi_open() {
        UdpControlSendManager.getInstance().set_robot_wifi_open(Contanst.id,Contanst.to_id);
        Tools.showToast("已打开热点");
    }

    private void switch_close() {
        Contanst.man_switch = 0;
        UdpControlSendManager.getInstance().set_manual_ctrl_stop(Contanst.id,Contanst.to_id);
        AckListenerService.instance.addACKListener("set_manual_ctrl", new AckListenerService.ACKListener() {
            @Override
            public void onACK(boolean isSuccess) {

                if (isSuccess){
                    Tools.showToast("加锁成功");

                }else {
                    Tools.showToast("加锁失败");
                }
                AckListenerService.instance.removeACKListener();
            }
        });
    }

    private void switch_open() {
        Contanst.man_switch = 1;
        UdpControlSendManager.getInstance().set_manual_ctrl_stop(Contanst.id,Contanst.to_id);

        AckListenerService.instance.addACKListener("set_manual_ctrl", new AckListenerService.ACKListener() {
            @Override
            public void onACK(boolean isSuccess) {

                if (isSuccess){
                    Tools.showToast("解锁成功");

                }else {
                    Tools.showToast("解锁失败");
                }
                AckListenerService.instance.removeACKListener();
            }
        });

    }

    private void navi_mode_loc() {
        Tools.showToast("已设成location模式");
        UdpControlSendManager.getInstance().set_navi_mode_loc(Contanst.id, Contanst.to_id);
    }

    private void disin_cmd_spray_off() {
        UdpControlSendManager.getInstance().set_disin_cmd_spray_off(Contanst.id, Contanst.to_id);
    }

    private void auto_r() {
        Tools.showToast("行走喷雾弱");
        UdpControlSendManager.getInstance().set_disin_cmd(Contanst.id, Contanst.to_id,1,1);
    }

    private void auto_q() {
        Tools.showToast("行走喷雾强");
        UdpControlSendManager.getInstance().set_disin_cmd(Contanst.id, Contanst.to_id,1,2);
    }

    private void navi_mode_build() {
        Tools.showToast(getString(R.string.reset_map));
        UdpControlSendManager.getInstance().set_navi_mode_build(Contanst.id,Contanst.to_id);
    }

    private void set_save_map() {
        UdpControlSendManager.getInstance().set_save_map(Contanst.id,Contanst.to_id);
        Tools.showToast("保存地图成功");
    }

    private void action_cmd_stop() {
        UdpControlSendManager.getInstance().set_action_cmd_stop(Contanst.id, Contanst.to_id);
    }

    /*
    * 启动消毒
    * */
    private void actionStart() {
        UdpControlSendManager.getInstance().set_action_cmd_start(Contanst.id, Contanst.to_id);
    }

    private List<ButtonModel> setData(){
        List<ButtonModel> data = new ArrayList<>();
        ButtonModel buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_start);
        buttonModel.setName("消毒任务");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_stop);
        buttonModel.setName("任务停止");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_map);
        buttonModel.setName("建图");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_fog_q);
        buttonModel.setName("喷雾强");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_fog_r);
        buttonModel.setName("喷雾弱");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_fog_close);
        buttonModel.setName("喷雾关");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_loc);
        buttonModel.setName("定位模式");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_lock_close);
        buttonModel.setName("解锁");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_lock_open);
        buttonModel.setName("开锁");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_wifi_open);
        buttonModel.setName("打开热点");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_wifi_close);
        buttonModel.setName("关闭热点");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_ap_open);
        buttonModel.setName("连接AP");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_ap_close);
        buttonModel.setName("断开AP");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_control);
        buttonModel.setName("控制");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_lock_screen);
        buttonModel.setName("锁屏");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_turn_off);
        buttonModel.setName("关机");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_points);
        buttonModel.setName("描点");
        data.add(buttonModel);

        buttonModel = new ButtonModel();
        buttonModel.setDrawableIcon(R.drawable.icon_points);
        buttonModel.setName("建图完成");
        data.add(buttonModel);
        return data;
    }

    @Override
    public void callBack(Message msg) {
        switch (msg.what) {
            case 0:
                if (!isCharge){//搞不清楚 为什么老是回调，只能这样简单粗暴处理了
                    break;
                }
                mBatteryView.setLevelHeight(power += 5);
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
    private void stopCharge() {
        // mHandler.removeCallbacksAndMessages(null);
        mHandler.removeMessages(0);
        isCharge = false;
    }

    private void startCharge() {
        if (!isCharge){
            isCharge = true;
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    mHandler.sendEmptyMessage(0);
                }
            }, 0, 500);
        }
    }

}
