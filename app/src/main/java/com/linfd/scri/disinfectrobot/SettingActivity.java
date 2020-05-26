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
import com.linfd.scri.disinfectrobot.manager.TimerManager;
import com.linfd.scri.disinfectrobot.manager.TimerManager3;
import com.linfd.scri.disinfectrobot.manager.UdpControlSendManager;
import com.linfd.scri.disinfectrobot.nicedialog.BaseNiceDialog;
import com.linfd.scri.disinfectrobot.nicedialog.NiceDialog;
import com.linfd.scri.disinfectrobot.nicedialog.ViewConvertListener;
import com.linfd.scri.disinfectrobot.nicedialog.ViewHolder;
import com.nex3z.togglebuttongroup.SingleSelectToggleGroup;
import com.nex3z.togglebuttongroup.button.CircularToggle;
import com.td.framework.module.dialog.DialogHelper;
import com.td.framework.module.dialog.inf.OnDialogCancelListener;
import com.td.framework.module.dialog.inf.OnDialogConfirmListener;
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
    private TextView tv_set_apmt;
    private TagFlowLayout mFlowLayout;
    private CircularToggle tv_fixed_point;
    private RoundButton tv_leftward,tv_rightward,tv_forward,tv_backward;
    private RoundButton bt_set_disin_cmd_pump,bt_set_disin_cmd_drainage,bt_set_disin_cmd_close;
    private RoundButton tv_manual_q,tv_manual_r,tv_auto_q,tv_auto_r,bt_set_base_cmd_power_off;

    private FlowLayoutAdapter<String> flowLayoutAdapter;
    private SingleSelectToggleGroup selectToggleGroup;

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
        mTopBar.setTitle("start-up");
        mTopBar.setSubTitle("lectric:50%");
        TextView textView= new TextView(this);
       // textView.setText("正在开启");
        textView.setTextColor(getResources().getColor(R.color.white));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
        mTopBar.addLeftView(textView,1,layoutParams);
       tv_set_apmt = findViewById(R.id.tv_set_apmt);
        tv_leftward = findViewById(R.id.tv_leftward);
        tv_rightward = findViewById(R.id.tv_rightward);
        tv_forward = findViewById(R.id.tv_forward);
        tv_backward = findViewById(R.id.tv_backward);
       // selectToggleGroup = findViewById(R.id.group_choices);
        bt_set_disin_cmd_pump = findViewById(R.id.bt_set_disin_cmd_pump);
        bt_set_disin_cmd_drainage= findViewById(R.id.bt_set_disin_cmd_drainage);
        bt_set_disin_cmd_close = findViewById(R.id.bt_set_disin_cmd_close);
        tv_manual_q = findViewById(R.id.tv_manual_q);
        tv_manual_r = findViewById(R.id.tv_manual_r);
        tv_auto_q = findViewById(R.id.tv_auto_q);
        tv_auto_r = findViewById(R.id.tv_auto_r);
        bt_set_base_cmd_power_off = findViewById(R.id.bt_set_base_cmd_power_off);
        bt_set_base_cmd_power_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialogHelper.showConfirmDialog("确定关机", new OnDialogConfirmListener() {
                    @Override
                    public void onDialogConfirmListener(AlertDialog dialog) {
                        Tools.showToast("关机");
                        UdpControlSendManager.getInstance().set_base_cmd_power_off(Contanst.id, Contanst.to_id);
                        dialog.dismiss();
                    }
                });
            }
        });

        tv_manual_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast("手动喷雾强");
                UdpControlSendManager.getInstance().set_disin_cmd(Contanst.id, Contanst.to_id,3,2);
            }
        });
        tv_manual_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast("手动喷雾弱");
                UdpControlSendManager.getInstance().set_disin_cmd(Contanst.id, Contanst.to_id,3,1);
            }
        });
        tv_auto_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast("行走喷雾强");
                UdpControlSendManager.getInstance().set_disin_cmd(Contanst.id, Contanst.to_id,1,2);
            }
        });
        tv_auto_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast("行走喷雾弱");
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
                Tools.showToast("关闭喷雾");
            }
        });
        tv_leftward.setOnTouchListener(this);
        tv_rightward.setOnTouchListener(this);
        tv_forward.setOnTouchListener(this);
        tv_backward.setOnTouchListener(this);

//        selectToggleGroup.setOnCheckedChangeListener(new SingleSelectToggleGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(SingleSelectToggleGroup group, int checkedId) {
//                switch (checkedId){
//                    case R.id.choice_a:
//                        UdpControlSendManager.getInstance().set_disin_cmd_spray_off(Contanst.id, Contanst.to_id);
//                       // Tools.showToast("11");
//                        break;
//                    case R.id.choice_b:
//                        UdpControlSendManager.getInstance().set_disin_cmd_spray_on(Contanst.id, Contanst.to_id);
//                       // Tools.showToast("22");
//                        break;
//                    case R.id.choice_c:
//                        UdpControlSendManager.getInstance().set_disin_cmd_spray_on(Contanst.id, Contanst.to_id);
//                       // Tools.showToast("33");
//                        break;
//                }
//            }
//        });

        bt_set_disin_cmd_pump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast("抽水");
                UdpControlSendManager.getInstance().set_disin_cmd_pump(Contanst.id, Contanst.to_id);
            }
        });

        bt_set_disin_cmd_drainage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.showToast("排水");
                UdpControlSendManager.getInstance().set_disin_cmd_drainage(Contanst.id, Contanst.to_id);
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
        mTopBar.setSubTitle("lectric:"+ (entity.getBattery_percent()/1000)*100+"%");
       // wave_view_electric.setmWaterLevel((int) (entity.getBattery_percent()/1000));//(float) (entity.getBattery_percent()/10)
    }
    @Override
    protected void onStart() {
        super.onStart();

    }


}
