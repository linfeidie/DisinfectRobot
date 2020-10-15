package com.linfd.scri.disinfectrobot.entity;

/*
*查询所有故障信息
* */


import java.util.List;

public class GetErrorCodeEntity extends BaseEntity{

    /**
     * info : {"charging_station":{"cj02":{"en":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-13 14:56:39","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":2141,"instruction":"","last_update_time":"2020-10-13 14:56:56","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":31,"create_time":"2020-10-13 10:35:58","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":2073,"instruction":"","last_update_time":"2020-10-13 10:36:08","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":17417,"create_time":"2020-10-12 19:40:12","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1922,"instruction":"","last_update_time":"2020-10-12 20:52:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":6367,"create_time":"2020-10-12 15:41:15","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1877,"instruction":"","last_update_time":"2020-10-12 16:07:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":27980,"create_time":"2020-10-10 08:44:51","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1612,"instruction":"","last_update_time":"2020-10-10 11:03:02","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":26,"create_time":"2020-10-09 18:52:16","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1611,"instruction":"","last_update_time":"2020-10-09 18:52:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_cn":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-13 14:56:39","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":2141,"instruction":"","last_update_time":"2020-10-13 14:56:56","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":31,"create_time":"2020-10-13 10:35:58","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":2073,"instruction":"","last_update_time":"2020-10-13 10:36:08","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":17417,"create_time":"2020-10-12 19:40:12","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1922,"instruction":"","last_update_time":"2020-10-12 20:52:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":6367,"create_time":"2020-10-12 15:41:15","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1877,"instruction":"","last_update_time":"2020-10-12 16:07:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":27980,"create_time":"2020-10-10 08:44:51","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1612,"instruction":"","last_update_time":"2020-10-10 11:03:02","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":26,"create_time":"2020-10-09 18:52:16","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1611,"instruction":"","last_update_time":"2020-10-09 18:52:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_tw":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-13 14:56:39","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":2141,"instruction":"","last_update_time":"2020-10-13 14:56:56","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":31,"create_time":"2020-10-13 10:35:58","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":2073,"instruction":"","last_update_time":"2020-10-13 10:36:08","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":17417,"create_time":"2020-10-12 19:40:12","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1922,"instruction":"","last_update_time":"2020-10-12 20:52:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":6367,"create_time":"2020-10-12 15:41:15","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1877,"instruction":"","last_update_time":"2020-10-12 16:07:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":27980,"create_time":"2020-10-10 08:44:51","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1612,"instruction":"","last_update_time":"2020-10-10 11:03:02","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":26,"create_time":"2020-10-09 18:52:16","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1611,"instruction":"","last_update_time":"2020-10-09 18:52:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}]}},"yugong":{"yg00a00020071211000n00":{"en":[{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1244,"create_time":"2020-10-13 14:35:14","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":2137,"instruction":"Please help relocalization manually","last_update_time":"2020-10-13 16:04:54","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":249,"create_time":"2020-10-13 14:30:57","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":2134,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-13 14:35:13","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":15,"create_time":"2020-10-13 14:24:57","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":2132,"instruction":"Please help relocalization manually","last_update_time":"2020-10-13 14:25:12","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":71,"create_time":"2020-10-13 13:51:24","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":2108,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 13:52:35","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":2109,"instruction":"Check node_scan params","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":70,"create_time":"2020-10-13 13:51:23","dtc_id":"B0IB020005","error_mode":"Odom wheel no data","hostname":"yg00a00020071211000n00","id":2107,"instruction":"Reboot chassis: Joystick Safety Button + left Button Left + Right Button B; or reboot the robot","last_update_time":"2020-10-13 13:52:33","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":8,"create_time":"2020-10-13 09:10:09","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":2021,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-13 09:10:17","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 08:52:19","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":1940,"instruction":"Check node_scan params","last_update_time":"2020-10-13 08:52:19","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":32,"create_time":"2020-10-10 15:44:12","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":1730,"instruction":"Please help relocalization manually","last_update_time":"2020-10-10 15:44:44","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":1686,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":1685,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":1507,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":1506,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":0,"create_time":"2020-10-09 09:10:28","dtc_id":"B0IB020005","error_mode":"Odom wheel no data","hostname":"yg00a00020071211000n00","id":1352,"instruction":"Reboot chassis: Joystick Safety Button + left Button Left + Right Button B; or reboot the robot","last_update_time":"2020-10-09 09:10:28","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null}],"zh_cn":[{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1244,"create_time":"2020-10-13 14:35:14","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":2137,"instruction":"请手动辅助重定位","last_update_time":"2020-10-13 16:04:54","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":249,"create_time":"2020-10-13 14:30:57","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":2134,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-13 14:35:13","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":15,"create_time":"2020-10-13 14:24:57","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":2132,"instruction":"请手动辅助重定位","last_update_time":"2020-10-13 14:25:12","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":71,"create_time":"2020-10-13 13:51:24","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":2108,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 13:52:35","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":2109,"instruction":"请检查点云参数","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":70,"create_time":"2020-10-13 13:51:23","dtc_id":"B0IB020005","error_mode":"Odom wheel无数据, chassis节点异常","hostname":"yg00a00020071211000n00","id":2107,"instruction":"chassis重启，或重启机器人","last_update_time":"2020-10-13 13:52:33","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":8,"create_time":"2020-10-13 09:10:09","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":2021,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-13 09:10:17","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 08:52:19","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":1940,"instruction":"请检查点云参数","last_update_time":"2020-10-13 08:52:19","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":32,"create_time":"2020-10-10 15:44:12","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":1730,"instruction":"请手动辅助重定位","last_update_time":"2020-10-10 15:44:44","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":1686,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":1685,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":1507,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":1506,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":0,"create_time":"2020-10-09 09:10:28","dtc_id":"B0IB020005","error_mode":"Odom wheel无数据, chassis节点异常","hostname":"yg00a00020071211000n00","id":1352,"instruction":"chassis重启，或重启机器人","last_update_time":"2020-10-09 09:10:28","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null}],"zh_tw":[{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1244,"create_time":"2020-10-13 14:35:14","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":2137,"instruction":"請手動輔助重定位","last_update_time":"2020-10-13 16:04:54","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":249,"create_time":"2020-10-13 14:30:57","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":2134,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-13 14:35:13","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":15,"create_time":"2020-10-13 14:24:57","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":2132,"instruction":"請手動輔助重定位","last_update_time":"2020-10-13 14:25:12","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":71,"create_time":"2020-10-13 13:51:24","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":2108,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 13:52:35","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":2109,"instruction":"請檢查點雲參數","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":70,"create_time":"2020-10-13 13:51:23","dtc_id":"B0IB020005","error_mode":"Odom wheel無數據","hostname":"yg00a00020071211000n00","id":2107,"instruction":"chassis重啓，或重啓機器人","last_update_time":"2020-10-13 13:52:33","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":8,"create_time":"2020-10-13 09:10:09","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":2021,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-13 09:10:17","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 08:52:19","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":1940,"instruction":"請檢查點雲參數","last_update_time":"2020-10-13 08:52:19","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":32,"create_time":"2020-10-10 15:44:12","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":1730,"instruction":"請手動輔助重定位","last_update_time":"2020-10-10 15:44:44","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":1686,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":1685,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":1507,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":1506,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":0,"create_time":"2020-10-09 09:10:28","dtc_id":"B0IB020005","error_mode":"Odom wheel無數據","hostname":"yg00a00020071211000n00","id":1352,"instruction":"chassis重啓，或重啓機器人","last_update_time":"2020-10-09 09:10:28","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null}]}}}
     */

