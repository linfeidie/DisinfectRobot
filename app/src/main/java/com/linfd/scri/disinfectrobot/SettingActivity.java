package com.linfd.scri.disinfectrobot;

import android.content.Context;
import android.content.Intent;
import android.opengl.GLES20;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cy.cyflowlayoutlibrary.FlowLayoutAdapter;
import com.cy.cyflowlayoutlibrary.FlowLayoutScrollView;
import com.jzxiang.pickerview.TimePickerDialog;
import com.jzxiang.pickerview.data.Type;
import com.linfd.scri.disinfectrobot.entity.RobotStatusCallbackEntity;
import com.linfd.scri.disinfectrobot.listener.OnSimpleSeekChangeListener;
import com.linfd.scri.disinfectrobot.manager.AckListenerService;
import com.linfd.scri.disinfectrobot.manager.ComBitmapManager;
import com.linfd.scri.disinfectrobot.manager.DrawPathManager;
import com.linfd.scri.disinfectrobot.manager.TimerManager;
import com.linfd.scri.disinfectrobot.manager.TimerManager3;
import com.linfd.scri.disinfectrobot.manager.UdpControlSendManager;
import com.linfd.scri.disinfectrobot.nicedialog.BaseNiceDialog;
import com.linfd.scri.disinfectrobot.nicedialog.NiceDialog;
import com.linfd.scri.disinfectrobot.nicedialog.ViewConvertListener;
import com.linfd.scri.disinfectrobot.nicedialog.ViewHolder;
import com.nex3z.togglebuttongroup.SingleSelectToggleGroup;
import com.nex3z.togglebuttongroup.button.CircularToggle;
import com.suke.widget.SwitchButton;
import com.td.framework.module.dialog.DialogHelper;
import com.td.framework.module.dialog.inf.OnDialogCancelListener;
import com.td.framework.module.dialog.inf.OnDialogConfirmListener;
import com.warkiz.widget.IndicatorSeekBar;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import ezy.ui.view.RoundButton;



public class SettingActivity extends BaseActivity implements View.OnTouchListener {

    public static final String TAG = SettingActivity.class.getSimpleName();
    private RoundButton tv_leftward,tv_rightward,tv_forward,tv_backward;
    private RoundButton bt_set_disin_cmd_pump,bt_set_charge_power_action,bt_set_disin_cmd_close;
    private RoundButton tv_manual_q,tv_manual_r,tv_auto_q,tv_auto_r,bt_set_base_cmd_power_off,bt_set_disin_cmd_charge;
    private RoundButton bt_set_disin_cmd_charge_close,tv_set_navi_mode_build,bt_loop_time;
    private SwitchButton switch_loop_time,switch_recharging;


