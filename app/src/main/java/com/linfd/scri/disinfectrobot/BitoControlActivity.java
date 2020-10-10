package com.linfd.scri.disinfectrobot;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.linfd.scri.disinfectrobot.entity.BaseEntity;
import com.linfd.scri.disinfectrobot.entity.ExceptionCodesCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.GetAllTasksEntity;
import com.linfd.scri.disinfectrobot.entity.RobotRegisterEntity;
import com.linfd.scri.disinfectrobot.listener.HttpCallbackEntity;
import com.linfd.scri.disinfectrobot.manager.HttpRequestManager;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

public class BitoControlActivity extends BaseActivity {
    private Button bt_hanxin_start,bt_hanxin_stop,bt_robot_register,bt_get_all_tasks,bt_get_repeat_tasks;
    private Button bt_get_charge_tasks;

    private int disinTaskId = -1;
    private int chargeTaskId = -1 ;
    @Override
    public void initView() {
        setContentView(R.layout.activity_bito_control);
        bt_hanxin_start = findViewById(R.id.bt_hanxin_start);
        bt_hanxin_stop = findViewById(R.id.bt_hanxin_stop);
        bt_robot_register = findViewById(R.id.bt_robot_register);
        bt_get_all_tasks = findViewById(R.id.bt_get_all_tasks);
        bt_get_repeat_tasks = findViewById(R.id.bt_get_repeat_tasks);
        bt_get_charge_tasks = findViewById(R.id.bt_get_charge_tasks);
        super.initView();
    }

    @Override
    protected void initListener() {
        super.initListener();
        bt_hanxin_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().hanxin_start(new HttpCallbackEntity<BaseEntity>() {
                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        if (baseEntity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                            Tools.showToast("启动成功");
                        }else{
                            Tools.showToast("启动失败");
                        };
                    }

                    @Override
                    public void onFailure() {

                    }
                });
            }
        });
        bt_hanxin_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().hanxin_stop(new HttpCallbackEntity<BaseEntity>() {

                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        Tools.showToast("成功");
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("失败");
                    }
                });
            }
        });
        /*
        * 注册机器人
        * */
        bt_robot_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    HttpRequestManager.getInstance().robot_register(new HttpCallbackEntity<RobotRegisterEntity>() {
                        @Override
                        public void onSuccess(RobotRegisterEntity robotRegisterEntity) {
                            Tools.showToast("成功");
                        }

                        @Override
                        public void onFailure() {
                            Tools.showToast("失败");
                        }
                    });
            }
        });

        /*
        * 查询所有任务信息
        * */
        bt_get_all_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().get_all_tasks(new HttpCallbackEntity<GetAllTasksEntity>() {

                    @Override
                    public void onSuccess(GetAllTasksEntity getAllTasksEntity) {
                        List<GetAllTasksEntity.DataBean.TasksBean> tasksBeans = getAllTasksEntity.getData().getTasks();
                        for (int i = 0; i < tasksBeans.size(); i++) {
                            if (tasksBeans.get(i).getGoal_action() == 10){
                                disinTaskId = tasksBeans.get(i).getId();
                                break;
                            };
                        }
                        for (int i = 0; i < tasksBeans.size(); i++) {
                            if (tasksBeans.get(i).getGoal_action() == 0){
                                chargeTaskId = tasksBeans.get(i).getId();
                                break;
                            };
                        }
                        Tools.showToast(disinTaskId+"++"+chargeTaskId);
                       // taskId = getAllTasksEntity.getData().getTasks().get(0).getId();
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("失败");
                    }
                });
            }
        });

        bt_get_repeat_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (disinTaskId == -1){
                    return;
                }
                HttpRequestManager.getInstance().repeat_tasks(disinTaskId, new HttpCallbackEntity<BaseEntity>() {

                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        Tools.showToast("重复任务成功");
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("失败");
                    }
                });
            }
        });

        bt_get_charge_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chargeTaskId == -1){
                    return;
                }
                HttpRequestManager.getInstance().repeat_tasks(chargeTaskId, new HttpCallbackEntity<BaseEntity>() {

                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        Tools.showToast("充电");
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("充电失败");
                    }
                });
            }
        });
    }

    /*
     * 接收异常代码
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(ExceptionCodesCallbackEntity entity) {


    }
}
