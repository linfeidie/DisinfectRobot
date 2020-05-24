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
    private TextView tv_des;
    private JoystickView joystick;
    private FlowViewHorizontal flowView_horizontal;
    private PinchImageView pinchImageView;
    private RoundButton bt_set_goal,bt_finish;

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
        mDialogHelper.showConfirmDialog("请把机器人移到充电桩附近", new OnDialogConfirmListener() {
            @Override
            public void onDialogConfirmListener(AlertDialog dialog) {
                dialog.dismiss();
                mDialogHelper.showLoadingDialog("寻找充电桩...");
                flowView_horizontal.setProgress(2, 5, getResources().getStringArray(R.array.make_map), null);
                HeartbeatManager2.getInstance().start();
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
                Tools.showToast("描点");
                UdpControlSendManager.getInstance().set_goal(Contanst.id,Contanst.to_id);
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
                mDialogHelper.showConfirmDialog("是否确定已把机器人推至充电桩附近?", new OnDialogConfirmListener() {
                    @Override
                    public void onDialogConfirmListener(AlertDialog dialog) {
                        BaseApplication.isdrawPaht = true;
                        flowView_horizontal.setProgress(4, 5, getResources().getStringArray(R.array.make_map), null);
                        // 1. 发送消毒任务命令  2. 自动开启任务  3. 保存地图  4. 设置location模式
                        UdpControlSendManager.getInstance().set_disin_action_strong(Contanst.id, Contanst.to_id);
                        UdpControlSendManager.getInstance().set_action_cmd_start(Contanst.id, Contanst.to_id);
                        UdpControlSendManager.getInstance().set_save_map(Contanst.id,Contanst.to_id);
                      //  UdpControlSendManager.getInstance().set_navi_mode_loc(Contanst.id,Contanst.to_id);  不要了
                    }
                });

            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(ChargerPoseCallbackEntity entity) {
        if (entity.getState()){
            HeartbeatManager2.getInstance().stop();
            mDialogHelper.dismissDialog();
            mDialogHelper.showConfirmDialog("找到充电桩来啦,可以描点了", new OnDialogConfirmListener() {
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
