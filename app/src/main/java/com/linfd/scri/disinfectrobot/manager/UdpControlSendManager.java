package com.linfd.scri.disinfectrobot.manager;

import android.util.Log;


import com.blanke.xsocket.tcp.client.bean.TargetInfo;
import com.blanke.xsocket.tcp.client.bean.TcpMsg;
import com.blanke.xsocket.udp.client.UdpClientConfig;
import com.blanke.xsocket.udp.client.XUdp;
import com.blanke.xsocket.udp.client.bean.UdpMsg;
import com.blanke.xsocket.udp.client.listener.UdpClientListener;
import com.linfd.scri.disinfectrobot.Contanst;
import com.linfd.scri.disinfectrobot.GsonUtil;
import com.linfd.scri.disinfectrobot.entity.GetApmtStateEntity;
import com.linfd.scri.disinfectrobot.entity.GetChargerPoseEntity;
import com.linfd.scri.disinfectrobot.entity.GetDisinStateEntity;
import com.linfd.scri.disinfectrobot.entity.GetMachTypeEntity;
import com.linfd.scri.disinfectrobot.entity.GetMapEntity;
import com.linfd.scri.disinfectrobot.entity.GetMapExistEntity;
import com.linfd.scri.disinfectrobot.entity.GetRobotStatusEntity;
import com.linfd.scri.disinfectrobot.entity.LoginEntity;
import com.linfd.scri.disinfectrobot.entity.OnlineIdsEntity;
import com.linfd.scri.disinfectrobot.entity.RegisterEntity;
import com.linfd.scri.disinfectrobot.entity.SetActionCmdEntity;
import com.linfd.scri.disinfectrobot.entity.SetApmtEntity;
import com.linfd.scri.disinfectrobot.entity.SetBaseCmdEntity;
import com.linfd.scri.disinfectrobot.entity.SetBindEntity;
import com.linfd.scri.disinfectrobot.entity.SetCycleActionEntity;
import com.linfd.scri.disinfectrobot.entity.SetDisinActionEntity;
import com.linfd.scri.disinfectrobot.entity.SetDisinCmdEntity;
import com.linfd.scri.disinfectrobot.entity.SetGoalActionEntity;
import com.linfd.scri.disinfectrobot.entity.SetHeartbeatEntity;
import com.linfd.scri.disinfectrobot.entity.SetInitPoseEntity;
import com.linfd.scri.disinfectrobot.entity.SetManualCtrlEntity;
import com.linfd.scri.disinfectrobot.entity.SetNaviModeEntity;
import com.linfd.scri.disinfectrobot.entity.SetSaveMapEntity;
import com.linfd.scri.disinfectrobot.entity.SetWorkModeEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件描述：.
 * <p> UDP 管理类
 * 作者：Created by 林飞堞 on 2019/12/31
 * <p>
 * 版本号：donghaoProect
 */
public class UdpControlSendManager {

    public static final String TAG = UdpControlSendManager.class.getSimpleName();
    private static UdpControlSendManager instance;

    private TargetInfo targetInfo = new TargetInfo(Contanst.TargetIp, Contanst.TargetPort);//192.168.1.107   47.112.49.201;

    private XUdp mXUdp;

    int count = 0;

    public static UdpControlSendManager getInstance() {

        if (instance == null) {
            synchronized (UdpControlSendManager.class) {
                if (instance == null) {
                    instance = new UdpControlSendManager();
                }
            }
        }
        return instance;
    }

    public void addUdpClientListener(UdpClientListener listener) {
        mXUdp.addUdpClientListener(listener);
    }

    /*
     * 构造函数
     * */
    public UdpControlSendManager() {
        if (mXUdp == null) {
            mXUdp = XUdp.getUdpClient();
            // mXUdp.addUdpClientListener(this);
        }
        mXUdp.config(new UdpClientConfig.Builder()
                .setLocalPort(Contanst.LocalPort).create());
    }

    public void sendOrder(Object object) {
        String order = GsonUtil.GsonString(object);
        Log.e(TAG, "order" + order);
        mXUdp.sendMsg(new UdpMsg(GsonUtil.GsonString(object) + "\n", targetInfo, TcpMsg.MsgType.Send), true);
    }

