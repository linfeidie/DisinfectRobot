package com.linfd.scri.disinfectrobot;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.linfd.scri.disinfectrobot.entity.ChargerPoseCallbackEntity;
import com.linfd.scri.disinfectrobot.eventbus.EventPoint;
import com.linfd.scri.disinfectrobot.manager.HeartbeatManager2;
import com.linfd.scri.disinfectrobot.manager.UdpControlSendManager;
import com.linfd.scri.disinfectrobot.manager.UpdateStateControlManager;
import com.linfd.scri.disinfectrobot.view.PinchImageView;
import com.td.framework.module.dialog.DialogHelper;
import com.td.framework.module.dialog.inf.OnDialogCancelListener;
import com.td.framework.module.dialog.inf.OnDialogConfirmListener;
import com.xyz.step.FlowViewHorizontal;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.w3c.dom.Text;

import ezy.ui.view.RoundButton;
import me.caibou.rockerview.JoystickView;

public class DrawableMapActivity extends BaseActivity {


    private TextView tv_remove_points,tv_clear_points;
    private JoystickView joystick;
    private FlowViewHorizontal flowView_horizontal;
    private PinchImageView pinchImageView;
    private RoundButton bt_set_goal,bt_finish;
    private boolean hasPointed = false; //记录下是否描点了

    public void initView() {
        setContentView(R.layout.activity_drawable_map);
        super.initView();
        mTopBar.setTitle(R.string.fixed_point_cruise_map);
        mTopBar.setVisibility(View.GONE);
        tv_remove_points = findViewById(R.id.tv_remove_points);
        tv_clear_points  = findViewById(R.id.tv_clear_points);
        bt_finish = findViewById(R.id.bt_finish);
        joystick  = findViewById(R.id.joystick);
        flowView_horizontal = findViewById(R.id.hflowview);
        pinchImageView = findViewById(R.id.iv_bitmap);
        bt_set_goal = findViewById(R.id.bt_set_goal);

        setListener();
    }

    @Override
    protected void initData() {
        flowView_horizontal.setProgress(1, 5, getResources().getStringArray(R.array.make_map), null);
        UpdateStateControlManager.getInstance().setBitmapCallback(new UpdateStateControlManager.BitmapCallback() {
            @Override
            public void bitmapFinish(Bitmap bitmap) {
                //currentBitmap = bitmap;
                pinchImageView.setImageBitmap(bitmap);
            }
        });
        findChargingPost();
    }
    /*
    * 寻找充电桩
    * */
    private void findChargingPost(){
        mDialogHelper.showConfirmDialog(getString(R.string.tips3), new OnDialogConfirmListener() {
            @Override
            public void onDialogConfirmListener(AlertDialog dialog) {
                dialog.dismiss();
                mDialogHelper.showWarningDialog(getString(R.string.tips4),false, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                });
                flowView_horizontal.setProgress(2, 5, getResources().getStringArray(R.array.make_map), null);
                HeartbeatManager2.getInstance().start();
            }


        }, new OnDialogCancelListener() {
            @Override
            public void onDialogCancelListener(AlertDialog dialog) {
               mDialogHelper.showWarningDialog(getString(R.string.tips5), new OnDialogConfirmListener() {
                   @Override
                   public void onDialogConfirmListener(AlertDialog dialog) {
                       finish();
                   }
               });
            }
        });

    }
    private void setListener() {
        joystick.setAngleUpdateListener(new JoystickView.OnAngleUpdateListener() {
            @Override
            public void onAngleUpdate(double angle, int action) {
                flowView_horizontal.setProgress(3, 5, getResources().getStringArray(R.array.make_map), null);
                joystick.setVisibility(View.GONE);
                tv_remove_points.setVisibility(View.VISIBLE);
                tv_clear_points.setVisibility(View.VISIBLE);
            }
        });
//        tv_finish.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(DrawableMapActivity.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
        /*
         *  设置描点 非任务
         * */
        bt_set_goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //只发一次建图模式
                Tools.showToast(getString(R.string.tracing_point));
                if (!hasPointed){
                    //清除描点
                    UdpControlSendManager.getInstance().set_goal_new(Contanst.id,Contanst.to_id);
                    Contanst.hasHistoryPoints = true;
                    //只有是定位模式才是切换成建图模式
                    if (UpdateStateControlManager.getInstance().localization){
                        UdpControlSendManager.getInstance().set_navi_mode_build(Contanst.id,Contanst.to_id);
                    }
                    hasPointed = true;
                }else {
                    UdpControlSendManager.getInstance().set_goal_back(Contanst.id,Contanst.to_id);
                }
                EventPoint event = new EventPoint();
                EventBus.getDefault().post(event);
            }
        });
        /*
        * 描点完成
        * */
        bt_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hasPointed){
                    handlerPointed();
                }else{
                    mDialogHelper.showWarningDialog(getString(R.string.please_trace));
                }


            }
        });
    }
    private void handlerPointed(){
        mDialogHelper.showConfirmDialog(getString(R.string.tips6), new OnDialogConfirmListener() {
            @Override
            public void onDialogConfirmListener(AlertDialog dialog) {
                BaseApplication.isdrawPaht = true;
                flowView_horizontal.setProgress(4, 5, getResources().getStringArray(R.array.make_map), null);
                // 1. 发送消毒任务命令  2. 自动开启任务  3. 保存地图  4. 设置location模式
                UdpControlSendManager.getInstance().set_disin_action_strong(Contanst.id, Contanst.to_id);
                UdpControlSendManager.getInstance().set_action_cmd_start(Contanst.id, Contanst.to_id);
                  UdpControlSendManager.getInstance().set_save_map(Contanst.id,Contanst.to_id);  //不要了
                //  UdpControlSendManager.getInstance().set_navi_mode_loc(Contanst.id,Contanst.to_id);  不要了
                mDialogHelper.showLoadingDialog("");
                BaseApplication.getHandler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mDialogHelper.dismissDialog();
                        Intent intent = new Intent(DrawableMapActivity.this,MainActivity.class);
                        intent.setAction(Contanst.KEY_SHOW01);
                        startActivity(intent);
                    }
                },1000);
            }
        });
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(ChargerPoseCallbackEntity entity) {
        if (entity.getState()){
            HeartbeatManager2.getInstance().stop();
            mDialogHelper.dismissDialog();
            mDialogHelper.showConfirmDialog(getString(R.string.tips7), new OnDialogConfirmListener() {
                @Override
                public void onDialogConfirmListener(AlertDialog dialog) {
                    dialog.dismiss();
                    flowView_horizontal.setProgress(3, 5, getResources().getStringArray(R.array.make_map), null);
                    bt_set_goal.setVisibility(View.VISIBLE);
                    bt_finish.setVisibility(View.VISIBLE);
                }
            });
        }else {
           // Tools.showToast("正在寻找充电桩");
        }
    }

}
