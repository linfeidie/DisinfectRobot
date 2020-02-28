package com.linfd.scri.disinfectrobot;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.jzxiang.pickerview.TimePickerDialog;
import com.jzxiang.pickerview.data.Type;

public class SettingActivity extends BaseActivity {
    TextView tv_apmt_state;
    private TimePickerDialog mDialogHourMinute;


    public void initView() {
        setContentView(R.layout.activity_setting);
        super.initView();
        mTopBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tv_apmt_state = findViewById(R.id.tv_apmt_state);
        tv_apmt_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialogHourMinute = new TimePickerDialog.Builder()
                        .setType(Type.HOURS_MINS)
                        .setCallBack(null)
                        .setMinMillseconds(System.currentTimeMillis())
                        .build();
                mDialogHourMinute.show(getSupportFragmentManager(), "hour_minute");
            }
        });
    }
}
