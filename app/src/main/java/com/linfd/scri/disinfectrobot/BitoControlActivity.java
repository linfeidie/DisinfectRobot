package com.linfd.scri.disinfectrobot;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.linfd.scri.disinfectrobot.entity.BaseEntity;
import com.linfd.scri.disinfectrobot.entity.BitoLoginEntity;
import com.linfd.scri.disinfectrobot.entity.CancelTaskEntity;
import com.linfd.scri.disinfectrobot.entity.ChangePwbEntity;
import com.linfd.scri.disinfectrobot.entity.ExceptionCodesCallbackEntity;
import com.linfd.scri.disinfectrobot.entity.GetAgentsRegisterableEntity;
import com.linfd.scri.disinfectrobot.entity.GetAllTasksEntity;
import com.linfd.scri.disinfectrobot.entity.GetErrorCodeEntity;
import com.linfd.scri.disinfectrobot.entity.GetHanxinStatusEntity;
import com.linfd.scri.disinfectrobot.entity.GetRobotPerformTaskEntity;
import com.linfd.scri.disinfectrobot.entity.RobotRegisterEntity;
import com.linfd.scri.disinfectrobot.entity.RobotUnregisterEntity;
import com.linfd.scri.disinfectrobot.listener.HttpCallbackEntity;
import com.linfd.scri.disinfectrobot.listener.SimpleHttpCallbackEntity;
import com.linfd.scri.disinfectrobot.manager.BitoActionStateManager;
import com.linfd.scri.disinfectrobot.manager.BitoHanxinManager;
import com.linfd.scri.disinfectrobot.manager.HttpRequestManager;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

public class BitoControlActivity extends BaseActivity {
    private Button bt_hanxin_start,bt_hanxin_stop,bt_robot_register,bt_get_all_tasks,bt_get_repeat_tasks;
    private Button bt_get_charge_tasks,bt_switch_charging_mode_man,bt_switch_charging_mode_auto;
    private Button bt_cancel_task_walk,bt_cancel_task_charge,bt_get_hanxin_status,bt_get_error_code;
    private Button bt_login,bt_changePwb,bt_reset_agents,bt_robot_unregister;
    private Button bt_get_agents_registerable,bt_get_robot_perform_task;

