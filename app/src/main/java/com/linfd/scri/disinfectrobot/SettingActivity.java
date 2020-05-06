package com.linfd.scri.disinfectrobot;

import android.content.Intent;
import android.opengl.GLES20;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
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
import com.linfd.scri.disinfectrobot.nicedialog.BaseNiceDialog;
import com.linfd.scri.disinfectrobot.nicedialog.NiceDialog;
import com.linfd.scri.disinfectrobot.nicedialog.ViewConvertListener;
import com.linfd.scri.disinfectrobot.nicedialog.ViewHolder;
import com.nex3z.togglebuttongroup.button.CircularToggle;
import com.td.framework.module.dialog.DialogHelper;
import com.td.framework.module.dialog.inf.OnDialogCancelListener;
import com.td.framework.module.dialog.inf.OnDialogConfirmListener;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.ArrayList;
import java.util.List;

public class SettingActivity extends BaseActivity  {
    private TextView tv_set_apmt;
    private TextView bt_run_mode;//运行模式
    private TagFlowLayout mFlowLayout;
    private CircularToggle tv_fixed_point;

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
       // mTopBar.setTitle(R.string.setting);
        mTopBar.setTitle("正在开启");
        mTopBar.setSubTitle("电量:85%");
        TextView textView= new TextView(this);
       // textView.setText("正在开启");
        textView.setTextColor(getResources().getColor(R.color.white));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
        mTopBar.addLeftView(textView,1,layoutParams);
       tv_set_apmt = findViewById(R.id.tv_set_apmt);
        tag_layout = findViewById(R.id.tag_layout);
        bt_run_mode = findViewById(R.id.bt_run_mode);
        bt_run_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if 判断有无
                //如果有 选择
                //如果无，直接手建地图
                NiceDialog.init().setLayoutId(R.layout.dialog_fixed_point).setConvertListener(new ViewConvertListener() {
                    @Override
                    public void convertView(ViewHolder holder, final BaseNiceDialog dialog) {
                        holder.getView(R.id.tv_sure).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(SettingActivity.this,DrawableMapActivity.class);
                                startActivity(intent);
                                dialog.dismiss();
                            }
                        }

                        );
                        holder.getView(R.id.tv_cancel).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });
                    }

                }).setOutCancel(true).setPosition(Gravity.CENTER).setWidth(270).setHeight(260).
                        show(getSupportFragmentManager());
            }

        });
//        tv_fixed_point = findViewById(R.id.tv_fixed_point);
//        tv_fixed_point.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NiceDialog.init().setLayoutId(R.layout.dialog_fixed_point).setConvertListener(new ViewConvertListener() {
//                    @Override
//                    public void convertView(ViewHolder holder, BaseNiceDialog dialog) {
//                        holder.getView(R.id.tv_sure).setOnClickListener(new View.OnClickListener() {
//                            @Override
//                            public void onClick(View view) {
//                                Intent intent = new Intent(SettingActivity.this,DrawableMapActivity.class);
//                                startActivity(intent);
//                            }
//                        });
//                    }
//                }).setOutCancel(true).setPosition(Gravity.CENTER).setWidth(270).setHeight(260).
//                        show(getSupportFragmentManager());
//            }
//        });
        tv_set_apmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this,ApmtActivity.class);
                startActivity(intent);
            }
        });
        List<String> list=new ArrayList<>();
        list.add("02:34 start");
        list.add("03:45 start");
        list.add("04:08 start");
        list.add("05:19 start");
        list.add("06:20 start");
        list.add("07:31 start");
        list.add("08:42 start");
        list.add("09:33 start");
        list.add("10:34 start");



        flowLayoutAdapter=new FlowLayoutAdapter<String>(list) {
            @Override
            public void bindDataToView(ViewHolder holder, int position, String bean) {
                holder.setText(R.id.tv,bean);
            }

            @Override
            public void onItemClick(final int position, String bean) {


                mDialogHelper.showConfirmDialog("Have you decided to cancel the 02:34 disinfection task?", getResources().getString(R.string.determine), getResources().getString(R.string.cancel), new OnDialogConfirmListener() {
                    @Override
                    public void onDialogConfirmListener(AlertDialog dialog) {
                        remove(position);
                        mDialogHelper.dismissDialog();
                    }
                }, new OnDialogCancelListener() {
                    @Override
                    public void onDialogCancelListener(AlertDialog dialog) {
                        mDialogHelper.dismissDialog();
                    }
                });
            }

            @Override
            public int getItemLayoutID(int position, String bean) {
                return R.layout.item_layout;
            }
        };
        tag_layout.setAdapter(flowLayoutAdapter);


    }

    @Override
    public void onDialogCancelListener(AlertDialog dialog) {
        Toast.makeText(this, "弹窗关闭", Toast.LENGTH_SHORT).show();
    }
}
