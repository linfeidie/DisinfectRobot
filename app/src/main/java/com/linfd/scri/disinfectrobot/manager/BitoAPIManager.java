package com.linfd.scri.disinfectrobot.manager;

import com.linfd.scri.disinfectrobot.Contanst;
import com.linfd.scri.disinfectrobot.R;
import com.linfd.scri.disinfectrobot.Tools;
import com.linfd.scri.disinfectrobot.entity.BaseEntity;
import com.linfd.scri.disinfectrobot.entity.BaseEntity2;
import com.linfd.scri.disinfectrobot.entity.CancelTasksEntity;
import com.linfd.scri.disinfectrobot.entity.ChargingStationsEntity;
import com.linfd.scri.disinfectrobot.entity.GetAgentsRegisterableEntity;
import com.linfd.scri.disinfectrobot.entity.GetAllTasksEntity;
import com.linfd.scri.disinfectrobot.entity.GetErrorCodeResultEntity;
import com.linfd.scri.disinfectrobot.entity.GetRobotPerformTaskEntity;
import com.linfd.scri.disinfectrobot.entity.PauseRobotEntity;
import com.linfd.scri.disinfectrobot.entity.ResumeRobotEntity;
import com.linfd.scri.disinfectrobot.entity.RobotRegisterEntity;
import com.linfd.scri.disinfectrobot.entity.RobotUnregisterEntity;
import com.linfd.scri.disinfectrobot.eventbus.ChargeModeEvent;
import com.linfd.scri.disinfectrobot.eventbus.RobotRegisterEvent;
import com.linfd.scri.disinfectrobot.listener.SimpleHttpCallbackEntity;

import org.greenrobot.eventbus.EventBus;

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
                RobotRegisterEvent event = new RobotRegisterEvent();
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    event.status = 0 ;
                    Tools.showToast("注册成功");
                }else{
                    onFailure(entity.getErrmsg());
                    event.status = 1;
                }
                EventBus.getDefault().post(event);
            }

        });
    }

    /*
    * 关闭韩信
    * */
    public void hanxin_stop(){
        HttpRequestManager.getInstance().hanxin_stop(new SimpleHttpCallbackEntity<BaseEntity2>() {

            @Override
            public void onSuccess(BaseEntity2 entity) {
                RobotRegisterEvent event = new RobotRegisterEvent();
                if (entity.getCode() == Contanst.REQUEST_OK_0){
                    Tools.showToast("韩信已关闭");
                    event.status = 2;

                }else{
                    onFailure(entity.getMessage());
                }
                EventBus.getDefault().post(event);
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
     *重复充电任务，先查询所有任务信息  手动模式
     * */
    public void repeat_tasks_charge_man(){
        this.repeat_tasks_charge_mode(1);

    }
    /*
     *重复充电任务，先查询所有任务信息  自动模式
     * */
    public void repeat_tasks_charge_auto(){
        this.repeat_tasks_charge_mode(3);

    }
    /*
     *重复充电任务，先查询所有任务信息  参数模式
     * */
    public void repeat_tasks_charge_mode(final int mode){
        HttpRequestManager.getInstance().switch_charging_mode(mode, new SimpleHttpCallbackEntity<BaseEntity2>() {
            @Override
            public void onSuccess(BaseEntity2 baseEntity) {
                if (baseEntity.getCode() == Contanst.REQUEST_OK_200){
                    repeat_tasks_charge();
                    //发送模式变化监听
                    ChargeModeEvent event = new ChargeModeEvent();
                    event.mode = mode;
                    EventBus.getDefault().post(event);
                }else{
                    onFailure(baseEntity.getMessage());
                }
            }
        });

    }

    /*
    * 未改为手动充电模式下
    * */
    private void repeat_tasks_charge() {
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
    public void cancel_task_charge_man(){

        HttpRequestManager.getInstance().switch_charging_mode(1, new SimpleHttpCallbackEntity<BaseEntity2>() {
            @Override
            public void onSuccess(BaseEntity2 baseEntity) {
                if (baseEntity.getCode() ==Contanst.REQUEST_OK_200){
                    cancel_task_byID();
                }else{
                    onFailure(baseEntity.getMessage());
                }
            }
        });

    }

   /*
   * 获得
   * */
    public void cancel_task_byID() {

        // 先查询当前任务 获得id
        HttpRequestManager.getInstance().get_robot_perform_task(new SimpleHttpCallbackEntity<GetRobotPerformTaskEntity>() {

            @Override
            public void onSuccess(GetRobotPerformTaskEntity entity) {
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    if (entity.getData() != null && entity.getData().getTasks().size() != 0)
                    cancel_task_charge(entity.getData().getTasks().get(0).getId());//获得id
                }else{
                    onFailure(entity.getErrmsg());
                }
            }
        });


    }

    /*
     * 未手动模式之前
     * */
    private void cancel_task_charge(int chargeTaskId) {
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
     * 重置机器人（重置+注销）
     * */
    public void reset_agents(){
        HttpRequestManager.getInstance().reset_agents(new SimpleHttpCallbackEntity<BaseEntity>() {

            @Override
            public void onSuccess(BaseEntity baseEntity) {
                if (baseEntity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    //Tools.showToast("重置成功");
                    robot_unregister();//再注销
                }else{
                    onFailure(baseEntity.getErrmsg());
                }
            }

        });
    }

    /*
     * 查询所有故障信息
     * */
    public void get_error_code(){
        HttpRequestManager.getInstance().get_error_code(new SimpleHttpCallbackEntity<GetErrorCodeResultEntity>() {

            @Override
            public void onSuccess(GetErrorCodeResultEntity entity) {

            }

        });
    }

    /*
     * 注销机器人
     * */
    public void robot_unregister(){
        HttpRequestManager.getInstance().robot_unregister(new SimpleHttpCallbackEntity<RobotUnregisterEntity>() {

            @Override
            public void onSuccess(RobotUnregisterEntity entity) {
                RobotRegisterEvent event = new RobotRegisterEvent();
                if (entity.getErrno().equalsIgnoreCase(Contanst.REQUEST_OK)){
                    event.status = 2;
                    Tools.showToast("注销成功");
                }else{
                    event.status = 3;
                    onFailure(entity.getErrmsg());
                }
                EventBus.getDefault().post(event);
            }
        });
    }

}