    /*
     * 注册
     *
     * */
    public void set_register(String id, String user_name, String pass_word) {
        RegisterEntity entity = new RegisterEntity();
        entity.setId(id);
        entity.setMach_type(0);
        entity.setPass_word(pass_word);
        entity.setUser_name(user_name);
        sendOrder(entity);
    }

    /*
     * 登录
     * */
    public void set_online(String id, String user_name, String pass_word) {
        LoginEntity entity = new LoginEntity();
        entity.setId(id);
        entity.setMach_type(0);
        entity.setPass_word(pass_word);
        entity.setUser_name(user_name);
        sendOrder(entity);
    }

    /*
     * 获取设备id
     * */

    public void get_online_ids(String id) {
        OnlineIdsEntity entity = new OnlineIdsEntity();
        entity.setId(id);
        sendOrder(entity);
    }

    /*
     * 绑定小车
     * */

    public void set_bind(String id) {
        SetBindEntity entity = new SetBindEntity();
        entity.setId(id);
        entity.setBind_id("e2baac1d-9ec5-4461-a8fb-7b53e202bdf7");
        sendOrder(entity);
    }

    /*
     * 心跳包
     * */
    public void set_heartbeat(String id) {
        SetHeartbeatEntity entity = new SetHeartbeatEntity();
        entity.setId(id);
        sendOrder(entity);
    }

    /*
     * 设置模式（已经废弃）
     * */

    public void set_work_mode(String id, String to_id, String work_mode) {
        SetWorkModeEntity entity = new SetWorkModeEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        entity.setWork_mode(work_mode);
        sendOrder(entity);
    }

    /*
     * 手动控制模式控制
     * */
    public void set_manual_ctrl(String id, String to_id, double linear_speed, double angular_speed, double angle, double dist) {
        SetManualCtrlEntity entity = new SetManualCtrlEntity();
        entity.setAngle(angle);
        entity.setAngular_speed(angular_speed);
        entity.setDist(dist);
        entity.setId(id);
        entity.setLinear_speed(linear_speed);
        entity.setTimeout(2);
        entity.setTo_id(to_id);
        sendOrder(entity);
    }

    /*
     *向右转
     * */

    public void rightward(String id, String to_id, double angular_speed) {
        set_manual_ctrl(id, to_id, 0, -angular_speed, 0, 0);
    }

    /*
     * 向左转
     * */
    public void leftward(String id, String to_id, double angular_speed) {
        set_manual_ctrl(id, to_id, 0, angular_speed, 0, 0);
    }

    /*
     * 向前走
     * */
    public void forward(String id, String to_id, double linear_speed) {
        set_manual_ctrl(id, to_id, linear_speed, 0, 0, 0);
    }


    /*
     * 向后走
     * */

    public void backward(String id, String to_id, double linear_speed) {
        set_manual_ctrl(id, to_id, -linear_speed, 0, 0, 0);
    }

    /*
     * 获取地图
     * */

    public void get_map(String id, String to_id, int start, int end) {
        GetMapEntity entity = new GetMapEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        entity.setGet_map_type("data");
        List<Integer> pack_num = new ArrayList<>();
        pack_num.add(start);
        pack_num.add(end);
        entity.setGet_pack_num(pack_num);

        sendOrder(entity);
    }

    /*
     *   获取地地图参数
     * */

    public void get_map_param(String id, String to_id) {
        GetMapEntity entity = new GetMapEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        entity.setGet_map_type("param");
        List<Integer> pack_num = new ArrayList<>();
        entity.setGet_pack_num(pack_num);

        sendOrder(entity);
    }


    /*
     * 获取消毒机器人状态
     * */

    public void get_disin_state(String id, String to_id) {
        GetDisinStateEntity entity = new GetDisinStateEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        sendOrder(entity);
    }

    /*
     * 获取机器人状态
     * */

    public void get_robot_status(String id, String to_id) {
        GetRobotStatusEntity entity = new GetRobotStatusEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        sendOrder(entity);
    }

