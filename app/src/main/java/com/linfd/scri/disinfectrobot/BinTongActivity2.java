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

public class BinTongActivity2 extends  BaseActivity   implements IDynamicSore {

    public static final String TAG = BinTongActivity2.class.getSimpleName();

    private DynamicSoreView dynamicSoreView;
    private List buttonList;
    private TextView tv_exception;
    private List<ExceptionEntity> entities;
    @Override
    public void initView() {
        setContentView(R.layout.activity_bintong2);
        dynamicSoreView = findViewById(R.id.dynamicSoreView);
        tv_exception = findViewById(R.id.tv_exception);
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

    }

    /*
     * 接收消毒状态
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(DesinStateCallbackEntity entity) {


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
                Toast.makeText(view.getContext(),"第"+type+"页"+position,Toast.LENGTH_LONG).show();
            }
        });
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
        return data;
    }

}
