package com.linfd.scri.disinfectrobot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.stx.xhb.commontitlebar.CustomTitleBar;

public class MainActivity extends BaseActivity {

    public void initView() {
        setContentView(R.layout.activity_main);
        super.initView();

        mTopBar.addRightImageButton(R.mipmap.ic_setting,R.id.topbar_right_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SettingActivity.class);
                startActivity(intent);
            }
        });

    }
}