    /*
     * 获取机器人类型
     * */

    public void get_mach_type(String id, String to_id) {
        GetMachTypeEntity entity = new GetMachTypeEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        sendOrder(entity);
    }

    /*
     * 获取预约状态
     * */

    public void get_apmt_state(String id, String to_id) {
        GetApmtStateEntity entity = new GetApmtStateEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        sendOrder(entity);

    }

    /*
     * 设置预约任务
     * */

    private void set_apmt(String id, String to_id,String action,double time) {
        SetApmtEntity entity = new SetApmtEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        entity.setAction(action);
        entity.setTime(time);
        sendOrder(entity);
    }
    /*
     * 设置预约任务 添加
     * */

    public void set_apmt_add(String id, String to_id,double time) {
        this.set_apmt(id,to_id,"add",time);
    }
    /*
     * 设置预约任务 删除
     * */

    public void set_apmt_del(String id, String to_id,double time) {
        this.set_apmt(id,to_id,"del",time);
    }

    /*
     * 设置消毒任务 spray喷雾开启，0,停止，１小，２大
     * */
    private void set_disin_action(String id, String to_id, int spray) {
        SetDisinActionEntity entity = new SetDisinActionEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        entity.setSpray(spray);
        sendOrder(entity);
    }

    /*
     * 设置消毒任务     喷雾_停
     * */
    public void set_disin_action_stop(String id, String to_id) {
        this.set_disin_action(id,to_id,0);
    }
    /*
     * 设置消毒任务     喷雾_弱
     * */
    public void set_disin_action_weak(String id, String to_id) {
        this.set_disin_action(id,to_id,1);
    }

    /*
     * 设置消毒任务     喷雾_强
     * */
    public void set_disin_action_strong(String id, String to_id) {
        this.set_disin_action(id,to_id,2);
    }
    /*
     * 启动或停止任务队列
     * */
    private void set_action_cmd(String id, String to_id,String cmd){
        SetActionCmdEntity entity = new SetActionCmdEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        entity.setCmd(cmd);
        sendOrder(entity);
    }
    /*
     * 启动或停止任务队列  启动
     * */
    public void set_action_cmd_start(String id, String to_id){
        this.set_action_cmd(id,to_id,"start");
    }
    /*
     * 启动或停止任务队列  停止
     * */
    public void set_action_cmd_stop(String id, String to_id){
        this.set_action_cmd(id,to_id,"stop");
    }
    /*
     * 启动或停止任务队列  暂停
     * */
    public void set_action_cmd_pause(String id, String to_id){
        this.set_action_cmd(id,to_id,"pause");
    }
    /*
     * 启动或停止任务队列  恢复
     * */
    public void set_action_cmd_resume(String id, String to_id){
        this.set_action_cmd(id,to_id,"resume");
    }

    /*
     * 启动或停止任务队列  退出当前任务
     * */
    public void set_action_cmd_exit_cur(String id, String to_id){
        this.set_action_cmd(id,to_id,"exit_cur");
    }
    /*
     * 设置消毒设备命令  与任务隔离
     * */
    private void set_disin_cmd(String id, String to_id,int cmd,int spray_level){
        SetDisinCmdEntity entity = new SetDisinCmdEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        entity.setCmd(cmd);
        entity.setSpray_level(spray_level);
        sendOrder(entity);
    }

    /*
            * 设置消毒设备命令  与任务隔离  喷雾 开
     * */
    public void set_disin_cmd_spray_on(String id, String to_id){
        this.set_disin_cmd(id,to_id,1,1);
    }
    /*
     * 设置消毒设备命令  与任务隔离  喷雾 关
     * */
    public void set_disin_cmd_spray_off(String id, String to_id,int spray,int spray_fan,int spray_motor){
        this.set_disin_cmd(id,to_id,0,0);
    }
    /*
     * 设置消毒设备命令  与任务隔离  喷雾风扇 开
     * */
    private void set_disin_cmd_spray_fan_on(String id, String to_id,int spray,int spray_fan,int spray_motor){
      //  this.set_disin_cmd(id,to_id,0,1,0);
    }
    /*
     * 设置消毒设备命令  与任务隔离  喷雾风扇 关
     * */
    private void set_disin_cmd_spray_fan_off(String id, String to_id,int spray,int spray_fan,int spray_motor){
       // this.set_disin_cmd(id,to_id,0,0,0);
    }