    private TextView tv_get_hanxin_status,tv_get_error_code;

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
        bt_switch_charging_mode_man = findViewById(R.id.bt_switch_charging_mode_man);
        bt_switch_charging_mode_auto = findViewById(R.id.bt_switch_charging_mode_auto);
        bt_cancel_task_walk = findViewById(R.id.bt_cancel_task_walk);
        bt_cancel_task_charge = findViewById(R.id.bt_cancel_task_charge);
        bt_get_hanxin_status = findViewById(R.id.bt_get_hanxin_status);
        tv_get_hanxin_status = findViewById(R.id.tv_get_hanxin_status);
        bt_get_error_code = findViewById(R.id.bt_get_error_code);
        tv_get_error_code = findViewById(R.id.tv_get_error_code);
        bt_login = findViewById(R.id.bt_login);
        bt_changePwb = findViewById(R.id.bt_changePwb);
        bt_reset_agents = findViewById(R.id.bt_reset_agents);
        bt_robot_unregister = findViewById(R.id.bt_robot_unregister);
        bt_get_agents_registerable = findViewById(R.id.bt_get_agents_registerable);
        bt_get_robot_perform_task = findViewById(R.id.bt_get_robot_perform_task);
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
               // getAllTasks();
            }
        });
        /*
        * 重复行走任务
        * */

        bt_get_repeat_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                repeat_tasks();
            }
        });

        bt_get_charge_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().get_all_tasks(new HttpCallbackEntity<GetAllTasksEntity>() {

                    @Override
                    public void onSuccess(GetAllTasksEntity getAllTasksEntity) {
                        List<GetAllTasksEntity.DataBean.TasksBean> tasksBeans = getAllTasksEntity.getData().getTasks();

                        for (int i = 0; i < tasksBeans.size(); i++) {
                            if (tasksBeans.get(i).getGoal_action() == 10){
                                chargeTaskId = tasksBeans.get(i).getId();
                                break;
                            };
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

                    @Override
                    public void onFailure() {
                        Tools.showToast("失败");
                    }
                });


            }
        });
        /*
        * 手动充电模式
        * */
        bt_switch_charging_mode_man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().switch_charging_mode(1, new HttpCallbackEntity<BaseEntity>() {

                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        Tools.showToast("手动充电模式成功");
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("手动充电模式失败");
                    }
                });
            }
        });

        /*
         * 自动充电模式
         * */
        bt_switch_charging_mode_auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().switch_charging_mode(3, new HttpCallbackEntity<BaseEntity>() {

                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        Tools.showToast("自动充电模式成功");
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("自动充电模式失败");
                    }
                });
            }
        });
        bt_cancel_task_walk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (disinTaskId == -1){
                    return;
                }
                HttpRequestManager.getInstance().cancel_task(disinTaskId,new HttpCallbackEntity<CancelTaskEntity>() {

                    @Override
                    public void onSuccess(CancelTaskEntity cancelTaskEntity) {
                        Tools.showToast("取消成功");
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("取消成功");
                    }
                });
            }
        });
        bt_cancel_task_charge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chargeTaskId == -1){
                    return;
                }
                HttpRequestManager.getInstance().cancel_task(chargeTaskId,new HttpCallbackEntity<CancelTaskEntity>() {

                    @Override
                    public void onSuccess(CancelTaskEntity cancelTaskEntity) {
                        Tools.showToast("取消成功");
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("取消成功");
                    }
                });



            }
        });
        bt_get_hanxin_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().get_hanxin_status(new HttpCallbackEntity<GetHanxinStatusEntity>() {

                    @Override
                    public void onSuccess(GetHanxinStatusEntity getHanxinStatusEntity) {
                       // Tools.showToast(BitoActionStateManager.obtainState(getHanxinStatusEntity.getStatus()));
                        tv_get_hanxin_status.setText("韩信："+ BitoHanxinManager.obtainState(getHanxinStatusEntity.getStatus()));
                    }

                    @Override
                    public void onFailure() {
                        tv_get_hanxin_status.setText("韩信："+"无法获取");
                    }
                });

            }
        });

        /*
        * 查询所有故障信息
        * */
        bt_get_error_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().get_error_code(new HttpCallbackEntity<GetErrorCodeEntity>() {

                    @Override
                    public void onSuccess(GetErrorCodeEntity getErrorCodeEntity) {

                        StringBuilder sb = new StringBuilder();
                        List<GetErrorCodeEntity.InfoBean.YugongBean.Yg00a00020071211000n00Bean.ZhCnBeanX> zhCnBeanXList = getErrorCodeEntity.getInfo().getYugong().getYg00a00020071211000n00().getZh_cn();
                        for (int i = 0; i < zhCnBeanXList.size(); i++) {
                            sb.append(zhCnBeanXList.get(i).getInstruction()+",");
                        }

                        tv_get_error_code.setText(sb.toString());
                    }

                    @Override
                    public void onFailure() {

                    }
                });
            }
        });

        /*
        * 登录
        * */
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().login("admin", "123456", new HttpCallbackEntity<BitoLoginEntity>() {

                    @Override
                    public void onSuccess(BitoLoginEntity baseEntity) {
                        Tools.showToast("登录成功");
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("登录失败");
                    }
                });
            }
        });
        /*
        * 修改密码
        * */
        bt_changePwb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().changePwb("", "", "", "", new HttpCallbackEntity<ChangePwbEntity>() {

                    @Override
                    public void onSuccess(ChangePwbEntity changePwbEntity) {
                        Tools.showToast("修改成功");
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("修改失败");
                    }
                });
            }
        });
        /*
        * 重置机器人
        * */
        bt_reset_agents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().reset_agents(new HttpCallbackEntity<BaseEntity>() {

                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        Tools.showToast("重置成功");
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("重置失败");
                    }
                });
            }
        });

        /*
        * 注销机器人
        * */
        bt_robot_unregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    HttpRequestManager.getInstance().robot_unregister(Contanst.ROBOT_SERIAL, new HttpCallbackEntity<RobotUnregisterEntity>() {

                        @Override
                        public void onSuccess(RobotUnregisterEntity robotUnregisterEntity) {
                            Tools.showToast("注销成功");
                        }

                        @Override
                        public void onFailure() {
                            Tools.showToast("注销失败");
                        }
                    });
            }
        });
        bt_get_agents_registerable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().get_agents_registerable(new HttpCallbackEntity<GetAgentsRegisterableEntity>() {

                    @Override
                    public void onSuccess(GetAgentsRegisterableEntity getAgentsRegisterableEntity) {
                        Tools.showToast(getAgentsRegisterableEntity.getData().getAgents().get(0).getSerial());
                    }

                    @Override
                    public void onFailure() {
                        Tools.showToast("查询所有在线机器⼈是否可注册失败");
                    }
                });
            }
        });

        /*
         * 查询正在执⾏的任务 - 根据机器⼈序列号
         * */
        bt_get_robot_perform_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().get_robot_perform_task(Contanst.ROBOT_SERIAL,new SimpleHttpCallbackEntity<GetRobotPerformTaskEntity>() {

                    @Override
                    public void onSuccess(GetRobotPerformTaskEntity entity) {
                        Tools.showToast(BitoActionStateManager.obtainState(entity.getData().getTasks().get(0).getStatus()));
                    }


                });
            }
        });

    }


    private void repeat_tasks() {
        HttpRequestManager.getInstance().get_all_tasks(new HttpCallbackEntity<GetAllTasksEntity>() {

            @Override
            public void onSuccess(GetAllTasksEntity getAllTasksEntity) {
                List<GetAllTasksEntity.DataBean.TasksBean> tasksBeans = getAllTasksEntity.getData().getTasks();
                for (int i = 0; i < tasksBeans.size(); i++) {
                    if (tasksBeans.get(i).getGoal_action() == 0){
                        disinTaskId = tasksBeans.get(i).getId();
                        break;
                    };
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

            @Override
            public void onFailure() {
                Tools.showToast("失败");
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