    private InfoBean info;

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * charging_station : {"cj02":{"en":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-13 14:56:39","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":2141,"instruction":"","last_update_time":"2020-10-13 14:56:56","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":31,"create_time":"2020-10-13 10:35:58","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":2073,"instruction":"","last_update_time":"2020-10-13 10:36:08","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":17417,"create_time":"2020-10-12 19:40:12","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1922,"instruction":"","last_update_time":"2020-10-12 20:52:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":6367,"create_time":"2020-10-12 15:41:15","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1877,"instruction":"","last_update_time":"2020-10-12 16:07:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":27980,"create_time":"2020-10-10 08:44:51","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1612,"instruction":"","last_update_time":"2020-10-10 11:03:02","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":26,"create_time":"2020-10-09 18:52:16","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1611,"instruction":"","last_update_time":"2020-10-09 18:52:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_cn":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-13 14:56:39","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":2141,"instruction":"","last_update_time":"2020-10-13 14:56:56","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":31,"create_time":"2020-10-13 10:35:58","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":2073,"instruction":"","last_update_time":"2020-10-13 10:36:08","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":17417,"create_time":"2020-10-12 19:40:12","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1922,"instruction":"","last_update_time":"2020-10-12 20:52:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":6367,"create_time":"2020-10-12 15:41:15","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1877,"instruction":"","last_update_time":"2020-10-12 16:07:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":27980,"create_time":"2020-10-10 08:44:51","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1612,"instruction":"","last_update_time":"2020-10-10 11:03:02","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":26,"create_time":"2020-10-09 18:52:16","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1611,"instruction":"","last_update_time":"2020-10-09 18:52:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_tw":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-13 14:56:39","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":2141,"instruction":"","last_update_time":"2020-10-13 14:56:56","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":31,"create_time":"2020-10-13 10:35:58","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":2073,"instruction":"","last_update_time":"2020-10-13 10:36:08","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":17417,"create_time":"2020-10-12 19:40:12","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1922,"instruction":"","last_update_time":"2020-10-12 20:52:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":6367,"create_time":"2020-10-12 15:41:15","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1877,"instruction":"","last_update_time":"2020-10-12 16:07:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":27980,"create_time":"2020-10-10 08:44:51","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1612,"instruction":"","last_update_time":"2020-10-10 11:03:02","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":26,"create_time":"2020-10-09 18:52:16","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1611,"instruction":"","last_update_time":"2020-10-09 18:52:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}]}}
         * yugong : {"yg00a00020071211000n00":{"en":[{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1244,"create_time":"2020-10-13 14:35:14","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":2137,"instruction":"Please help relocalization manually","last_update_time":"2020-10-13 16:04:54","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":249,"create_time":"2020-10-13 14:30:57","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":2134,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-13 14:35:13","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":15,"create_time":"2020-10-13 14:24:57","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":2132,"instruction":"Please help relocalization manually","last_update_time":"2020-10-13 14:25:12","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":71,"create_time":"2020-10-13 13:51:24","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":2108,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 13:52:35","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":2109,"instruction":"Check node_scan params","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":70,"create_time":"2020-10-13 13:51:23","dtc_id":"B0IB020005","error_mode":"Odom wheel no data","hostname":"yg00a00020071211000n00","id":2107,"instruction":"Reboot chassis: Joystick Safety Button + left Button Left + Right Button B; or reboot the robot","last_update_time":"2020-10-13 13:52:33","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":8,"create_time":"2020-10-13 09:10:09","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":2021,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-13 09:10:17","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 08:52:19","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":1940,"instruction":"Check node_scan params","last_update_time":"2020-10-13 08:52:19","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":32,"create_time":"2020-10-10 15:44:12","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":1730,"instruction":"Please help relocalization manually","last_update_time":"2020-10-10 15:44:44","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":1686,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":1685,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":1507,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":1506,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":0,"create_time":"2020-10-09 09:10:28","dtc_id":"B0IB020005","error_mode":"Odom wheel no data","hostname":"yg00a00020071211000n00","id":1352,"instruction":"Reboot chassis: Joystick Safety Button + left Button Left + Right Button B; or reboot the robot","last_update_time":"2020-10-09 09:10:28","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null}],"zh_cn":[{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1244,"create_time":"2020-10-13 14:35:14","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":2137,"instruction":"请手动辅助重定位","last_update_time":"2020-10-13 16:04:54","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":249,"create_time":"2020-10-13 14:30:57","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":2134,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-13 14:35:13","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":15,"create_time":"2020-10-13 14:24:57","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":2132,"instruction":"请手动辅助重定位","last_update_time":"2020-10-13 14:25:12","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":71,"create_time":"2020-10-13 13:51:24","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":2108,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 13:52:35","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":2109,"instruction":"请检查点云参数","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":70,"create_time":"2020-10-13 13:51:23","dtc_id":"B0IB020005","error_mode":"Odom wheel无数据, chassis节点异常","hostname":"yg00a00020071211000n00","id":2107,"instruction":"chassis重启，或重启机器人","last_update_time":"2020-10-13 13:52:33","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":8,"create_time":"2020-10-13 09:10:09","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":2021,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-13 09:10:17","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 08:52:19","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":1940,"instruction":"请检查点云参数","last_update_time":"2020-10-13 08:52:19","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":32,"create_time":"2020-10-10 15:44:12","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":1730,"instruction":"请手动辅助重定位","last_update_time":"2020-10-10 15:44:44","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":1686,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":1685,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":1507,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":1506,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":0,"create_time":"2020-10-09 09:10:28","dtc_id":"B0IB020005","error_mode":"Odom wheel无数据, chassis节点异常","hostname":"yg00a00020071211000n00","id":1352,"instruction":"chassis重启，或重启机器人","last_update_time":"2020-10-09 09:10:28","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null}],"zh_tw":[{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1244,"create_time":"2020-10-13 14:35:14","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":2137,"instruction":"請手動輔助重定位","last_update_time":"2020-10-13 16:04:54","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":249,"create_time":"2020-10-13 14:30:57","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":2134,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-13 14:35:13","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":15,"create_time":"2020-10-13 14:24:57","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":2132,"instruction":"請手動輔助重定位","last_update_time":"2020-10-13 14:25:12","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":71,"create_time":"2020-10-13 13:51:24","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":2108,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 13:52:35","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":2109,"instruction":"請檢查點雲參數","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":70,"create_time":"2020-10-13 13:51:23","dtc_id":"B0IB020005","error_mode":"Odom wheel無數據","hostname":"yg00a00020071211000n00","id":2107,"instruction":"chassis重啓，或重啓機器人","last_update_time":"2020-10-13 13:52:33","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":8,"create_time":"2020-10-13 09:10:09","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":2021,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-13 09:10:17","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 08:52:19","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":1940,"instruction":"請檢查點雲參數","last_update_time":"2020-10-13 08:52:19","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":32,"create_time":"2020-10-10 15:44:12","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":1730,"instruction":"請手動輔助重定位","last_update_time":"2020-10-10 15:44:44","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":1686,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":1685,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":1507,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":1506,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":0,"create_time":"2020-10-09 09:10:28","dtc_id":"B0IB020005","error_mode":"Odom wheel無數據","hostname":"yg00a00020071211000n00","id":1352,"instruction":"chassis重啓，或重啓機器人","last_update_time":"2020-10-09 09:10:28","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null}]}}
         */

        private ChargingStationBean charging_station;
        private YugongBean yugong;

        public ChargingStationBean getCharging_station() {
            return charging_station;
        }

        public void setCharging_station(ChargingStationBean charging_station) {
            this.charging_station = charging_station;
        }

        public YugongBean getYugong() {
            return yugong;
        }

        public void setYugong(YugongBean yugong) {
            this.yugong = yugong;
        }

        public static class ChargingStationBean {
            /**
             * cj02 : {"en":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-13 14:56:39","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":2141,"instruction":"","last_update_time":"2020-10-13 14:56:56","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":31,"create_time":"2020-10-13 10:35:58","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":2073,"instruction":"","last_update_time":"2020-10-13 10:36:08","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":17417,"create_time":"2020-10-12 19:40:12","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1922,"instruction":"","last_update_time":"2020-10-12 20:52:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":6367,"create_time":"2020-10-12 15:41:15","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1877,"instruction":"","last_update_time":"2020-10-12 16:07:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":27980,"create_time":"2020-10-10 08:44:51","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1612,"instruction":"","last_update_time":"2020-10-10 11:03:02","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":26,"create_time":"2020-10-09 18:52:16","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":1611,"instruction":"","last_update_time":"2020-10-09 18:52:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_cn":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-13 14:56:39","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":2141,"instruction":"","last_update_time":"2020-10-13 14:56:56","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":31,"create_time":"2020-10-13 10:35:58","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":2073,"instruction":"","last_update_time":"2020-10-13 10:36:08","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":17417,"create_time":"2020-10-12 19:40:12","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1922,"instruction":"","last_update_time":"2020-10-12 20:52:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":6367,"create_time":"2020-10-12 15:41:15","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1877,"instruction":"","last_update_time":"2020-10-12 16:07:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":27980,"create_time":"2020-10-10 08:44:51","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1612,"instruction":"","last_update_time":"2020-10-10 11:03:02","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":26,"create_time":"2020-10-09 18:52:16","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":1611,"instruction":"","last_update_time":"2020-10-09 18:52:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_tw":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-13 14:56:39","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":2141,"instruction":"","last_update_time":"2020-10-13 14:56:56","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":31,"create_time":"2020-10-13 10:35:58","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":2073,"instruction":"","last_update_time":"2020-10-13 10:36:08","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":17417,"create_time":"2020-10-12 19:40:12","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1922,"instruction":"","last_update_time":"2020-10-12 20:52:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":6367,"create_time":"2020-10-12 15:41:15","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1877,"instruction":"","last_update_time":"2020-10-12 16:07:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":27980,"create_time":"2020-10-10 08:44:51","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1612,"instruction":"","last_update_time":"2020-10-10 11:03:02","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":26,"create_time":"2020-10-09 18:52:16","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":1611,"instruction":"","last_update_time":"2020-10-09 18:52:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}]}
             */

            private Cj02Bean cj02;

            public Cj02Bean getCj02() {
                return cj02;
            }

            public void setCj02(Cj02Bean cj02) {
                this.cj02 = cj02;
            }

            public static class Cj02Bean {
                private List<EnBean> en;
                private List<ZhCnBean> zh_cn;
                private List<ZhTwBean> zh_tw;

                public List<EnBean> getEn() {
                    return en;
                }

                public void setEn(List<EnBean> en) {
                    this.en = en;
                }

                public List<ZhCnBean> getZh_cn() {
                    return zh_cn;
                }

                public void setZh_cn(List<ZhCnBean> zh_cn) {
                    this.zh_cn = zh_cn;
                }

                public List<ZhTwBean> getZh_tw() {
                    return zh_tw;
                }

                public void setZh_tw(List<ZhTwBean> zh_tw) {
                    this.zh_tw = zh_tw;
                }

                public static class EnBean {
                    /**
                     * DTC : B5GPM20530
                     * category_group : GP
                     * consequent_code :
                     * count : 46
                     * create_time : 2020-10-13 14:56:39
                     * dtc_id : B5GPM20530
                     * error_mode : Charging station fail
                     * hostname : cj02
                     * id : 2141
                     * instruction :
                     * last_update_time : 2020-10-13 14:56:56
                     * level : 2
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause :
                     * robot_type : charging_station
                     * self_recoverable : N
                     * status : active
                     * system_abbreviation : GPM
                     * system_version : null
                     */

                    private String DTC;
                    private String category_group;
                    private String consequent_code;
                    private int count;
                    private String create_time;
                    private String dtc_id;
                    private String error_mode;
                    private String hostname;
                    private int id;
                    private String instruction;
                    private String last_update_time;
                    private int level;
                    private Object log_file;
                    private Object manual_fix_command;
                    private String potential_cause;
                    private String robot_type;
                    private String self_recoverable;
                    private String status;
                    private String system_abbreviation;
                    private Object system_version;

                    public String getDTC() {
                        return DTC;
                    }

                    public void setDTC(String DTC) {
                        this.DTC = DTC;
                    }

                    public String getCategory_group() {
                        return category_group;
                    }

                    public void setCategory_group(String category_group) {
                        this.category_group = category_group;
                    }

                    public String getConsequent_code() {
                        return consequent_code;
                    }

                    public void setConsequent_code(String consequent_code) {
                        this.consequent_code = consequent_code;
                    }

                    public int getCount() {
                        return count;
                    }

                    public void setCount(int count) {
                        this.count = count;
                    }

                    public String getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(String create_time) {
                        this.create_time = create_time;
                    }

                    public String getDtc_id() {
                        return dtc_id;
                    }

                    public void setDtc_id(String dtc_id) {
                        this.dtc_id = dtc_id;
                    }

                    public String getError_mode() {
                        return error_mode;
                    }

                    public void setError_mode(String error_mode) {
                        this.error_mode = error_mode;
                    }

                    public String getHostname() {
                        return hostname;
                    }

                    public void setHostname(String hostname) {
                        this.hostname = hostname;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getInstruction() {
                        return instruction;
                    }

                    public void setInstruction(String instruction) {
                        this.instruction = instruction;
                    }

                    public String getLast_update_time() {
                        return last_update_time;
                    }

                    public void setLast_update_time(String last_update_time) {
                        this.last_update_time = last_update_time;
                    }

                    public int getLevel() {
                        return level;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public Object getLog_file() {
                        return log_file;
                    }

                    public void setLog_file(Object log_file) {
                        this.log_file = log_file;
                    }

                    public Object getManual_fix_command() {
                        return manual_fix_command;
                    }

                    public void setManual_fix_command(Object manual_fix_command) {
                        this.manual_fix_command = manual_fix_command;
                    }

                    public String getPotential_cause() {
                        return potential_cause;
                    }

                    public void setPotential_cause(String potential_cause) {
                        this.potential_cause = potential_cause;
                    }

                    public String getRobot_type() {
                        return robot_type;
                    }

                    public void setRobot_type(String robot_type) {
                        this.robot_type = robot_type;
                    }

                    public String getSelf_recoverable() {
                        return self_recoverable;
                    }

                    public void setSelf_recoverable(String self_recoverable) {
                        this.self_recoverable = self_recoverable;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getSystem_abbreviation() {
                        return system_abbreviation;
                    }

                    public void setSystem_abbreviation(String system_abbreviation) {
                        this.system_abbreviation = system_abbreviation;
                    }

                    public Object getSystem_version() {
                        return system_version;
                    }

                    public void setSystem_version(Object system_version) {
                        this.system_version = system_version;
                    }
                }

                public static class ZhCnBean {
                    /**
                     * DTC : B5GPM20530
                     * category_group : GP
                     * consequent_code :
                     * count : 46
                     * create_time : 2020-10-13 14:56:39
                     * dtc_id : B5GPM20530
                     * error_mode : 充电站异常
                     * hostname : cj02
                     * id : 2141
                     * instruction :
                     * last_update_time : 2020-10-13 14:56:56
                     * level : 2
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause :
                     * robot_type : charging_station
                     * self_recoverable : N
                     * status : active
                     * system_abbreviation : GPM
                     * system_version : null
                     */

                    private String DTC;
                    private String category_group;
                    private String consequent_code;
                    private int count;
                    private String create_time;
                    private String dtc_id;
                    private String error_mode;
                    private String hostname;
                    private int id;
                    private String instruction;
                    private String last_update_time;
                    private int level;
                    private Object log_file;
                    private Object manual_fix_command;
                    private String potential_cause;
                    private String robot_type;
                    private String self_recoverable;
                    private String status;
                    private String system_abbreviation;
                    private Object system_version;

                    public String getDTC() {
                        return DTC;
                    }

                    public void setDTC(String DTC) {
                        this.DTC = DTC;
                    }

                    public String getCategory_group() {
                        return category_group;
                    }

                    public void setCategory_group(String category_group) {
                        this.category_group = category_group;
                    }

                    public String getConsequent_code() {
                        return consequent_code;
                    }

                    public void setConsequent_code(String consequent_code) {
                        this.consequent_code = consequent_code;
                    }

                    public int getCount() {
                        return count;
                    }

                    public void setCount(int count) {
                        this.count = count;
                    }

                    public String getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(String create_time) {
                        this.create_time = create_time;
                    }

                    public String getDtc_id() {
                        return dtc_id;
                    }

                    public void setDtc_id(String dtc_id) {
                        this.dtc_id = dtc_id;
                    }

                    public String getError_mode() {
                        return error_mode;
                    }

                    public void setError_mode(String error_mode) {
                        this.error_mode = error_mode;
                    }

                    public String getHostname() {
                        return hostname;
                    }

                    public void setHostname(String hostname) {
                        this.hostname = hostname;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getInstruction() {
                        return instruction;
                    }

                    public void setInstruction(String instruction) {
                        this.instruction = instruction;
                    }

                    public String getLast_update_time() {
                        return last_update_time;
                    }

                    public void setLast_update_time(String last_update_time) {
                        this.last_update_time = last_update_time;
                    }

                    public int getLevel() {
                        return level;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public Object getLog_file() {
                        return log_file;
                    }

                    public void setLog_file(Object log_file) {
                        this.log_file = log_file;
                    }

                    public Object getManual_fix_command() {
                        return manual_fix_command;
                    }

                    public void setManual_fix_command(Object manual_fix_command) {
                        this.manual_fix_command = manual_fix_command;
                    }

                    public String getPotential_cause() {
                        return potential_cause;
                    }

                    public void setPotential_cause(String potential_cause) {
                        this.potential_cause = potential_cause;
                    }

                    public String getRobot_type() {
                        return robot_type;
                    }

                    public void setRobot_type(String robot_type) {
                        this.robot_type = robot_type;
                    }

                    public String getSelf_recoverable() {
                        return self_recoverable;
                    }

                    public void setSelf_recoverable(String self_recoverable) {
                        this.self_recoverable = self_recoverable;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getSystem_abbreviation() {
                        return system_abbreviation;
                    }

                    public void setSystem_abbreviation(String system_abbreviation) {
                        this.system_abbreviation = system_abbreviation;
                    }

                    public Object getSystem_version() {
                        return system_version;
                    }

                    public void setSystem_version(Object system_version) {
                        this.system_version = system_version;
                    }
                }

                public static class ZhTwBean {
                    /**
                     * DTC : B5GPM20530
                     * category_group : GP
                     * consequent_code :
                     * count : 46
                     * create_time : 2020-10-13 14:56:39
                     * dtc_id : B5GPM20530
                     * error_mode : 充電站異常
                     * hostname : cj02
                     * id : 2141
                     * instruction :
                     * last_update_time : 2020-10-13 14:56:56
                     * level : 2
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause :
                     * robot_type : charging_station
                     * self_recoverable : N
                     * status : active
                     * system_abbreviation : GPM
                     * system_version : null
                     */

                    private String DTC;
                    private String category_group;
                    private String consequent_code;
                    private int count;
                    private String create_time;
                    private String dtc_id;
                    private String error_mode;
                    private String hostname;
                    private int id;
                    private String instruction;
                    private String last_update_time;
                    private int level;
                    private Object log_file;
                    private Object manual_fix_command;
                    private String potential_cause;
                    private String robot_type;
                    private String self_recoverable;
                    private String status;
                    private String system_abbreviation;
                    private Object system_version;

                    public String getDTC() {
                        return DTC;
                    }

                    public void setDTC(String DTC) {
                        this.DTC = DTC;
                    }

                    public String getCategory_group() {
                        return category_group;
                    }

                    public void setCategory_group(String category_group) {
                        this.category_group = category_group;
                    }

                    public String getConsequent_code() {
                        return consequent_code;
                    }

                    public void setConsequent_code(String consequent_code) {
                        this.consequent_code = consequent_code;
                    }

                    public int getCount() {
                        return count;
                    }

                    public void setCount(int count) {
                        this.count = count;
                    }

                    public String getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(String create_time) {
                        this.create_time = create_time;
                    }

                    public String getDtc_id() {
                        return dtc_id;
                    }

                    public void setDtc_id(String dtc_id) {
                        this.dtc_id = dtc_id;
                    }

                    public String getError_mode() {
                        return error_mode;
                    }

                    public void setError_mode(String error_mode) {
                        this.error_mode = error_mode;
                    }

                    public String getHostname() {
                        return hostname;
                    }

                    public void setHostname(String hostname) {
                        this.hostname = hostname;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getInstruction() {
                        return instruction;
                    }

                    public void setInstruction(String instruction) {
                        this.instruction = instruction;
                    }

                    public String getLast_update_time() {
                        return last_update_time;
                    }

                    public void setLast_update_time(String last_update_time) {
                        this.last_update_time = last_update_time;
                    }

                    public int getLevel() {
                        return level;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public Object getLog_file() {
                        return log_file;
                    }

                    public void setLog_file(Object log_file) {
                        this.log_file = log_file;
                    }

                    public Object getManual_fix_command() {
                        return manual_fix_command;
                    }

                    public void setManual_fix_command(Object manual_fix_command) {
                        this.manual_fix_command = manual_fix_command;
                    }

                    public String getPotential_cause() {
                        return potential_cause;
                    }

                    public void setPotential_cause(String potential_cause) {
                        this.potential_cause = potential_cause;
                    }

                    public String getRobot_type() {
                        return robot_type;
                    }

                    public void setRobot_type(String robot_type) {
                        this.robot_type = robot_type;
                    }

                    public String getSelf_recoverable() {
                        return self_recoverable;
                    }

                    public void setSelf_recoverable(String self_recoverable) {
                        this.self_recoverable = self_recoverable;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getSystem_abbreviation() {
                        return system_abbreviation;
                    }

                    public void setSystem_abbreviation(String system_abbreviation) {
                        this.system_abbreviation = system_abbreviation;
                    }

                    public Object getSystem_version() {
                        return system_version;
                    }

                    public void setSystem_version(Object system_version) {
                        this.system_version = system_version;
                    }
                }
            }
        }

        public static class YugongBean {
            /**
             * yg00a00020071211000n00 : {"en":[{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1244,"create_time":"2020-10-13 14:35:14","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":2137,"instruction":"Please help relocalization manually","last_update_time":"2020-10-13 16:04:54","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":249,"create_time":"2020-10-13 14:30:57","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":2134,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-13 14:35:13","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":15,"create_time":"2020-10-13 14:24:57","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":2132,"instruction":"Please help relocalization manually","last_update_time":"2020-10-13 14:25:12","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":71,"create_time":"2020-10-13 13:51:24","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":2108,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 13:52:35","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":2109,"instruction":"Check node_scan params","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":70,"create_time":"2020-10-13 13:51:23","dtc_id":"B0IB020005","error_mode":"Odom wheel no data","hostname":"yg00a00020071211000n00","id":2107,"instruction":"Reboot chassis: Joystick Safety Button + left Button Left + Right Button B; or reboot the robot","last_update_time":"2020-10-13 13:52:33","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":8,"create_time":"2020-10-13 09:10:09","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":2021,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-13 09:10:17","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 08:52:19","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":1940,"instruction":"Check node_scan params","last_update_time":"2020-10-13 08:52:19","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":32,"create_time":"2020-10-10 15:44:12","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":1730,"instruction":"Please help relocalization manually","last_update_time":"2020-10-10 15:44:44","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":1686,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":1685,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":1507,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120001","error_mode":"no point cloud data","hostname":"yg00a00020071211000n00","id":1506,"instruction":"Please check if the lidar sensor is OK","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":0,"create_time":"2020-10-09 09:10:28","dtc_id":"B0IB020005","error_mode":"Odom wheel no data","hostname":"yg00a00020071211000n00","id":1352,"instruction":"Reboot chassis: Joystick Safety Button + left Button Left + Right Button B; or reboot the robot","last_update_time":"2020-10-09 09:10:28","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null}],"zh_cn":[{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1244,"create_time":"2020-10-13 14:35:14","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":2137,"instruction":"请手动辅助重定位","last_update_time":"2020-10-13 16:04:54","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":249,"create_time":"2020-10-13 14:30:57","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":2134,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-13 14:35:13","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":15,"create_time":"2020-10-13 14:24:57","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":2132,"instruction":"请手动辅助重定位","last_update_time":"2020-10-13 14:25:12","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":71,"create_time":"2020-10-13 13:51:24","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":2108,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 13:52:35","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":2109,"instruction":"请检查点云参数","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":70,"create_time":"2020-10-13 13:51:23","dtc_id":"B0IB020005","error_mode":"Odom wheel无数据, chassis节点异常","hostname":"yg00a00020071211000n00","id":2107,"instruction":"chassis重启，或重启机器人","last_update_time":"2020-10-13 13:52:33","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":8,"create_time":"2020-10-13 09:10:09","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":2021,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-13 09:10:17","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 08:52:19","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":1940,"instruction":"请检查点云参数","last_update_time":"2020-10-13 08:52:19","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":32,"create_time":"2020-10-10 15:44:12","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":1730,"instruction":"请手动辅助重定位","last_update_time":"2020-10-10 15:44:44","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":1686,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":1685,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":1507,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120001","error_mode":"无点云数据","hostname":"yg00a00020071211000n00","id":1506,"instruction":"请检查雷达传感器是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何scan，points2数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":0,"create_time":"2020-10-09 09:10:28","dtc_id":"B0IB020005","error_mode":"Odom wheel无数据, chassis节点异常","hostname":"yg00a00020071211000n00","id":1352,"instruction":"chassis重启，或重启机器人","last_update_time":"2020-10-09 09:10:28","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null}],"zh_tw":[{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1244,"create_time":"2020-10-13 14:35:14","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":2137,"instruction":"請手動輔助重定位","last_update_time":"2020-10-13 16:04:54","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":249,"create_time":"2020-10-13 14:30:57","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":2134,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-13 14:35:13","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":15,"create_time":"2020-10-13 14:24:57","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":2132,"instruction":"請手動輔助重定位","last_update_time":"2020-10-13 14:25:12","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":71,"create_time":"2020-10-13 13:51:24","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":2108,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 13:52:35","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":2109,"instruction":"請檢查點雲參數","last_update_time":"2020-10-13 13:52:35","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":70,"create_time":"2020-10-13 13:51:23","dtc_id":"B0IB020005","error_mode":"Odom wheel無數據","hostname":"yg00a00020071211000n00","id":2107,"instruction":"chassis重啓，或重啓機器人","last_update_time":"2020-10-13 13:52:33","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":8,"create_time":"2020-10-13 09:10:09","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":2021,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-13 09:10:17","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-13 08:52:19","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":1940,"instruction":"請檢查點雲參數","last_update_time":"2020-10-13 08:52:19","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":32,"create_time":"2020-10-10 15:44:12","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":1730,"instruction":"請手動輔助重定位","last_update_time":"2020-10-10 15:44:44","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":1686,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-10 13:34:37","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":1685,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-10 13:34:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":1507,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ120001","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-09 13:45:24","dtc_id":"B0LZ120001","error_mode":"無點雲資料","hostname":"yg00a00020071211000n00","id":1506,"instruction":"請檢查雷達感應器是否正常","last_update_time":"2020-10-09 13:45:24","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0IB020005","category_group":"IB","consequent_code":"","count":0,"create_time":"2020-10-09 09:10:28","dtc_id":"B0IB020005","error_mode":"Odom wheel無數據","hostname":"yg00a00020071211000n00","id":1352,"instruction":"chassis重啓，或重啓機器人","last_update_time":"2020-10-09 09:10:28","level":30,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"IB0","system_version":null}]}
             */

            private Yg00a00020071211000n00Bean yg00a00020071211000n00;

            public Yg00a00020071211000n00Bean getYg00a00020071211000n00() {
                return yg00a00020071211000n00;
            }

            public void setYg00a00020071211000n00(Yg00a00020071211000n00Bean yg00a00020071211000n00) {
                this.yg00a00020071211000n00 = yg00a00020071211000n00;
            }

            public static class Yg00a00020071211000n00Bean {
                private List<EnBeanX> en;
                private List<ZhCnBeanX> zh_cn;
                private List<ZhTwBeanX> zh_tw;

                public List<EnBeanX> getEn() {
                    return en;
                }

                public void setEn(List<EnBeanX> en) {
                    this.en = en;
                }

                public List<ZhCnBeanX> getZh_cn() {
                    return zh_cn;
                }

                public void setZh_cn(List<ZhCnBeanX> zh_cn) {
                    this.zh_cn = zh_cn;
                }

                public List<ZhTwBeanX> getZh_tw() {
                    return zh_tw;
                }

                public void setZh_tw(List<ZhTwBeanX> zh_tw) {
                    this.zh_tw = zh_tw;
                }

                public static class EnBeanX {
                    /**
                     * DTC : B0LZ130000
                     * category_group : LZ
                     * consequent_code :
                     * count : 1244
                     * create_time : 2020-10-13 14:35:14
                     * dtc_id : B0LZ130000
                     * error_mode : relocalization timeout
                     * hostname : yg00a00020071211000n00
                     * id : 2137
                     * instruction : Please help relocalization manually
                     * last_update_time : 2020-10-13 16:04:54
                     * level : 20
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause :
                     * robot_type : yugong
                     * self_recoverable : N
                     * status : active
                     * system_abbreviation : LZ1
                     * system_version : null
                     */

                    private String DTC;
                    private String category_group;
                    private String consequent_code;
                    private int count;
                    private String create_time;
                    private String dtc_id;
                    private String error_mode;
                    private String hostname;
                    private int id;
                    private String instruction;
                    private String last_update_time;
                    private int level;
                    private Object log_file;
                    private Object manual_fix_command;
                    private String potential_cause;
                    private String robot_type;
                    private String self_recoverable;
                    private String status;
                    private String system_abbreviation;
                    private Object system_version;

                    public String getDTC() {
                        return DTC;
                    }

                    public void setDTC(String DTC) {
                        this.DTC = DTC;
                    }

                    public String getCategory_group() {
                        return category_group;
                    }

                    public void setCategory_group(String category_group) {
                        this.category_group = category_group;
                    }

                    public String getConsequent_code() {
                        return consequent_code;
                    }

                    public void setConsequent_code(String consequent_code) {
                        this.consequent_code = consequent_code;
                    }

                    public int getCount() {
                        return count;
                    }

                    public void setCount(int count) {
                        this.count = count;
                    }

                    public String getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(String create_time) {
                        this.create_time = create_time;
                    }

                    public String getDtc_id() {
                        return dtc_id;
                    }

                    public void setDtc_id(String dtc_id) {
                        this.dtc_id = dtc_id;
                    }

                    public String getError_mode() {
                        return error_mode;
                    }

                    public void setError_mode(String error_mode) {
                        this.error_mode = error_mode;
                    }

                    public String getHostname() {
                        return hostname;
                    }

                    public void setHostname(String hostname) {
                        this.hostname = hostname;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getInstruction() {
                        return instruction;
                    }

                    public void setInstruction(String instruction) {
                        this.instruction = instruction;
                    }

                    public String getLast_update_time() {
                        return last_update_time;
                    }

                    public void setLast_update_time(String last_update_time) {
                        this.last_update_time = last_update_time;
                    }

                    public int getLevel() {
                        return level;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public Object getLog_file() {
                        return log_file;
                    }

                    public void setLog_file(Object log_file) {
                        this.log_file = log_file;
                    }

                    public Object getManual_fix_command() {
                        return manual_fix_command;
                    }

                    public void setManual_fix_command(Object manual_fix_command) {
                        this.manual_fix_command = manual_fix_command;
                    }

                    public String getPotential_cause() {
                        return potential_cause;
                    }

                    public void setPotential_cause(String potential_cause) {
                        this.potential_cause = potential_cause;
                    }

                    public String getRobot_type() {
                        return robot_type;
                    }

                    public void setRobot_type(String robot_type) {
                        this.robot_type = robot_type;
                    }

                    public String getSelf_recoverable() {
                        return self_recoverable;
                    }

                    public void setSelf_recoverable(String self_recoverable) {
                        this.self_recoverable = self_recoverable;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getSystem_abbreviation() {
                        return system_abbreviation;
                    }

                    public void setSystem_abbreviation(String system_abbreviation) {
                        this.system_abbreviation = system_abbreviation;
                    }

                    public Object getSystem_version() {
                        return system_version;
                    }

                    public void setSystem_version(Object system_version) {
                        this.system_version = system_version;
                    }
                }

                public static class ZhCnBeanX {
                    /**
                     * DTC : B0LZ130000
                     * category_group : LZ
                     * consequent_code :
                     * count : 1244
                     * create_time : 2020-10-13 14:35:14
                     * dtc_id : B0LZ130000
                     * error_mode : 重定位超时
                     * hostname : yg00a00020071211000n00
                     * id : 2137
                     * instruction : 请手动辅助重定位
                     * last_update_time : 2020-10-13 16:04:54
                     * level : 20
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause : BG节点处于重定位状态超过预设时间
                     * robot_type : yugong
                     * self_recoverable : N
                     * status : active
                     * system_abbreviation : LZ1
                     * system_version : null
                     */

                    private String DTC;
                    private String category_group;
                    private String consequent_code;
                    private int count;
                    private String create_time;
                    private String dtc_id;
                    private String error_mode;
                    private String hostname;
                    private int id;
                    private String instruction;
                    private String last_update_time;
                    private int level;
                    private Object log_file;
                    private Object manual_fix_command;
                    private String potential_cause;
                    private String robot_type;
                    private String self_recoverable;
                    private String status;
                    private String system_abbreviation;
                    private Object system_version;

                    public String getDTC() {
                        return DTC;
                    }

                    public void setDTC(String DTC) {
                        this.DTC = DTC;
                    }

                    public String getCategory_group() {
                        return category_group;
                    }

                    public void setCategory_group(String category_group) {
                        this.category_group = category_group;
                    }

                    public String getConsequent_code() {
                        return consequent_code;
                    }

                    public void setConsequent_code(String consequent_code) {
                        this.consequent_code = consequent_code;
                    }

                    public int getCount() {
                        return count;
                    }

                    public void setCount(int count) {
                        this.count = count;
                    }

                    public String getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(String create_time) {
                        this.create_time = create_time;
                    }

                    public String getDtc_id() {
                        return dtc_id;
                    }

                    public void setDtc_id(String dtc_id) {
                        this.dtc_id = dtc_id;
                    }

                    public String getError_mode() {
                        return error_mode;
                    }

                    public void setError_mode(String error_mode) {
                        this.error_mode = error_mode;
                    }

                    public String getHostname() {
                        return hostname;
                    }

                    public void setHostname(String hostname) {
                        this.hostname = hostname;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getInstruction() {
                        return instruction;
                    }

                    public void setInstruction(String instruction) {
                        this.instruction = instruction;
                    }

                    public String getLast_update_time() {
                        return last_update_time;
                    }

                    public void setLast_update_time(String last_update_time) {
                        this.last_update_time = last_update_time;
                    }

                    public int getLevel() {
                        return level;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public Object getLog_file() {
                        return log_file;
                    }

                    public void setLog_file(Object log_file) {
                        this.log_file = log_file;
                    }

                    public Object getManual_fix_command() {
                        return manual_fix_command;
                    }

                    public void setManual_fix_command(Object manual_fix_command) {
                        this.manual_fix_command = manual_fix_command;
                    }

                    public String getPotential_cause() {
                        return potential_cause;
                    }

                    public void setPotential_cause(String potential_cause) {
                        this.potential_cause = potential_cause;
                    }

                    public String getRobot_type() {
                        return robot_type;
                    }

                    public void setRobot_type(String robot_type) {
                        this.robot_type = robot_type;
                    }

                    public String getSelf_recoverable() {
                        return self_recoverable;
                    }

                    public void setSelf_recoverable(String self_recoverable) {
                        this.self_recoverable = self_recoverable;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getSystem_abbreviation() {
                        return system_abbreviation;
                    }

                    public void setSystem_abbreviation(String system_abbreviation) {
                        this.system_abbreviation = system_abbreviation;
                    }

                    public Object getSystem_version() {
                        return system_version;
                    }

                    public void setSystem_version(Object system_version) {
                        this.system_version = system_version;
                    }

                    @Override
                    public String toString() {
                        return "ZhCnBeanX{" +
                                "DTC='" + DTC + '\'' +
                                ", category_group='" + category_group + '\'' +
                                ", consequent_code='" + consequent_code + '\'' +
                                ", count=" + count +
                                ", create_time='" + create_time + '\'' +
                                ", dtc_id='" + dtc_id + '\'' +
                                ", error_mode='" + error_mode + '\'' +
                                ", hostname='" + hostname + '\'' +
                                ", id=" + id +
                                ", instruction='" + instruction + '\'' +
                                ", last_update_time='" + last_update_time + '\'' +
                                ", level=" + level +
                                ", log_file=" + log_file +
                                ", manual_fix_command=" + manual_fix_command +
                                ", potential_cause='" + potential_cause + '\'' +
                                ", robot_type='" + robot_type + '\'' +
                                ", self_recoverable='" + self_recoverable + '\'' +
                                ", status='" + status + '\'' +
                                ", system_abbreviation='" + system_abbreviation + '\'' +
                                ", system_version=" + system_version +
                                '}';
                    }
                }

                public static class ZhTwBeanX {
                    /**
                     * DTC : B0LZ130000
                     * category_group : LZ
                     * consequent_code :
                     * count : 1244
                     * create_time : 2020-10-13 14:35:14
                     * dtc_id : B0LZ130000
                     * error_mode : 重定位超時
                     * hostname : yg00a00020071211000n00
                     * id : 2137
                     * instruction : 請手動輔助重定位
                     * last_update_time : 2020-10-13 16:04:54
                     * level : 20
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause :
                     * robot_type : yugong
                     * self_recoverable : N
                     * status : active
                     * system_abbreviation : LZ1
                     * system_version : null
                     */

                    private String DTC;
                    private String category_group;
                    private String consequent_code;
                    private int count;
                    private String create_time;
                    private String dtc_id;
                    private String error_mode;
                    private String hostname;
                    private int id;
                    private String instruction;
                    private String last_update_time;
                    private int level;
                    private Object log_file;
                    private Object manual_fix_command;
                    private String potential_cause;
                    private String robot_type;
                    private String self_recoverable;
                    private String status;
                    private String system_abbreviation;
                    private Object system_version;

                    public String getDTC() {
                        return DTC;
                    }

                    public void setDTC(String DTC) {
                        this.DTC = DTC;
                    }

                    public String getCategory_group() {
                        return category_group;
                    }

                    public void setCategory_group(String category_group) {
                        this.category_group = category_group;
                    }

                    public String getConsequent_code() {
                        return consequent_code;
                    }

                    public void setConsequent_code(String consequent_code) {
                        this.consequent_code = consequent_code;
                    }

                    public int getCount() {
                        return count;
                    }

                    public void setCount(int count) {
                        this.count = count;
                    }

                    public String getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(String create_time) {
                        this.create_time = create_time;
                    }

                    public String getDtc_id() {
                        return dtc_id;
                    }

                    public void setDtc_id(String dtc_id) {
                        this.dtc_id = dtc_id;
                    }

                    public String getError_mode() {
                        return error_mode;
                    }

                    public void setError_mode(String error_mode) {
                        this.error_mode = error_mode;
                    }

                    public String getHostname() {
                        return hostname;
                    }

                    public void setHostname(String hostname) {
                        this.hostname = hostname;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getInstruction() {
                        return instruction;
                    }

                    public void setInstruction(String instruction) {
                        this.instruction = instruction;
                    }

                    public String getLast_update_time() {
                        return last_update_time;
                    }

                    public void setLast_update_time(String last_update_time) {
                        this.last_update_time = last_update_time;
                    }

                    public int getLevel() {
                        return level;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public Object getLog_file() {
                        return log_file;
                    }

                    public void setLog_file(Object log_file) {
                        this.log_file = log_file;
                    }

                    public Object getManual_fix_command() {
                        return manual_fix_command;
                    }

                    public void setManual_fix_command(Object manual_fix_command) {
                        this.manual_fix_command = manual_fix_command;
                    }

                    public String getPotential_cause() {
                        return potential_cause;
                    }

                    public void setPotential_cause(String potential_cause) {
                        this.potential_cause = potential_cause;
                    }

                    public String getRobot_type() {
                        return robot_type;
                    }

                    public void setRobot_type(String robot_type) {
                        this.robot_type = robot_type;
                    }

                    public String getSelf_recoverable() {
                        return self_recoverable;
                    }

                    public void setSelf_recoverable(String self_recoverable) {
                        this.self_recoverable = self_recoverable;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getSystem_abbreviation() {
                        return system_abbreviation;
                    }

                    public void setSystem_abbreviation(String system_abbreviation) {
                        this.system_abbreviation = system_abbreviation;
                    }

                    public Object getSystem_version() {
                        return system_version;
                    }

                    public void setSystem_version(Object system_version) {
                        this.system_version = system_version;
                    }
                }
            }
        }
    }
}
