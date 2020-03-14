package com.linfd.scri.disinfectrobot;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.td.framework.module.dialog.DialogHelper;
import com.td.framework.module.dialog.inf.OnDialogConfirmListener;

import org.w3c.dom.Text;

import me.caibou.rockerview.JoystickView;

public class DrawableMapActivity extends BaseActivity {


    private Button bt_sure;
    private TextView tv_des;
    private JoystickView joystick;

    public void initView() {
        setContentView(R.layout.activity_drawable_map);
        super.initView();
        mTopBar.setTitle(R.string.fixed_point_cruise_map);
        bt_sure = findViewById(R.id.bt_sure);
        tv_des = findViewById(R.id.tv_des);
        joystick  = findViewById(R.id.joystick);
        bt_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent()
                mDialogHelper.showConfirmDialog(getString(R.string.sure_the_map_is_complete),getResources().getString(R.string.determine) , getString(R.string.cancel), new OnDialogConfirmListener() {
                    @Override
                    public void onDialogConfirmListener(AlertDialog dialog) {
                        bt_sure.setVisibility(View.GONE);
                        tv_des.setVisibility(View.VISIBLE);
                        joystick.setVisibility(View.VISIBLE);
                    }
                });
            }
        });
    }
}
