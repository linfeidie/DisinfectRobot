package com.linfd.scri.disinfectrobot.manager;

import com.linfd.scri.disinfectrobot.Contanst;
import com.linfd.scri.disinfectrobot.Tools;
import com.linfd.scri.disinfectrobot.entity.BaseEntity;
import com.linfd.scri.disinfectrobot.entity.CancelTasksEntity;
import com.linfd.scri.disinfectrobot.entity.ChargingStationsEntity;
import com.linfd.scri.disinfectrobot.entity.GetAgentsRegisterableEntity;
import com.linfd.scri.disinfectrobot.entity.GetAllTasksEntity;
import com.linfd.scri.disinfectrobot.entity.PauseRobotEntity;
import com.linfd.scri.disinfectrobot.entity.ResumeRobotEntity;
import com.linfd.scri.disinfectrobot.entity.RobotRegisterEntity;
import com.linfd.scri.disinfectrobot.listener.SimpleHttpCallbackEntity;

import java.util.List;

/*
* 封装了宾通方法
* */
public class BitoAPIManager {

    private static BitoAPIManager instance;

    private int disinTaskId = -1;
    private int chargeTaskId = -1 ;

    public static BitoAPIManager getInstance(){

        if (instance == null){
            synchronized (BitoAPIManager.class){
                if (instance == null){
                    instance = new BitoAPIManager();
                }
            }

        }
        return instance;
    }

    /*
     * 启动韩信
     * */
    public void hanxin_start() {
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
    /*
     * /*
     * 查询所有在线机器⼈是否可注册
     * */
    private void get_agents_registerable() {
        HttpRequestManager.getInstance().get_agents_registerable(new SimpleHttpCallbackEntity<GetAgentsRegisterableEntity>() {

            @Override
            public void onSuccess(GetAgentsRegisterableEntity entity) {
                // 健壮性
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK ) && entity.getData().getAgents().size() != 0){
                    //赋值
                    Contanst.ROBOT_SERIAL = entity.getData().getAgents().get(0).getSerial();
                    //Tools.showToast(entity.getData().getAgents().get(0).getSerial());
                    robot_register();//
                }else {
                    onFailure(entity.getErrmsg());
                }

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
                if (entity.getCode() == Contanst.REQUEST_OK_200 && entity.getData().size() != 0 ){
                    //赋值
                    //拿第一个
                    Contanst.CHARGING_STATION_SERIAL = entity.getData().get(0).getCharging_station_serial();
                }else {
                    onFailure(entity.getMsg());
                }
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
                }else{
                    onFailure(entity.getErrmsg());
                }

            }

        });
    }

    /*
    * 关闭韩信
    * */
    public void hanxin_stop(){
        HttpRequestManager.getInstance().hanxin_stop(new SimpleHttpCallbackEntity<BaseEntity>() {

            @Override
            public void onSuccess(BaseEntity entity) {
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    Tools.showToast("韩信已关闭");
                }else{
                    onFailure(entity.getErrmsg());
                }
            }
        });
    }

    /*
    * 重复消毒行走任务
    * */
    public void repeat_tasks() {
        HttpRequestManager.getInstance().get_all_tasks(new SimpleHttpCallbackEntity<GetAllTasksEntity>() {

            @Override
            public void onSuccess(final GetAllTasksEntity entity) {
                //健壮性
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK) && entity.getData().getTasks().size() != 0){
                    List<GetAllTasksEntity.DataBean.TasksBean> tasksBeans = entity.getData().getTasks();
                    for (int i = 0; i < tasksBeans.size(); i++) {
                        if (tasksBeans.get(i).getGoal_action() == 0){
                            disinTaskId = tasksBeans.get(i).getId();
                            break;
                        };
                    }
                    HttpRequestManager.getInstance().repeat_tasks(disinTaskId, new SimpleHttpCallbackEntity<BaseEntity>() {

                        @Override
                        public void onSuccess(BaseEntity baseEntity) {
                            if (baseEntity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                                Tools.showToast("重复任务成功");
                            }else {
                                onFailure(baseEntity.getErrmsg());
                            }
                        }
                    });
                }else {
                    onFailure(entity.getErrmsg());
                }
            }
        });
    }

    /*
     * 暂停机器人
     * */
    public void pause_robot(){
        HttpRequestManager.getInstance().pause_robot(new SimpleHttpCallbackEntity<PauseRobotEntity>(){

            @Override
            public void onSuccess(PauseRobotEntity entity) {
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    Tools.showToast("暂停机器人");
                }else{
                    onFailure(entity.getErrmsg());
                }
            }
        });
    }

    /*
     * 恢复机器人
     * */
    public void resume_robot(){
        HttpRequestManager.getInstance().resume_robot(new SimpleHttpCallbackEntity<ResumeRobotEntity>() {
            @Override
            public void onSuccess(ResumeRobotEntity entity) {
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    Tools.showToast("恢复机器人");
                }else{
                    onFailure(entity.getErrmsg());
                }
            }
        });
    }

    /*
    * 取消行走任务
    * */
    public void cancel_task_walk(){
        if (disinTaskId == -1){
            return;
        }
        HttpRequestManager.getInstance().cancel_tasks(disinTaskId,new SimpleHttpCallbackEntity<CancelTasksEntity>() {

            @Override
            public void onSuccess(CancelTasksEntity entity) {
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    Tools.showToast("取消成功");
                }else{
                    onFailure(entity.getErrmsg());
                }
            }
        });
    }

    /*
     *重复充电任务，先查询所有任务信息
     * */
    public void repeat_tasks_charge(){
        HttpRequestManager.getInstance().get_all_tasks(new SimpleHttpCallbackEntity<GetAllTasksEntity>() {

            @Override
            public void onSuccess(GetAllTasksEntity entity) {
                //代码健壮性
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK) && entity.getData().getTasks().size() != 0){
                    List<GetAllTasksEntity.DataBean.TasksBean> tasksBeans = entity.getData().getTasks();

                    for (int i = 0; i < tasksBeans.size(); i++) {
                        if (tasksBeans.get(i).getGoal_action() == 10){
                            chargeTaskId = tasksBeans.get(i).getId();
                            break;
                        };
                    }
                    HttpRequestManager.getInstance().repeat_tasks(chargeTaskId, new SimpleHttpCallbackEntity<BaseEntity>() {

                        @Override
                        public void onSuccess(BaseEntity baseEntity) {
                            //健壮性
                            if (baseEntity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                                Tools.showToast("充电");
                            }else{
                                onFailure(baseEntity.getErrmsg());
                            }
                        }

                    });
                }else{
                    onFailure(entity.getErrmsg());
                }
            }
        });
    }

    /*
    * 取消充电任务
    * */
    public void cancel_task_charge(){
        if (chargeTaskId == -1){
            return;
        }

        HttpRequestManager.getInstance().cancel_tasks(chargeTaskId,new SimpleHttpCallbackEntity<CancelTasksEntity>() {

            @Override
            public void onSuccess(CancelTasksEntity entity) {
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    Tools.showToast("取消成功");
                }else{
                    onFailure(entity.getErrmsg());
                }
            }

        });
    }

    /*
     * 重置机器人
     * */
    public void reset_agents(){
        HttpRequestManager.getInstance().reset_agents(new SimpleHttpCallbackEntity<BaseEntity>() {

            @Override
            public void onSuccess(BaseEntity baseEntity) {
                if (baseEntity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    Tools.showToast("重置成功");
                }else{
                    onFailure(baseEntity.getErrmsg());
                }
            }

        });
    }

}
