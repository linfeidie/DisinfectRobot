package com.linfd.scri.disinfectrobot;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.linfd.scri.disinfectrobot.entity.BaseEntity;
import com.linfd.scri.disinfectrobot.entity.BitoLoginEntity;
import com.linfd.scri.disinfectrobot.entity.CancelTaskEntity;
import com.linfd.scri.disinfectrobot.entity.ChangePwbEntity;
import com.linfd.scri.disinfectrobot.entity.ChargingStationsEntity;
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
import com.linfd.scri.disinfectrobot.manager.HeartbeatManager3;
import com.linfd.scri.disinfectrobot.manager.HeartbeatManager4;
import com.linfd.scri.disinfectrobot.manager.HttpRequestManager;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

public class BitoControlActivity extends BaseActivity {

    public static final String TAG = BitoControlActivity.class.getSimpleName();
    private Button bt_hanxin_start,bt_hanxin_stop,bt_robot_register,bt_get_all_tasks,bt_get_repeat_tasks;
    private Button bt_get_charge_tasks,bt_switch_charging_mode_man,bt_switch_charging_mode_auto;
    private Button bt_cancel_task_walk,bt_cancel_task_charge,bt_get_hanxin_status,bt_get_error_code;
    private Button bt_login,bt_changePwb,bt_reset_agents,bt_robot_unregister;
    private Button bt_get_agents_registerable,bt_get_robot_perform_task;
    private Button bt_one_key_start,bt_charging_stations;

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
        bt_one_key_start = findViewById(R.id.bt_one_key_start);
        bt_charging_stations = findViewById(R.id.bt_charging_stations);
        super.initView();
    }

    @Override
    protected void initListener() {
        super.initListener();
        /*
        * 开启韩信
        * */
        bt_hanxin_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hanxin_start();
            }
        });
        bt_hanxin_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpRequestManager.getInstance().hanxin_stop(new SimpleHttpCallbackEntity<BaseEntity>() {

                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        Tools.showToast("成功");
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
                robot_register();
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
                HttpRequestManager.getInstance().get_all_tasks(new SimpleHttpCallbackEntity<GetAllTasksEntity>() {

                    @Override
                    public void onSuccess(GetAllTasksEntity getAllTasksEntity) {
                        List<GetAllTasksEntity.DataBean.TasksBean> tasksBeans = getAllTasksEntity.getData().getTasks();

                        for (int i = 0; i < tasksBeans.size(); i++) {
                            if (tasksBeans.get(i).getGoal_action() == 10){
                                chargeTaskId = tasksBeans.get(i).getId();
                                break;
                            };
                        }
                        HttpRequestManager.getInstance().repeat_tasks(chargeTaskId, new SimpleHttpCallbackEntity<BaseEntity>() {

                            @Override
                            public void onSuccess(BaseEntity baseEntity) {
                                Tools.showToast("充电");
                            }

                        });
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
                HttpRequestManager.getInstance().switch_charging_mode(1, new SimpleHttpCallbackEntity<BaseEntity>() {

                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        Tools.showToast("手动充电模式成功");
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
                HttpRequestManager.getInstance().switch_charging_mode(3, new SimpleHttpCallbackEntity<BaseEntity>() {

                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        Tools.showToast("自动充电模式成功");
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
                    public void onFailure(String errmsg) {
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
                HttpRequestManager.getInstance().cancel_task(chargeTaskId,new SimpleHttpCallbackEntity<CancelTaskEntity>() {

                    @Override
                    public void onSuccess(CancelTaskEntity cancelTaskEntity) {
                        Tools.showToast("取消成功");
                    }

                });



            }
        });

        /*
        * 韩信状态
        * */

            bt_get_hanxin_status.setOnClickListener(new View.OnClickListener() {
            boolean b= true;
            @Override
            public void onClick(View view) {
                if (b){
                    HeartbeatManager3.getInstance().start();
                    b = false;
                }else{
                    HeartbeatManager3.getInstance().stop();
                    b = true;
                }


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

//                        StringBuilder sb = new StringBuilder();
//                        List<GetErrorCodeEntity.InfoBean.YugongBean.Yg00a00020071211000n00Bean.ZhCnBeanX> zhCnBeanXList = getErrorCodeEntity.getInfo().getYugong().getYg00a00020071211000n00().getZh_cn();
//                        for (int i = 0; i < zhCnBeanXList.size(); i++) {
//                            sb.append(zhCnBeanXList.get(i).getInstruction()+",");
//                        }
//
//                        tv_get_error_code.setText(sb.toString());
                    }

                    @Override
                    public void onFailure(String errmsg) {

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
                HttpRequestManager.getInstance().login("admin", "123456", new SimpleHttpCallbackEntity<BitoLoginEntity>() {

                    @Override
                    public void onSuccess(BitoLoginEntity baseEntity) {
                        Tools.showToast("登录成功");
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
                HttpRequestManager.getInstance().changePwb("", "", "", "", new SimpleHttpCallbackEntity<ChangePwbEntity>() {

                    @Override
                    public void onSuccess(ChangePwbEntity changePwbEntity) {
                        Tools.showToast("修改成功");
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
                HttpRequestManager.getInstance().reset_agents(new SimpleHttpCallbackEntity<BaseEntity>() {

                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        Tools.showToast("重置成功");
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
                    HttpRequestManager.getInstance().robot_unregister(new SimpleHttpCallbackEntity<RobotUnregisterEntity>() {

                        @Override
                        public void onSuccess(RobotUnregisterEntity robotUnregisterEntity) {
                            Tools.showToast("注销成功");
                        }

                    });
            }
        });

        /*
        * 查询所有在线机器⼈是否可注册
        * */
        bt_get_agents_registerable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // get_agents_registerable();
            }
        });

        /*
         * 查询正在执⾏的任务 - 根据机器⼈序列号
         * */
        bt_get_robot_perform_task.setOnClickListener(new View.OnClickListener() {

            boolean b = true;
            @Override
            public void onClick(View view) {
                if (b){
                    HeartbeatManager4.getInstance().start();
                    b = false;
                }else{
                    HeartbeatManager4.getInstance().stop();
                    b = true;
                }
            }
        });

        /*
        * 一键开启  3连    开启韩信 +  获取机器人序列号 + 注册机器人
        * */
        bt_one_key_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hanxin_start();
            }
        });

        /*
        查询所有⾃动充电桩信息*
        */
        bt_charging_stations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                charing_stations();
            }
        });
    }

    /*
        查询所有⾃动充电桩信息*
        */
    private void charing_stations() {
        HttpRequestManager.getInstance().charging_stations(new SimpleHttpCallbackEntity<ChargingStationsEntity>() {

            @Override
            public void onSuccess(ChargingStationsEntity entity) {
                if (entity.getCode() == Contanst.REQUEST_OK_200 ){
                    //赋值
                    //entity.getData().
                    Contanst.CHARGING_STATION_SERIAL = entity.getData().get(0).getCharging_station_serial();
                }else {
                    onFailure(entity.getMsg());
                }

                //赋值


                //Tools.showToast("成功"+ entity.getData().get(0).getCharging_station_serial());
            }

        });
    }

    /*
     * 注册机器人
     * */
    private void robot_register() {
        HttpRequestManager.getInstance().robot_register(new SimpleHttpCallbackEntity<RobotRegisterEntity>() {
            @Override
            public void onSuccess(RobotRegisterEntity entity) {
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    Tools.showToast("注册成功");
                }

            }

        });
    }

    /*
    * /*
     * 查询所有在线机器⼈是否可注册
     * */
    private void get_agents_registerable() {
        HttpRequestManager.getInstance().get_agents_registerable(new SimpleHttpCallbackEntity<GetAgentsRegisterableEntity>() {

            @Override
            public void onSuccess(GetAgentsRegisterableEntity entity) {
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    //赋值
                    Contanst.ROBOT_SERIAL = entity.getData().getAgents().get(0).getSerial();
                    Tools.showToast(entity.getData().getAgents().get(0).getSerial());
                    robot_register();//
                }

            }

        });
    }

    /*
    * 启动韩信
    * */
    private void hanxin_start() {
        HttpRequestManager.getInstance().hanxin_start(new SimpleHttpCallbackEntity<BaseEntity>() {
            @Override
            public void onSuccess(BaseEntity baseEntity) {
                if (baseEntity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    Tools.showToast("韩信启动成功");
                    get_agents_registerable();//获取机器人系列号 并注册机器人
                    charing_stations();//获取充电桩序列号
                }else{
                    Tools.showToast("韩信启动失败");
                };
            }


        });
    }


    private void repeat_tasks() {
        HttpRequestManager.getInstance().get_all_tasks(new SimpleHttpCallbackEntity<GetAllTasksEntity>() {

            @Override
            public void onSuccess(GetAllTasksEntity getAllTasksEntity) {
                List<GetAllTasksEntity.DataBean.TasksBean> tasksBeans = getAllTasksEntity.getData().getTasks();
                for (int i = 0; i < tasksBeans.size(); i++) {
                    if (tasksBeans.get(i).getGoal_action() == 0){
                        disinTaskId = tasksBeans.get(i).getId();
                        break;
                    };
                }

                HttpRequestManager.getInstance().repeat_tasks(disinTaskId, new SimpleHttpCallbackEntity<BaseEntity>() {

                    @Override
                    public void onSuccess(BaseEntity baseEntity) {
                        Tools.showToast("重复任务成功");
                    }

                });
            }

        });

    }


    /*
     * 接收韩信状态
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(GetHanxinStatusEntity entity) {
        Log.e(TAG,"韩信："+ BitoHanxinManager.obtainState(entity.getStatus()));

    }
    /*
           正在执行的任务状态
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(GetRobotPerformTaskEntity entity) {
        if (entity.getData().getTasks().size() != 0){
            Log.e(TAG,BitoActionStateManager.obtainState(entity.getData().getTasks().get(0).getStatus()));
        }else{
            Log.e(TAG,"GetRobotPerformTaskEntity"+ "为空");
        }


    }
}
