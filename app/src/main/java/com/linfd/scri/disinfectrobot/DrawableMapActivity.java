package com.linfd.scri.disinfectrobot;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.td.framework.module.dialog.DialogHelper;
import com.td.framework.module.dialog.inf.OnDialogConfirmListener;
import com.xyz.step.FlowViewHorizontal;

import org.w3c.dom.Text;

import me.caibou.rockerview.JoystickView;

public class DrawableMapActivity extends BaseActivity {


    private TextView bt_sure,tv_remove_points,tv_clear_points,tv_finish;
    private TextView tv_des;
    private JoystickView joystick;
    private FlowViewHorizontal flowView_horizontal;

    public void initView() {
        setContentView(R.layout.activity_drawable_map);
        super.initView();
        mTopBar.setTitle(R.string.fixed_point_cruise_map);
        mTopBar.setVisibility(View.GONE);
        bt_sure = findViewById(R.id.bt_sure);
        tv_remove_points = findViewById(R.id.tv_remove_points);
        tv_clear_points  = findViewById(R.id.tv_clear_points);
        tv_finish = findViewById(R.id.tv_finish);
        joystick  = findViewById(R.id.joystick);
        flowView_horizontal = findViewById(R.id.hflowview);
        bt_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent()
                mDialogHelper.showConfirmDialog(getString(R.string.sure_the_map_is_complete),getResources().getString(R.string.determine) , getString(R.string.cancel), new OnDialogConfirmListener() {
                    @Override
                    public void onDialogConfirmListener(AlertDialog dialog) {
                        bt_sure.setVisibility(View.GONE);
                        joystick.setVisibility(View.VISIBLE);
                        flowView_horizontal.setProgress(2, 4, getResources().getStringArray(R.array.make_map), null);
                    }
                });
            }
        });
        setListener();
    }

    @Override
    protected void initData() {
        flowView_horizontal.setProgress(1, 4, getResources().getStringArray(R.array.make_map), null);
    }
    private void setListener() {
        joystick.setAngleUpdateListener(new JoystickView.OnAngleUpdateListener() {
            @Override
            public void onAngleUpdate(double angle, int action) {
                flowView_horizontal.setProgress(3, 4, getResources().getStringArray(R.array.make_map), null);
                joystick.setVisibility(View.GONE);
                tv_remove_points.setVisibility(View.VISIBLE);
                tv_clear_points.setVisibility(View.VISIBLE);
                tv_finish.setVisibility(View.VISIBLE);
            }
        });
        tv_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DrawableMapActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