    public void initView() {
        setContentView(R.layout.activity_setting);
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
        TextView textView= new TextView(this);
       // textView.setText("正在开启");
        textView.setTextColor(getResources().getColor(R.color.white));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
        mTopBar.addLeftView(textView,1,layoutParams);
        tv_leftward = findViewById(R.id.tv_leftward);
        tv_rightward = findViewById(R.id.tv_rightward);
        tv_forward = findViewById(R.id.tv_forward);
        tv_backward = findViewById(R.id.tv_backward);
       // selectToggleGroup = findViewById(R.id.group_choices);
        bt_set_disin_cmd_pump = findViewById(R.id.bt_set_disin_cmd_pump);
        bt_set_charge_power_action= findViewById(R.id.bt_set_charge_power_action);
        bt_set_disin_cmd_close = findViewById(R.id.bt_set_disin_cmd_close);
        tv_manual_q = findViewById(R.id.tv_manual_q);
        tv_manual_r = findViewById(R.id.tv_manual_r);
        tv_auto_q = findViewById(R.id.tv_auto_q);
        tv_auto_r = findViewById(R.id.tv_auto_r);
        bt_set_base_cmd_power_off = findViewById(R.id.bt_set_base_cmd_power_off);
        bt_set_disin_cmd_charge = findViewById(R.id.bt_set_disin_cmd_charge);
        bt_set_disin_cmd_charge_close = findViewById(R.id.bt_set_disin_cmd_charge_close);
        tv_set_navi_mode_build = findViewById(R.id.tv_set_navi_mode_build);
        switch_loop_time = findViewById(R.id.switch_loop_time);
        bt_loop_time = findViewById(R.id.bt_loop_time);
        switch_recharging = findViewById(R.id.switch_recharging);
        switch_recharging.setChecked(Contanst.switch_recharging);
        switch_recharging.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {

                Contanst.switch_recharging = isChecked;
            }
        });
        bt_loop_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast("开启无限循环");
                Contanst.loop_time = -1;
            }
        });
        switch_loop_time.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                if (isChecked){
                    showLoopPanel();
                    Contanst.loop_time = -1;
                }else {
                    Contanst.loop_time = 0;
                }
            }
        });
        tv_set_navi_mode_build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast(getString(R.string.reset_map));
                BaseApplication.isFistBoot = true;
                UdpControlSendManager.getInstance().set_navi_mode_build(Contanst.id,Contanst.to_id);
            }
        });
        bt_set_disin_cmd_charge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UdpControlSendManager.getInstance().set_base_cmd(Contanst.id, Contanst.to_id,0,true);
            }
        });
        bt_set_disin_cmd_charge_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UdpControlSendManager.getInstance().set_base_cmd(Contanst.id, Contanst.to_id,0,false);
            }
        });
        bt_set_base_cmd_power_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialogHelper.showConfirmDialog(getString(R.string.sure_turn_off), new OnDialogConfirmListener() {
                    @Override
                    public void onDialogConfirmListener(AlertDialog dialog) {
                       // Tools.showToast("关机");
                        UdpControlSendManager.getInstance().set_base_cmd_power_off(Contanst.id, Contanst.to_id);
                        dialog.dismiss();
                    }
                });
            }
        });

        tv_manual_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Tools.showToast("手动喷雾强");
                UdpControlSendManager.getInstance().set_disin_cmd(Contanst.id, Contanst.to_id,3,2);
            }
        });
        tv_manual_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Tools.showToast("手动喷雾弱");
                UdpControlSendManager.getInstance().set_disin_cmd(Contanst.id, Contanst.to_id,3,1);
            }
        });
        tv_auto_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Tools.showToast("行走喷雾强");
                UdpControlSendManager.getInstance().set_disin_cmd(Contanst.id, Contanst.to_id,1,2);
            }
        });
        tv_auto_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Tools.showToast("行走喷雾弱");
                UdpControlSendManager.getInstance().set_disin_cmd(Contanst.id, Contanst.to_id,1,1);
            }
        });



    }

    @Override
    public void onDialogCancelListener(AlertDialog dialog) {
        Toast.makeText(this, "弹窗关闭", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void initListener() {
        super.initListener();
        bt_set_disin_cmd_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UdpControlSendManager.getInstance().set_disin_cmd_spray_off(Contanst.id, Contanst.to_id);
                //Tools.showToast("关闭喷雾");
            }
        });
        tv_leftward.setOnTouchListener(this);
        tv_rightward.setOnTouchListener(this);
        tv_forward.setOnTouchListener(this);
        tv_backward.setOnTouchListener(this);


        bt_set_disin_cmd_pump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Tools.showToast("抽水");
               // UdpControlSendManager.getInstance().set_disin_cmd_pump(Contanst.id, Contanst.to_id);
                DrawPathManager.getInstance().cleanTrails();
            }
        });

        bt_set_charge_power_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast("对接充电任务");
                UdpControlSendManager.getInstance().set_docking_action(Contanst.id, Contanst.to_id);
                AckListenerService.instance.addACKListener("set_charge_power_action", new AckListenerService.ACKListener() {
                    @Override
                    public void onACK(boolean isSuccess) {

                        if (isSuccess){
                            Tools.showToast("启动成功");
                            UdpControlSendManager.getInstance().set_action_cmd_start(Contanst.id, Contanst.to_id);
                            AckListenerService.instance.removeACKListener();
                        }else {
                            Tools.showToast("启动失败");
                        }

                    }
                });
            }
        });
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            switch (view.getId()) {
                case R.id.tv_forward:

                    TimerManager3.getInstance().start(new LooperRunnable() {
                        @Override
                        public void call() {
                            Log.e("linfd", "前");
                            UdpControlSendManager.getInstance().forward(Contanst.id,Contanst.to_id, 0.1);
                        }
                    });
                    break;
                case R.id.tv_leftward:

                    TimerManager3.getInstance().start(new LooperRunnable() {
                        @Override
                        public void call() {
                            Log.e("linfd", "左");
                            UdpControlSendManager.getInstance().leftward(Contanst.id,Contanst.to_id, 0.3);
                        }
                    });
                    break;
                case R.id.tv_rightward:

                    TimerManager3.getInstance().start(new LooperRunnable() {
                        @Override
                        public void call() {
                            Log.e("linfd", "右");
                            UdpControlSendManager.getInstance().rightward(Contanst.id,Contanst.to_id, 0.3);
                        }
                    });
                    break;
                case R.id.tv_backward:

                    TimerManager3.getInstance().start(new LooperRunnable() {
                        @Override
                        public void call() {
                            Log.e("linfd", "后");
                            UdpControlSendManager.getInstance().backward(Contanst.id,Contanst.to_id, 0.1);
                        }
                    });
                    break;
            }
        } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
           // Tools.showToast("消");
            Log.e("linfd", "消");
            TimerManager3.getInstance().removeMessage();
            UdpControlSendManager.getInstance().set_manual_ctrl_stop(Contanst.id,Contanst.to_id);
        } else if (motionEvent.getAction() == MotionEvent.ACTION_CANCEL) {
           // Tools.showToast("消");
            Log.e("linfd", "ACTION_CANCEL");
            TimerManager3.getInstance().removeMessage();
            UdpControlSendManager.getInstance().set_manual_ctrl_stop(Contanst.id,Contanst.to_id);
        }

        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    protected void onStop() {
        super.onStop();
    }
    /*
     * 接收机器人状态
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(RobotStatusCallbackEntity entity) {
        mTopBar.setSubTitle("power:"+ (int)(entity.getBattery_percent()/10)+"%");
    }
    @Override
    protected void onStart() {
        super.onStart();
    }

    IndicatorSeekBar sb_distance;
    private void  showLoopPanel(){
        NiceDialog.init().setLayoutId(R.layout.dialog_panel).setConvertListener(new ViewConvertListener() {
            @Override
            public void convertView(ViewHolder holder, final BaseNiceDialog dialog) {
                sb_distance = holder.getView(R.id.sb_distance);
                sb_distance.setOnSeekChangeListener(new OnSimpleSeekChangeListener() {
                    @Override
                    public void onStopTrackingTouch(IndicatorSeekBar seekBar) {
                        super.onStopTrackingTouch(seekBar);
                        sb_distance = seekBar;
                    }
                });
                sb_distance.setIndicatorTextFormat("${PROGRESS} 次");


                holder.setOnClickListener(R.id.tv_sure, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
//                        TcpControlSendManager.set_distance(Math.abs(sb_distance.getProgressFloat()), sb_angular.getProgressFloat(), sb_distance.getProgressFloat() > 0 ? 0.3 : -0.3, sb_angular.getProgressFloat() > 0 ? 0.3 : -0.3);
//                        sb_distance.setProgress(0);
//                        sb_angular.setProgress(0);
                        dialog.dismiss();
                    }

                });

            }
        }).setWidth(0).setHeight(250).setPosition(Gravity.BOTTOM).show(getSupportFragmentManager());
    }

}
