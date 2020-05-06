package com.linfd.scri.disinfectrobot;

import android.os.Environment;

import com.linfd.scri.disinfectrobot.entity.GetMapParamCallbackEntity;


public class Contanst {

    public static  String map_time ;

    public static final String TargetIp = "192.168.5.100";//目标IP地址   192.168.2.107

    public static final int TargetPort = 8999; //目标端口8999 8080

    public static final int LocalPort = 8989 ;//本地端口

    public static  int MAP_HASHCODE = -1;//正在展示的地图的哈希码

    public static final String ROOT = Environment.getExternalStorageDirectory().getAbsolutePath();//根目录

    public static final String PROJECT_ROOT = ROOT + "/scri";//项目根目录

    public static final String CACHE_DIR = PROJECT_ROOT + "/cache";//用于缓存显示中的文件夹 保存原始地图，可整体删掉

    public static final String HISTORY_PATH_DIR = PROJECT_ROOT + "/historypath";//用于保存操作完的带路径的

    public static final String HISTORY_ORIGINAL_DIR = PROJECT_ROOT + "/historyoriginal";//历史最近一次的 原始图
    public static GetMapParamCallbackEntity MAPPARAMENTITY= null;//测试

    public static final int HEARTBEAT = 10000; //心跳

    public static final int GETMAPFREQUENCY =  1000*3*1;//地图更新检查频率 10s

    public static final int DRAWPATHFREQUENCY = 2*1000; //绘制路径的刷新频率

    public static final String TRUE = "true" ;

    public static final int ORDER_INTERVAL = 1000 ; //按钮按下命令间隔

    public static final int REQUEST_MAPPACK_COUNT = 5;//UDP 下请求每次获取的包数

    public  static String id = "b4f89c82-8d3f-4b15-b293-0c605678a537"; //本客户的ID

    public static  String to_id = "02b01499-f501-4745-b601-43bc8737ed08";//控制都id e2baac1d-9ec5-4461-a8fb-7b53e202bdf7


    public static  GetMapParamCallbackEntity mapParamCallbackEntity = null;//地图的参数信息

    /*
    * 命令请求
    * */
    public static final String get_robot_status = "get_robot_status";//获取机器人状态

    public static final String get_disin_state = "get_disin_state";//获取消毒状态

    public static final String get_apmt_state = "get_apmt_state";//获取预约状态

    public static final String set_apmt = "set_apmt";//设置预约任务

    public static final String get_mach_type = "get_mach_type";//机器类型

    public static final String set_disin_action = "set_disin_action";//消毒任务

    public static final String set_action_cmd = "set_action_cmd"; //开启，暂停

    public static final String set_base_cmd = "set_base_cmd";//底盘命令

    public static final String set_disin_cmd = "set_disin_cmd";//设置消毒设备命令  与任务隔离

    public static final String set_goal_action = "set_goal_action";//目标点任务

    public static final String set_cycle_action = "set_cycle_action";//循环任务

    public static final String get_charger_pose = "get_charger_pose"; //获取充电座位置

    public static final String get_map_exist = "get_map_exist";//获取历史地图记录

    public static final String set_charge_water_action = "set_charge_water_action"; //对接换水任务(清扫机器人用)
    /*
    * 指令类型  返回类型
    * */

    public static final String ser_ack_online = "ser_ack_online";

    public static final String ser_ack_online_ids = "ser_ack_online_ids";

    public static final String ser_ack_onbind = "ser_ack_onbind";

    public static final String robot_status = "robot_status";//机器人状态

    public static final String ser_ack_offline = "ser_ack_offline"; //下线返回

    public static final String ser_ack_heartbeat = "ser_ack_heartbeat";

    public static final String map_data = "map_data"; //返回地图数据

    public static final String map_param = "map_param";//地图参数返回

    public static final String  disin_state= "disin_state";//消毒状态返回

    public static final String apmt_state = "apmt_state"; //预约状态
    public static final String robot_ack = "robot_ack";//所有设置

    public static final String mach_type = "mach_type";//机器类型

    public static final String charger_pose = "charger_pose"; //充电座位置

}
