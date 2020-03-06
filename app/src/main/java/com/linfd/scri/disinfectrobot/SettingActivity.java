package com.linfd.scri.disinfectrobot;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cy.cyflowlayoutlibrary.FlowLayoutAdapter;
import com.cy.cyflowlayoutlibrary.FlowLayoutScrollView;
import com.jzxiang.pickerview.TimePickerDialog;
import com.jzxiang.pickerview.data.Type;
import com.td.framework.module.dialog.DialogHelper;
import com.td.framework.module.dialog.inf.OnDialogCancelListener;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.ArrayList;
import java.util.List;

public class SettingActivity extends BaseActivity implements OnDialogCancelListener {
    TextView tv_set_apmt;
    private TagFlowLayout mFlowLayout;
    private TimePickerDialog mDialogHourMinute;

    private DialogHelper mDialogHelper;

    private FlowLayoutAdapter<String> flowLayoutAdapter;
    private FlowLayoutScrollView tag_layout;

    public void initView() {
        setContentView(R.layout.activity_setting);
        super.initView();
        mTopBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        if (mDialogHelper == null) {
            mDialogHelper = new DialogHelper(SettingActivity.this, this);
        }
        tv_set_apmt = findViewById(R.id.tv_set_apmt);
        tag_layout = findViewById(R.id.tag_layout);
        tv_set_apmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                mDialogHourMinute = new TimePickerDialog.Builder()
//                        .setType(Type.HOURS_MINS)
//                        .setCallBack(null)
//                        .setMinMillseconds(System.currentTimeMillis())
//                        .setThemeColor(getResources().getColor(R.color.colorPrimary))
//                        .build();
//                mDialogHourMinute.show(getSupportFragmentManager(), "hour_minute");
                mDialogHelper.dismissDialog();
            }
        });
        List<String> list=new ArrayList<>();
        list.add("环境");
        list.add("环境");
        list.add("如果皇太后");
        list.add("人皇太后");
        list.add("环境");
        list.add("然后");
        list.add("环境");
        list.add("环境");
        list.add("然后钛合金");
        list.add("环境");
        list.add("任何人挺好");
        list.add("环境");
        list.add("发个黄庭坚");
        list.add("环境");
        list.add("分分然后");
        list.add("环境");
        list.add("环境");
        list.add("凤凰台和");
        list.add("环境");
        list.add("环境");
        list.add("环境");
        list.add("发个荣誉感");
        list.add("环境");
        list.add("复合肥");
        list.add("环境");
        list.add("发然后");
        list.add("环的风格让他很认同和境");
        list.add("的富贵华庭");
        list.add("的富");

        flowLayoutAdapter=new FlowLayoutAdapter<String>(list) {
            @Override
            public void bindDataToView(ViewHolder holder, int position, String bean) {
                holder.setText(R.id.tv,bean);
            }

            @Override
            public void onItemClick(int position, String bean) {

                Toast.makeText(SettingActivity.this,"点击"+position,Toast.LENGTH_LONG).show();
                //remove(position);
                mDialogHelper.showWarningDialog("33");
            }

            @Override
            public int getItemLayoutID(int position, String bean) {
                return R.layout.item_tv;
            }
        };
        tag_layout.setAdapter(flowLayoutAdapter);


    }

    @Override
    public void onDialogCancelListener(AlertDialog dialog) {
        Toast.makeText(this, "弹窗关闭", Toast.LENGTH_SHORT).show();
    }
}