    /*
     * 设置消毒设备命令  与任务隔离  吸水电机 开
     * */
    private void set_disin_cmd_spray_motor_on(String id, String to_id,int spray,int spray_fan,int spray_motor){
       // this.set_disin_cmd(id,to_id,0,0,1);
    }
    /*
     * 设置消毒设备命令  与任务隔离  吸水电机 关
     * */
    private void set_disin_cmd_spray_motor_off(String id, String to_id,int spray,int spray_fan,int spray_motor){
      //  this.set_disin_cmd(id,to_id,0,0,0);
    }
    /*
     *设置底盘命令
     * "power":0,//底盘电源,0无动作,1关机,2休眠
    "ext_power":true,//设置外部电源开关,true
     * */
    private void set_base_cmd(String id, String to_id,int power,boolean ext_power){
        SetBaseCmdEntity entity = new SetBaseCmdEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        entity.setPower(power);
        entity.setExt_power(ext_power);
        sendOrder(entity);
    }
    public void set_base_cmd_power_on(String id, String to_id){
        this.set_base_cmd(id,to_id,1,false);
    }
    public void set_base_cmd_power_off(String id, String to_id){
        this.set_base_cmd(id,to_id,0,false);
    }
    public void set_base_cmd_power_sleep(String id, String to_id){
        this.set_base_cmd(id,to_id,0,false);
    }

    /*
    *设置机器人定位
    * */

    public void set_init_pose(String id, String to_id,double x,double y, double yaw){
        SetInitPoseEntity entity = new SetInitPoseEntity();
        List<Double> post = new ArrayList<>();
        post.add(x);
        post.add(y);
        post.add(0d);
        post.add(yaw);
        entity.setPose(post);
        entity.setId(id);
        entity.setTo_id(to_id);
        sendOrder(entity);

    }
    /*
    * 目标点任务
    * */

    public void set_goal_action(String id, String to_id,double x,double y){
        SetGoalActionEntity entity = new SetGoalActionEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        entity.setGoal_id(count);
        entity.setMove_type("flex");
        entity.setMax_a(0.3d);
        entity.setMax_l(0.3d);
        entity.setTime_out(0d);
        List<Double> post = new ArrayList<>();
        post.add(x);
        post.add(y);
        post.add(0d);
        entity.setGoal(post);
        sendOrder(entity);
        count++;//每次加1
    }
    /*
    * 设置机器人导航模式 localization  true 定位模式,false建图模式(默认)
    * */
    private void set_navi_mode(String id, String to_id,boolean localization){
        SetNaviModeEntity entity = new SetNaviModeEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        entity.setLocalization(localization);
        sendOrder(entity);
    }
/*
* 建图模式
* */
    public void set_navi_mode_build(String id, String to_id){
        this.set_navi_mode(id,to_id,false);
    }
    /*
    * 定位模式
    * */
    public void set_navi_mode_loc(String id, String to_id){
        this.set_navi_mode(id,to_id,true);
    }
    /*
    *保存当前地图
    * */
    public void set_save_map(String id, String to_id){
        SetSaveMapEntity entity = new SetSaveMapEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        sendOrder(entity);
    }

    /*
    * 循环任务
    * */
    public void set_cycle_action(String id, String to_id){
        SetCycleActionEntity entity = new SetCycleActionEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        entity.setCycle_time(0);
        entity.setJump_to_id(0);
        sendOrder(entity);
    }

    /*
    * 充电座位置
    * */
    public void get_charger_pose(String id, String to_id){
        GetChargerPoseEntity entity = new GetChargerPoseEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        sendOrder(entity);
    }

    /*
    * 获取历史地图记录
    * */
    public void get_map_exist(String id, String to_id){
        GetMapExistEntity entity = new GetMapExistEntity();
        entity.setId(id);
        entity.setTo_id(to_id);
        sendOrder(entity);
    }

}
