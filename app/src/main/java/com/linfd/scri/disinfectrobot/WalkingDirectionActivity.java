package com.linfd.scri.disinfectrobot;

import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.linfd.scri.disinfectrobot.eventbus.EventConnect;
import com.linfd.scri.disinfectrobot.manager.ControlDirectionManager;
import com.linfd.scri.disinfectrobot.manager.TimerManager3;
import com.linfd.scri.disinfectrobot.manager.UdpControlSendManager;
import com.td.framework.module.dialog.inf.OnDialogConfirmListener;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import ezy.ui.view.RoundButton;

public class WalkingDirectionActivity extends BaseActivity implements View.OnTouchListener{
    private RoundButton tv_leftward,tv_rightward,tv_forward,tv_backward;
    private RoundButton bt_set_base_cmd_power_off,tv_switch_open,tv_switch_close;
    private RoundButton set_robot_wifi_open,set_robot_wifi_close;

    public void initView() {
        setContentView(R.layout.activity_walk_direction);
        super.initView();
        mTopBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        // mTopBar.setTitle(R.string.setting);
        mTopBar.setTitle(R.string.control);
        mTopBar.setSubTitle("power:50%");

        tv_leftward = findViewById(R.id.tv_leftward);
        tv_rightward = findViewById(R.id.tv_rightward);
        tv_forward = findViewById(R.id.tv_forward);
        tv_backward = findViewById(R.id.tv_backward);
        tv_switch_open = findViewById(R.id.tv_switch_open);
        tv_switch_close = findViewById(R.id.tv_switch_close);
        bt_set_base_cmd_power_off = findViewById(R.id.bt_set_base_cmd_power_off);
        set_robot_wifi_open = findViewById(R.id.set_robot_wifi_open);
        set_robot_wifi_close = findViewById(R.id.set_robot_wifi_close);

    }

    @Override
    protected void initListener() {
        super.initListener();
        tv_leftward.setOnTouchListener(this);
        tv_rightward.setOnTouchListener(this);
        tv_forward.setOnTouchListener(this);
        tv_backward.setOnTouchListener(this);

        bt_set_base_cmd_power_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialogHelper.showConfirmDialog(getString(R.string.sure_turn_off), new OnDialogConfirmListener() {
                    @Override
                    public void onDialogConfirmListener(AlertDialog dialog) {
                       // Tools.showToast("关机");
                        UdpControlSendManager.getInstance().set_base_cmd_power_off(Contanst.id, Contanst.to_id);
                        mDialogHelper.showLoadingDialog("");
                        dialog.dismiss();
                    }
                });
            }
        });

        tv_switch_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contanst.man_switch = 1;
                UdpControlSendManager.getInstance().set_manual_ctrl_stop(Contanst.id,Contanst.to_id);
                Tools.showToast("已解锁");
            }
        });

        tv_switch_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contanst.man_switch = 0;
                UdpControlSendManager.getInstance().set_manual_ctrl_stop(Contanst.id,Contanst.to_id);
                Tools.showToast("已加锁");
            }
        });
        set_robot_wifi_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UdpControlSendManager.getInstance().set_robot_wifi_open(Contanst.id,Contanst.to_id);
                Tools.showToast("已打开热点");
            }
        });
        set_robot_wifi_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UdpControlSendManager.getInstance().set_robot_wifi_close(Contanst.id,Contanst.to_id);
                Tools.showToast("已关闭热点");
            }
        });
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            //判断一下  要解锁才可以使用
            if (Contanst.man_switch == 0){
                Tools.showToast("请解锁");
                return true;
            }
            switch (view.getId()) {
                case R.id.tv_forward:

                    ControlDirectionManager.getInstance().start(ControlDirectionManager.Direct.forward);
                    break;
                case R.id.tv_leftward:

                    ControlDirectionManager.getInstance().start(ControlDirectionManager.Direct.leftward);
                    break;
                case R.id.tv_rightward:
                    ControlDirectionManager.getInstance().start(ControlDirectionManager.Direct.rightward);
                    break;
                case R.id.tv_backward:
                    ControlDirectionManager.getInstance().start(ControlDirectionManager.Direct.backward);
                    break;
            }
        } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
            // Tools.showToast("消");
            Log.e("linfd", "消");
            // TimerManager3.getInstance().removeMessage();
            UdpControlSendManager.getInstance().set_manual_ctrl_stop(Contanst.id,Contanst.to_id);
            ControlDirectionManager.getInstance().stop();
        } else if (motionEvent.getAction() == MotionEvent.ACTION_CANCEL) {
            // Tools.showToast("消");
            Log.e("linfd", "ACTION_CANCEL");
            //TimerManager3.getInstance().removeMessage();
            UdpControlSendManager.getInstance().set_manual_ctrl_stop(Contanst.id,Contanst.to_id);
            ControlDirectionManager.getInstance().stop();
        }

        return true;
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(EventConnect entity) {


    }
}
