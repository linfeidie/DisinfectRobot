package com.linfd.scri.disinfectrobot.entity;

/*
*查询所有故障信息
* */


import java.util.List;

public class GetErrorCodeEntity extends BaseEntity{


    /**
     * info : {"charging_station":{"cj02":{"en":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":2204,"create_time":"2020-10-26 14:21:38","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4932,"instruction":"","last_update_time":"2020-10-26 14:30:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":258,"create_time":"2020-10-26 09:01:56","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4745,"instruction":"","last_update_time":"2020-10-26 09:03:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":432,"create_time":"2020-10-26 08:58:10","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4742,"instruction":"","last_update_time":"2020-10-26 09:00:10","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":19656,"create_time":"2020-10-23 16:27:24","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4733,"instruction":"","last_update_time":"2020-10-23 17:49:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":12706,"create_time":"2020-10-23 12:53:57","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4636,"instruction":"","last_update_time":"2020-10-23 14:04:45","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":315,"create_time":"2020-10-20 18:30:47","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4073,"instruction":"","last_update_time":"2020-10-20 18:32:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":239,"create_time":"2020-10-20 18:28:08","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4072,"instruction":"","last_update_time":"2020-10-20 18:29:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":207,"create_time":"2020-10-20 18:26:30","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4068,"instruction":"","last_update_time":"2020-10-20 18:27:35","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":366,"create_time":"2020-10-20 18:23:33","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4066,"instruction":"","last_update_time":"2020-10-20 18:25:04","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":304,"create_time":"2020-10-20 16:07:34","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4028,"instruction":"","last_update_time":"2020-10-20 16:09:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":7952,"create_time":"2020-10-20 15:21:58","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4018,"instruction":"","last_update_time":"2020-10-20 16:06:09","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":336,"create_time":"2020-10-20 15:19:00","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4017,"instruction":"","last_update_time":"2020-10-20 15:20:55","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-20 15:15:23","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4010,"instruction":"","last_update_time":"2020-10-20 15:15:39","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":176,"create_time":"2020-10-20 15:07:11","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4007,"instruction":"","last_update_time":"2020-10-20 15:08:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1639,"create_time":"2020-10-20 14:56:32","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4000,"instruction":"","last_update_time":"2020-10-20 15:05:52","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":30195,"create_time":"2020-10-20 11:52:54","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3978,"instruction":"","last_update_time":"2020-10-20 13:58:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":134,"create_time":"2020-10-20 09:23:39","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3899,"instruction":"","last_update_time":"2020-10-20 09:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":82,"create_time":"2020-10-20 08:55:03","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3874,"instruction":"","last_update_time":"2020-10-20 08:55:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":348,"create_time":"2020-10-20 08:42:07","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3863,"instruction":"","last_update_time":"2020-10-20 08:43:57","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":361,"create_time":"2020-10-20 08:39:02","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3862,"instruction":"","last_update_time":"2020-10-20 08:41:07","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1069,"create_time":"2020-10-19 18:50:09","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3859,"instruction":"","last_update_time":"2020-10-19 18:56:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":220,"create_time":"2020-10-19 18:07:30","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3850,"instruction":"","last_update_time":"2020-10-19 18:08:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":189,"create_time":"2020-10-19 17:23:20","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3837,"instruction":"","last_update_time":"2020-10-19 17:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":340,"create_time":"2020-10-19 16:26:33","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3811,"instruction":"","last_update_time":"2020-10-19 16:28:28","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":110,"create_time":"2020-10-19 15:35:10","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3757,"instruction":"","last_update_time":"2020-10-19 15:35:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":166,"create_time":"2020-10-19 15:16:51","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3752,"instruction":"","last_update_time":"2020-10-19 15:17:42","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":3530,"create_time":"2020-10-19 14:59:44","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3744,"instruction":"","last_update_time":"2020-10-19 15:16:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":309,"create_time":"2020-10-19 14:41:03","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3728,"instruction":"","last_update_time":"2020-10-19 14:42:54","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":214,"create_time":"2020-10-19 14:38:03","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3724,"instruction":"","last_update_time":"2020-10-19 14:39:13","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":237,"create_time":"2020-10-19 14:35:05","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3719,"instruction":"","last_update_time":"2020-10-19 14:36:12","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_cn":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":2204,"create_time":"2020-10-26 14:21:38","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4932,"instruction":"","last_update_time":"2020-10-26 14:30:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":258,"create_time":"2020-10-26 09:01:56","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4745,"instruction":"","last_update_time":"2020-10-26 09:03:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":432,"create_time":"2020-10-26 08:58:10","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4742,"instruction":"","last_update_time":"2020-10-26 09:00:10","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":19656,"create_time":"2020-10-23 16:27:24","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4733,"instruction":"","last_update_time":"2020-10-23 17:49:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":12706,"create_time":"2020-10-23 12:53:57","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4636,"instruction":"","last_update_time":"2020-10-23 14:04:45","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":315,"create_time":"2020-10-20 18:30:47","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4073,"instruction":"","last_update_time":"2020-10-20 18:32:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":239,"create_time":"2020-10-20 18:28:08","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4072,"instruction":"","last_update_time":"2020-10-20 18:29:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":207,"create_time":"2020-10-20 18:26:30","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4068,"instruction":"","last_update_time":"2020-10-20 18:27:35","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":366,"create_time":"2020-10-20 18:23:33","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4066,"instruction":"","last_update_time":"2020-10-20 18:25:04","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":304,"create_time":"2020-10-20 16:07:34","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4028,"instruction":"","last_update_time":"2020-10-20 16:09:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":7952,"create_time":"2020-10-20 15:21:58","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4018,"instruction":"","last_update_time":"2020-10-20 16:06:09","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":336,"create_time":"2020-10-20 15:19:00","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4017,"instruction":"","last_update_time":"2020-10-20 15:20:55","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-20 15:15:23","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4010,"instruction":"","last_update_time":"2020-10-20 15:15:39","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":176,"create_time":"2020-10-20 15:07:11","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4007,"instruction":"","last_update_time":"2020-10-20 15:08:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1639,"create_time":"2020-10-20 14:56:32","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4000,"instruction":"","last_update_time":"2020-10-20 15:05:52","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":30195,"create_time":"2020-10-20 11:52:54","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3978,"instruction":"","last_update_time":"2020-10-20 13:58:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":134,"create_time":"2020-10-20 09:23:39","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3899,"instruction":"","last_update_time":"2020-10-20 09:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":82,"create_time":"2020-10-20 08:55:03","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3874,"instruction":"","last_update_time":"2020-10-20 08:55:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":348,"create_time":"2020-10-20 08:42:07","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3863,"instruction":"","last_update_time":"2020-10-20 08:43:57","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":361,"create_time":"2020-10-20 08:39:02","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3862,"instruction":"","last_update_time":"2020-10-20 08:41:07","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1069,"create_time":"2020-10-19 18:50:09","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3859,"instruction":"","last_update_time":"2020-10-19 18:56:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":220,"create_time":"2020-10-19 18:07:30","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3850,"instruction":"","last_update_time":"2020-10-19 18:08:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":189,"create_time":"2020-10-19 17:23:20","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3837,"instruction":"","last_update_time":"2020-10-19 17:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":340,"create_time":"2020-10-19 16:26:33","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3811,"instruction":"","last_update_time":"2020-10-19 16:28:28","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":110,"create_time":"2020-10-19 15:35:10","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3757,"instruction":"","last_update_time":"2020-10-19 15:35:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":166,"create_time":"2020-10-19 15:16:51","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3752,"instruction":"","last_update_time":"2020-10-19 15:17:42","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":3530,"create_time":"2020-10-19 14:59:44","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3744,"instruction":"","last_update_time":"2020-10-19 15:16:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":309,"create_time":"2020-10-19 14:41:03","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3728,"instruction":"","last_update_time":"2020-10-19 14:42:54","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":214,"create_time":"2020-10-19 14:38:03","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3724,"instruction":"","last_update_time":"2020-10-19 14:39:13","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":237,"create_time":"2020-10-19 14:35:05","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3719,"instruction":"","last_update_time":"2020-10-19 14:36:12","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_tw":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":2204,"create_time":"2020-10-26 14:21:38","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4932,"instruction":"","last_update_time":"2020-10-26 14:30:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":258,"create_time":"2020-10-26 09:01:56","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4745,"instruction":"","last_update_time":"2020-10-26 09:03:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":432,"create_time":"2020-10-26 08:58:10","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4742,"instruction":"","last_update_time":"2020-10-26 09:00:10","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":19656,"create_time":"2020-10-23 16:27:24","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4733,"instruction":"","last_update_time":"2020-10-23 17:49:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":12706,"create_time":"2020-10-23 12:53:57","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4636,"instruction":"","last_update_time":"2020-10-23 14:04:45","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":315,"create_time":"2020-10-20 18:30:47","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4073,"instruction":"","last_update_time":"2020-10-20 18:32:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":239,"create_time":"2020-10-20 18:28:08","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4072,"instruction":"","last_update_time":"2020-10-20 18:29:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":207,"create_time":"2020-10-20 18:26:30","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4068,"instruction":"","last_update_time":"2020-10-20 18:27:35","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":366,"create_time":"2020-10-20 18:23:33","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4066,"instruction":"","last_update_time":"2020-10-20 18:25:04","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":304,"create_time":"2020-10-20 16:07:34","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4028,"instruction":"","last_update_time":"2020-10-20 16:09:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":7952,"create_time":"2020-10-20 15:21:58","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4018,"instruction":"","last_update_time":"2020-10-20 16:06:09","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":336,"create_time":"2020-10-20 15:19:00","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4017,"instruction":"","last_update_time":"2020-10-20 15:20:55","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-20 15:15:23","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4010,"instruction":"","last_update_time":"2020-10-20 15:15:39","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":176,"create_time":"2020-10-20 15:07:11","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4007,"instruction":"","last_update_time":"2020-10-20 15:08:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1639,"create_time":"2020-10-20 14:56:32","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4000,"instruction":"","last_update_time":"2020-10-20 15:05:52","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":30195,"create_time":"2020-10-20 11:52:54","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3978,"instruction":"","last_update_time":"2020-10-20 13:58:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":134,"create_time":"2020-10-20 09:23:39","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3899,"instruction":"","last_update_time":"2020-10-20 09:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":82,"create_time":"2020-10-20 08:55:03","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3874,"instruction":"","last_update_time":"2020-10-20 08:55:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":348,"create_time":"2020-10-20 08:42:07","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3863,"instruction":"","last_update_time":"2020-10-20 08:43:57","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":361,"create_time":"2020-10-20 08:39:02","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3862,"instruction":"","last_update_time":"2020-10-20 08:41:07","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1069,"create_time":"2020-10-19 18:50:09","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3859,"instruction":"","last_update_time":"2020-10-19 18:56:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":220,"create_time":"2020-10-19 18:07:30","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3850,"instruction":"","last_update_time":"2020-10-19 18:08:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":189,"create_time":"2020-10-19 17:23:20","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3837,"instruction":"","last_update_time":"2020-10-19 17:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":340,"create_time":"2020-10-19 16:26:33","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3811,"instruction":"","last_update_time":"2020-10-19 16:28:28","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":110,"create_time":"2020-10-19 15:35:10","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3757,"instruction":"","last_update_time":"2020-10-19 15:35:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":166,"create_time":"2020-10-19 15:16:51","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3752,"instruction":"","last_update_time":"2020-10-19 15:17:42","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":3530,"create_time":"2020-10-19 14:59:44","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3744,"instruction":"","last_update_time":"2020-10-19 15:16:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":309,"create_time":"2020-10-19 14:41:03","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3728,"instruction":"","last_update_time":"2020-10-19 14:42:54","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":214,"create_time":"2020-10-19 14:38:03","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3724,"instruction":"","last_update_time":"2020-10-19 14:39:13","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":237,"create_time":"2020-10-19 14:35:05","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3719,"instruction":"","last_update_time":"2020-10-19 14:36:12","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}]}},"hanxin":{"yg00a00020071211000n00":{"en":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"deviation pause, emergency stop","hostname":"yg00a00020071211000n00","id":5070,"instruction":"move robot back to the trajectory","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"in soft emergency state (monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"Please follow the prompts to fix the exception or press the reset button","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":4859,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4041,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4036,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"Hanxin not alive","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":3804,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":3803,"instruction":"Check node_scan params","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":3777,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_cn":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏离轨迹，紧急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"将机器人开回到轨迹上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"软急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"请按提示修复异常或按复位键","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":4859,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4041,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4036,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韩信异常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":3804,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"请检查点云参数","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":3777,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_tw":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏離軌跡，緊急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"將機器人開回到軌跡上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"軟急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"請按提示修復異常或按復位鍵","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":4859,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4041,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4036,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韓信異常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":3804,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"請檢查點雲參數","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":3777,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}]}},"yugong":{"yg00a00020071211000n00":{"en":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"deviation pause, emergency stop","hostname":"yg00a00020071211000n00","id":5070,"instruction":"move robot back to the trajectory","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"in soft emergency state (monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"Please follow the prompts to fix the exception or press the reset button","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":4859,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4041,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4036,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"Hanxin not alive","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":3804,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":3803,"instruction":"Check node_scan params","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":3777,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_cn":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏离轨迹，紧急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"将机器人开回到轨迹上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"软急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"请按提示修复异常或按复位键","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":4859,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4041,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4036,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韩信异常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":3804,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"请检查点云参数","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":3777,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_tw":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏離軌跡，緊急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"將機器人開回到軌跡上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"軟急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"請按提示修復異常或按復位鍵","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":4859,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4041,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4036,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韓信異常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":3804,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"請檢查點雲參數","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":3777,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}]}}}
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
         * charging_station : {"cj02":{"en":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":2204,"create_time":"2020-10-26 14:21:38","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4932,"instruction":"","last_update_time":"2020-10-26 14:30:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":258,"create_time":"2020-10-26 09:01:56","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4745,"instruction":"","last_update_time":"2020-10-26 09:03:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":432,"create_time":"2020-10-26 08:58:10","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4742,"instruction":"","last_update_time":"2020-10-26 09:00:10","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":19656,"create_time":"2020-10-23 16:27:24","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4733,"instruction":"","last_update_time":"2020-10-23 17:49:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":12706,"create_time":"2020-10-23 12:53:57","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4636,"instruction":"","last_update_time":"2020-10-23 14:04:45","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":315,"create_time":"2020-10-20 18:30:47","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4073,"instruction":"","last_update_time":"2020-10-20 18:32:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":239,"create_time":"2020-10-20 18:28:08","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4072,"instruction":"","last_update_time":"2020-10-20 18:29:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":207,"create_time":"2020-10-20 18:26:30","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4068,"instruction":"","last_update_time":"2020-10-20 18:27:35","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":366,"create_time":"2020-10-20 18:23:33","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4066,"instruction":"","last_update_time":"2020-10-20 18:25:04","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":304,"create_time":"2020-10-20 16:07:34","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4028,"instruction":"","last_update_time":"2020-10-20 16:09:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":7952,"create_time":"2020-10-20 15:21:58","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4018,"instruction":"","last_update_time":"2020-10-20 16:06:09","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":336,"create_time":"2020-10-20 15:19:00","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4017,"instruction":"","last_update_time":"2020-10-20 15:20:55","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-20 15:15:23","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4010,"instruction":"","last_update_time":"2020-10-20 15:15:39","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":176,"create_time":"2020-10-20 15:07:11","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4007,"instruction":"","last_update_time":"2020-10-20 15:08:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1639,"create_time":"2020-10-20 14:56:32","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4000,"instruction":"","last_update_time":"2020-10-20 15:05:52","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":30195,"create_time":"2020-10-20 11:52:54","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3978,"instruction":"","last_update_time":"2020-10-20 13:58:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":134,"create_time":"2020-10-20 09:23:39","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3899,"instruction":"","last_update_time":"2020-10-20 09:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":82,"create_time":"2020-10-20 08:55:03","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3874,"instruction":"","last_update_time":"2020-10-20 08:55:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":348,"create_time":"2020-10-20 08:42:07","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3863,"instruction":"","last_update_time":"2020-10-20 08:43:57","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":361,"create_time":"2020-10-20 08:39:02","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3862,"instruction":"","last_update_time":"2020-10-20 08:41:07","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1069,"create_time":"2020-10-19 18:50:09","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3859,"instruction":"","last_update_time":"2020-10-19 18:56:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":220,"create_time":"2020-10-19 18:07:30","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3850,"instruction":"","last_update_time":"2020-10-19 18:08:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":189,"create_time":"2020-10-19 17:23:20","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3837,"instruction":"","last_update_time":"2020-10-19 17:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":340,"create_time":"2020-10-19 16:26:33","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3811,"instruction":"","last_update_time":"2020-10-19 16:28:28","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":110,"create_time":"2020-10-19 15:35:10","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3757,"instruction":"","last_update_time":"2020-10-19 15:35:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":166,"create_time":"2020-10-19 15:16:51","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3752,"instruction":"","last_update_time":"2020-10-19 15:17:42","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":3530,"create_time":"2020-10-19 14:59:44","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3744,"instruction":"","last_update_time":"2020-10-19 15:16:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":309,"create_time":"2020-10-19 14:41:03","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3728,"instruction":"","last_update_time":"2020-10-19 14:42:54","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":214,"create_time":"2020-10-19 14:38:03","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3724,"instruction":"","last_update_time":"2020-10-19 14:39:13","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":237,"create_time":"2020-10-19 14:35:05","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3719,"instruction":"","last_update_time":"2020-10-19 14:36:12","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_cn":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":2204,"create_time":"2020-10-26 14:21:38","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4932,"instruction":"","last_update_time":"2020-10-26 14:30:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":258,"create_time":"2020-10-26 09:01:56","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4745,"instruction":"","last_update_time":"2020-10-26 09:03:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":432,"create_time":"2020-10-26 08:58:10","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4742,"instruction":"","last_update_time":"2020-10-26 09:00:10","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":19656,"create_time":"2020-10-23 16:27:24","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4733,"instruction":"","last_update_time":"2020-10-23 17:49:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":12706,"create_time":"2020-10-23 12:53:57","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4636,"instruction":"","last_update_time":"2020-10-23 14:04:45","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":315,"create_time":"2020-10-20 18:30:47","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4073,"instruction":"","last_update_time":"2020-10-20 18:32:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":239,"create_time":"2020-10-20 18:28:08","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4072,"instruction":"","last_update_time":"2020-10-20 18:29:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":207,"create_time":"2020-10-20 18:26:30","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4068,"instruction":"","last_update_time":"2020-10-20 18:27:35","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":366,"create_time":"2020-10-20 18:23:33","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4066,"instruction":"","last_update_time":"2020-10-20 18:25:04","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":304,"create_time":"2020-10-20 16:07:34","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4028,"instruction":"","last_update_time":"2020-10-20 16:09:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":7952,"create_time":"2020-10-20 15:21:58","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4018,"instruction":"","last_update_time":"2020-10-20 16:06:09","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":336,"create_time":"2020-10-20 15:19:00","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4017,"instruction":"","last_update_time":"2020-10-20 15:20:55","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-20 15:15:23","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4010,"instruction":"","last_update_time":"2020-10-20 15:15:39","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":176,"create_time":"2020-10-20 15:07:11","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4007,"instruction":"","last_update_time":"2020-10-20 15:08:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1639,"create_time":"2020-10-20 14:56:32","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4000,"instruction":"","last_update_time":"2020-10-20 15:05:52","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":30195,"create_time":"2020-10-20 11:52:54","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3978,"instruction":"","last_update_time":"2020-10-20 13:58:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":134,"create_time":"2020-10-20 09:23:39","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3899,"instruction":"","last_update_time":"2020-10-20 09:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":82,"create_time":"2020-10-20 08:55:03","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3874,"instruction":"","last_update_time":"2020-10-20 08:55:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":348,"create_time":"2020-10-20 08:42:07","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3863,"instruction":"","last_update_time":"2020-10-20 08:43:57","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":361,"create_time":"2020-10-20 08:39:02","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3862,"instruction":"","last_update_time":"2020-10-20 08:41:07","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1069,"create_time":"2020-10-19 18:50:09","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3859,"instruction":"","last_update_time":"2020-10-19 18:56:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":220,"create_time":"2020-10-19 18:07:30","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3850,"instruction":"","last_update_time":"2020-10-19 18:08:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":189,"create_time":"2020-10-19 17:23:20","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3837,"instruction":"","last_update_time":"2020-10-19 17:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":340,"create_time":"2020-10-19 16:26:33","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3811,"instruction":"","last_update_time":"2020-10-19 16:28:28","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":110,"create_time":"2020-10-19 15:35:10","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3757,"instruction":"","last_update_time":"2020-10-19 15:35:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":166,"create_time":"2020-10-19 15:16:51","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3752,"instruction":"","last_update_time":"2020-10-19 15:17:42","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":3530,"create_time":"2020-10-19 14:59:44","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3744,"instruction":"","last_update_time":"2020-10-19 15:16:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":309,"create_time":"2020-10-19 14:41:03","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3728,"instruction":"","last_update_time":"2020-10-19 14:42:54","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":214,"create_time":"2020-10-19 14:38:03","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3724,"instruction":"","last_update_time":"2020-10-19 14:39:13","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":237,"create_time":"2020-10-19 14:35:05","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3719,"instruction":"","last_update_time":"2020-10-19 14:36:12","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_tw":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":2204,"create_time":"2020-10-26 14:21:38","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4932,"instruction":"","last_update_time":"2020-10-26 14:30:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":258,"create_time":"2020-10-26 09:01:56","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4745,"instruction":"","last_update_time":"2020-10-26 09:03:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":432,"create_time":"2020-10-26 08:58:10","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4742,"instruction":"","last_update_time":"2020-10-26 09:00:10","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":19656,"create_time":"2020-10-23 16:27:24","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4733,"instruction":"","last_update_time":"2020-10-23 17:49:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":12706,"create_time":"2020-10-23 12:53:57","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4636,"instruction":"","last_update_time":"2020-10-23 14:04:45","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":315,"create_time":"2020-10-20 18:30:47","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4073,"instruction":"","last_update_time":"2020-10-20 18:32:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":239,"create_time":"2020-10-20 18:28:08","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4072,"instruction":"","last_update_time":"2020-10-20 18:29:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":207,"create_time":"2020-10-20 18:26:30","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4068,"instruction":"","last_update_time":"2020-10-20 18:27:35","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":366,"create_time":"2020-10-20 18:23:33","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4066,"instruction":"","last_update_time":"2020-10-20 18:25:04","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":304,"create_time":"2020-10-20 16:07:34","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4028,"instruction":"","last_update_time":"2020-10-20 16:09:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":7952,"create_time":"2020-10-20 15:21:58","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4018,"instruction":"","last_update_time":"2020-10-20 16:06:09","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":336,"create_time":"2020-10-20 15:19:00","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4017,"instruction":"","last_update_time":"2020-10-20 15:20:55","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-20 15:15:23","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4010,"instruction":"","last_update_time":"2020-10-20 15:15:39","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":176,"create_time":"2020-10-20 15:07:11","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4007,"instruction":"","last_update_time":"2020-10-20 15:08:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1639,"create_time":"2020-10-20 14:56:32","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4000,"instruction":"","last_update_time":"2020-10-20 15:05:52","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":30195,"create_time":"2020-10-20 11:52:54","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3978,"instruction":"","last_update_time":"2020-10-20 13:58:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":134,"create_time":"2020-10-20 09:23:39","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3899,"instruction":"","last_update_time":"2020-10-20 09:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":82,"create_time":"2020-10-20 08:55:03","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3874,"instruction":"","last_update_time":"2020-10-20 08:55:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":348,"create_time":"2020-10-20 08:42:07","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3863,"instruction":"","last_update_time":"2020-10-20 08:43:57","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":361,"create_time":"2020-10-20 08:39:02","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3862,"instruction":"","last_update_time":"2020-10-20 08:41:07","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1069,"create_time":"2020-10-19 18:50:09","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3859,"instruction":"","last_update_time":"2020-10-19 18:56:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":220,"create_time":"2020-10-19 18:07:30","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3850,"instruction":"","last_update_time":"2020-10-19 18:08:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":189,"create_time":"2020-10-19 17:23:20","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3837,"instruction":"","last_update_time":"2020-10-19 17:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":340,"create_time":"2020-10-19 16:26:33","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3811,"instruction":"","last_update_time":"2020-10-19 16:28:28","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":110,"create_time":"2020-10-19 15:35:10","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3757,"instruction":"","last_update_time":"2020-10-19 15:35:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":166,"create_time":"2020-10-19 15:16:51","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3752,"instruction":"","last_update_time":"2020-10-19 15:17:42","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":3530,"create_time":"2020-10-19 14:59:44","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3744,"instruction":"","last_update_time":"2020-10-19 15:16:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":309,"create_time":"2020-10-19 14:41:03","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3728,"instruction":"","last_update_time":"2020-10-19 14:42:54","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":214,"create_time":"2020-10-19 14:38:03","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3724,"instruction":"","last_update_time":"2020-10-19 14:39:13","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":237,"create_time":"2020-10-19 14:35:05","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3719,"instruction":"","last_update_time":"2020-10-19 14:36:12","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}]}}
         * hanxin : {"yg00a00020071211000n00":{"en":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"deviation pause, emergency stop","hostname":"yg00a00020071211000n00","id":5070,"instruction":"move robot back to the trajectory","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"in soft emergency state (monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"Please follow the prompts to fix the exception or press the reset button","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":4859,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4041,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4036,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"Hanxin not alive","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":3804,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":3803,"instruction":"Check node_scan params","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":3777,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_cn":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏离轨迹，紧急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"将机器人开回到轨迹上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"软急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"请按提示修复异常或按复位键","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":4859,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4041,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4036,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韩信异常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":3804,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"请检查点云参数","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":3777,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_tw":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏離軌跡，緊急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"將機器人開回到軌跡上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"軟急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"請按提示修復異常或按復位鍵","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":4859,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4041,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4036,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韓信異常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":3804,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"請檢查點雲參數","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":3777,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}]}}
         * yugong : {"yg00a00020071211000n00":{"en":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"deviation pause, emergency stop","hostname":"yg00a00020071211000n00","id":5070,"instruction":"move robot back to the trajectory","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"in soft emergency state (monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"Please follow the prompts to fix the exception or press the reset button","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":4859,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4041,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4036,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"Hanxin not alive","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":3804,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":3803,"instruction":"Check node_scan params","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":3777,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_cn":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏离轨迹，紧急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"将机器人开回到轨迹上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"软急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"请按提示修复异常或按复位键","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":4859,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4041,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4036,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韩信异常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":3804,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"请检查点云参数","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":3777,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_tw":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏離軌跡，緊急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"將機器人開回到軌跡上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"軟急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"請按提示修復異常或按復位鍵","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":4859,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4041,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4036,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韓信異常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":3804,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"請檢查點雲參數","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":3777,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}]}}
         */

        private ChargingStationBean charging_station;
        private HanxinBean hanxin;
        private YugongBean yugong;

        public ChargingStationBean getCharging_station() {
            return charging_station;
        }

        public void setCharging_station(ChargingStationBean charging_station) {
            this.charging_station = charging_station;
        }

        public HanxinBean getHanxin() {
            return hanxin;
        }

        public void setHanxin(HanxinBean hanxin) {
            this.hanxin = hanxin;
        }

        public YugongBean getYugong() {
            return yugong;
        }

        public void setYugong(YugongBean yugong) {
            this.yugong = yugong;
        }

        public static class ChargingStationBean {
            /**
             * cj02 : {"en":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":2204,"create_time":"2020-10-26 14:21:38","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4932,"instruction":"","last_update_time":"2020-10-26 14:30:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":258,"create_time":"2020-10-26 09:01:56","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4745,"instruction":"","last_update_time":"2020-10-26 09:03:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":432,"create_time":"2020-10-26 08:58:10","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4742,"instruction":"","last_update_time":"2020-10-26 09:00:10","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":19656,"create_time":"2020-10-23 16:27:24","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4733,"instruction":"","last_update_time":"2020-10-23 17:49:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":12706,"create_time":"2020-10-23 12:53:57","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4636,"instruction":"","last_update_time":"2020-10-23 14:04:45","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":315,"create_time":"2020-10-20 18:30:47","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4073,"instruction":"","last_update_time":"2020-10-20 18:32:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":239,"create_time":"2020-10-20 18:28:08","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4072,"instruction":"","last_update_time":"2020-10-20 18:29:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":207,"create_time":"2020-10-20 18:26:30","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4068,"instruction":"","last_update_time":"2020-10-20 18:27:35","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":366,"create_time":"2020-10-20 18:23:33","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4066,"instruction":"","last_update_time":"2020-10-20 18:25:04","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":304,"create_time":"2020-10-20 16:07:34","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4028,"instruction":"","last_update_time":"2020-10-20 16:09:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":7952,"create_time":"2020-10-20 15:21:58","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4018,"instruction":"","last_update_time":"2020-10-20 16:06:09","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":336,"create_time":"2020-10-20 15:19:00","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4017,"instruction":"","last_update_time":"2020-10-20 15:20:55","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-20 15:15:23","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4010,"instruction":"","last_update_time":"2020-10-20 15:15:39","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":176,"create_time":"2020-10-20 15:07:11","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4007,"instruction":"","last_update_time":"2020-10-20 15:08:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1639,"create_time":"2020-10-20 14:56:32","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":4000,"instruction":"","last_update_time":"2020-10-20 15:05:52","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":30195,"create_time":"2020-10-20 11:52:54","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3978,"instruction":"","last_update_time":"2020-10-20 13:58:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":134,"create_time":"2020-10-20 09:23:39","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3899,"instruction":"","last_update_time":"2020-10-20 09:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":82,"create_time":"2020-10-20 08:55:03","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3874,"instruction":"","last_update_time":"2020-10-20 08:55:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":348,"create_time":"2020-10-20 08:42:07","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3863,"instruction":"","last_update_time":"2020-10-20 08:43:57","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":361,"create_time":"2020-10-20 08:39:02","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3862,"instruction":"","last_update_time":"2020-10-20 08:41:07","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1069,"create_time":"2020-10-19 18:50:09","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3859,"instruction":"","last_update_time":"2020-10-19 18:56:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":220,"create_time":"2020-10-19 18:07:30","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3850,"instruction":"","last_update_time":"2020-10-19 18:08:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":189,"create_time":"2020-10-19 17:23:20","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3837,"instruction":"","last_update_time":"2020-10-19 17:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":340,"create_time":"2020-10-19 16:26:33","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3811,"instruction":"","last_update_time":"2020-10-19 16:28:28","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":110,"create_time":"2020-10-19 15:35:10","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3757,"instruction":"","last_update_time":"2020-10-19 15:35:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":166,"create_time":"2020-10-19 15:16:51","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3752,"instruction":"","last_update_time":"2020-10-19 15:17:42","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":3530,"create_time":"2020-10-19 14:59:44","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3744,"instruction":"","last_update_time":"2020-10-19 15:16:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":309,"create_time":"2020-10-19 14:41:03","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3728,"instruction":"","last_update_time":"2020-10-19 14:42:54","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":214,"create_time":"2020-10-19 14:38:03","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3724,"instruction":"","last_update_time":"2020-10-19 14:39:13","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":237,"create_time":"2020-10-19 14:35:05","dtc_id":"B5GPM20530","error_mode":"Charging station fail","hostname":"cj02","id":3719,"instruction":"","last_update_time":"2020-10-19 14:36:12","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_cn":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":2204,"create_time":"2020-10-26 14:21:38","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4932,"instruction":"","last_update_time":"2020-10-26 14:30:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":258,"create_time":"2020-10-26 09:01:56","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4745,"instruction":"","last_update_time":"2020-10-26 09:03:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":432,"create_time":"2020-10-26 08:58:10","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4742,"instruction":"","last_update_time":"2020-10-26 09:00:10","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":19656,"create_time":"2020-10-23 16:27:24","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4733,"instruction":"","last_update_time":"2020-10-23 17:49:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":12706,"create_time":"2020-10-23 12:53:57","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4636,"instruction":"","last_update_time":"2020-10-23 14:04:45","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":315,"create_time":"2020-10-20 18:30:47","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4073,"instruction":"","last_update_time":"2020-10-20 18:32:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":239,"create_time":"2020-10-20 18:28:08","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4072,"instruction":"","last_update_time":"2020-10-20 18:29:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":207,"create_time":"2020-10-20 18:26:30","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4068,"instruction":"","last_update_time":"2020-10-20 18:27:35","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":366,"create_time":"2020-10-20 18:23:33","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4066,"instruction":"","last_update_time":"2020-10-20 18:25:04","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":304,"create_time":"2020-10-20 16:07:34","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4028,"instruction":"","last_update_time":"2020-10-20 16:09:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":7952,"create_time":"2020-10-20 15:21:58","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4018,"instruction":"","last_update_time":"2020-10-20 16:06:09","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":336,"create_time":"2020-10-20 15:19:00","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4017,"instruction":"","last_update_time":"2020-10-20 15:20:55","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-20 15:15:23","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4010,"instruction":"","last_update_time":"2020-10-20 15:15:39","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":176,"create_time":"2020-10-20 15:07:11","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4007,"instruction":"","last_update_time":"2020-10-20 15:08:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1639,"create_time":"2020-10-20 14:56:32","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":4000,"instruction":"","last_update_time":"2020-10-20 15:05:52","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":30195,"create_time":"2020-10-20 11:52:54","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3978,"instruction":"","last_update_time":"2020-10-20 13:58:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":134,"create_time":"2020-10-20 09:23:39","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3899,"instruction":"","last_update_time":"2020-10-20 09:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":82,"create_time":"2020-10-20 08:55:03","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3874,"instruction":"","last_update_time":"2020-10-20 08:55:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":348,"create_time":"2020-10-20 08:42:07","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3863,"instruction":"","last_update_time":"2020-10-20 08:43:57","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":361,"create_time":"2020-10-20 08:39:02","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3862,"instruction":"","last_update_time":"2020-10-20 08:41:07","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1069,"create_time":"2020-10-19 18:50:09","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3859,"instruction":"","last_update_time":"2020-10-19 18:56:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":220,"create_time":"2020-10-19 18:07:30","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3850,"instruction":"","last_update_time":"2020-10-19 18:08:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":189,"create_time":"2020-10-19 17:23:20","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3837,"instruction":"","last_update_time":"2020-10-19 17:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":340,"create_time":"2020-10-19 16:26:33","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3811,"instruction":"","last_update_time":"2020-10-19 16:28:28","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":110,"create_time":"2020-10-19 15:35:10","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3757,"instruction":"","last_update_time":"2020-10-19 15:35:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":166,"create_time":"2020-10-19 15:16:51","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3752,"instruction":"","last_update_time":"2020-10-19 15:17:42","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":3530,"create_time":"2020-10-19 14:59:44","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3744,"instruction":"","last_update_time":"2020-10-19 15:16:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":309,"create_time":"2020-10-19 14:41:03","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3728,"instruction":"","last_update_time":"2020-10-19 14:42:54","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":214,"create_time":"2020-10-19 14:38:03","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3724,"instruction":"","last_update_time":"2020-10-19 14:39:13","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":237,"create_time":"2020-10-19 14:35:05","dtc_id":"B5GPM20530","error_mode":"充电站异常","hostname":"cj02","id":3719,"instruction":"","last_update_time":"2020-10-19 14:36:12","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}],"zh_tw":[{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":2204,"create_time":"2020-10-26 14:21:38","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4932,"instruction":"","last_update_time":"2020-10-26 14:30:49","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":258,"create_time":"2020-10-26 09:01:56","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4745,"instruction":"","last_update_time":"2020-10-26 09:03:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":432,"create_time":"2020-10-26 08:58:10","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4742,"instruction":"","last_update_time":"2020-10-26 09:00:10","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":19656,"create_time":"2020-10-23 16:27:24","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4733,"instruction":"","last_update_time":"2020-10-23 17:49:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":12706,"create_time":"2020-10-23 12:53:57","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4636,"instruction":"","last_update_time":"2020-10-23 14:04:45","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":315,"create_time":"2020-10-20 18:30:47","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4073,"instruction":"","last_update_time":"2020-10-20 18:32:24","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":239,"create_time":"2020-10-20 18:28:08","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4072,"instruction":"","last_update_time":"2020-10-20 18:29:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":207,"create_time":"2020-10-20 18:26:30","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4068,"instruction":"","last_update_time":"2020-10-20 18:27:35","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":366,"create_time":"2020-10-20 18:23:33","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4066,"instruction":"","last_update_time":"2020-10-20 18:25:04","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":304,"create_time":"2020-10-20 16:07:34","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4028,"instruction":"","last_update_time":"2020-10-20 16:09:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":7952,"create_time":"2020-10-20 15:21:58","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4018,"instruction":"","last_update_time":"2020-10-20 16:06:09","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":336,"create_time":"2020-10-20 15:19:00","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4017,"instruction":"","last_update_time":"2020-10-20 15:20:55","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":46,"create_time":"2020-10-20 15:15:23","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4010,"instruction":"","last_update_time":"2020-10-20 15:15:39","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":176,"create_time":"2020-10-20 15:07:11","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4007,"instruction":"","last_update_time":"2020-10-20 15:08:11","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1639,"create_time":"2020-10-20 14:56:32","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":4000,"instruction":"","last_update_time":"2020-10-20 15:05:52","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":30195,"create_time":"2020-10-20 11:52:54","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3978,"instruction":"","last_update_time":"2020-10-20 13:58:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":134,"create_time":"2020-10-20 09:23:39","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3899,"instruction":"","last_update_time":"2020-10-20 09:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":82,"create_time":"2020-10-20 08:55:03","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3874,"instruction":"","last_update_time":"2020-10-20 08:55:31","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":348,"create_time":"2020-10-20 08:42:07","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3863,"instruction":"","last_update_time":"2020-10-20 08:43:57","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":361,"create_time":"2020-10-20 08:39:02","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3862,"instruction":"","last_update_time":"2020-10-20 08:41:07","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":1069,"create_time":"2020-10-19 18:50:09","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3859,"instruction":"","last_update_time":"2020-10-19 18:56:20","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":220,"create_time":"2020-10-19 18:07:30","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3850,"instruction":"","last_update_time":"2020-10-19 18:08:47","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":189,"create_time":"2020-10-19 17:23:20","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3837,"instruction":"","last_update_time":"2020-10-19 17:24:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":340,"create_time":"2020-10-19 16:26:33","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3811,"instruction":"","last_update_time":"2020-10-19 16:28:28","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":110,"create_time":"2020-10-19 15:35:10","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3757,"instruction":"","last_update_time":"2020-10-19 15:35:48","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":166,"create_time":"2020-10-19 15:16:51","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3752,"instruction":"","last_update_time":"2020-10-19 15:17:42","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":3530,"create_time":"2020-10-19 14:59:44","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3744,"instruction":"","last_update_time":"2020-10-19 15:16:21","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":309,"create_time":"2020-10-19 14:41:03","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3728,"instruction":"","last_update_time":"2020-10-19 14:42:54","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":214,"create_time":"2020-10-19 14:38:03","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3724,"instruction":"","last_update_time":"2020-10-19 14:39:13","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B5GPM20530","category_group":"GP","consequent_code":"","count":237,"create_time":"2020-10-19 14:35:05","dtc_id":"B5GPM20530","error_mode":"充電站異常","hostname":"cj02","id":3719,"instruction":"","last_update_time":"2020-10-19 14:36:12","level":2,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"charging_station","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null}]}
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
                     * count : 2204
                     * create_time : 2020-10-26 14:21:38
                     * dtc_id : B5GPM20530
                     * error_mode : Charging station fail
                     * hostname : cj02
                     * id : 4932
                     * instruction :
                     * last_update_time : 2020-10-26 14:30:49
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
                     * count : 2204
                     * create_time : 2020-10-26 14:21:38
                     * dtc_id : B5GPM20530
                     * error_mode : 充电站异常
                     * hostname : cj02
                     * id : 4932
                     * instruction :
                     * last_update_time : 2020-10-26 14:30:49
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
                     * count : 2204
                     * create_time : 2020-10-26 14:21:38
                     * dtc_id : B5GPM20530
                     * error_mode : 充電站異常
                     * hostname : cj02
                     * id : 4932
                     * instruction :
                     * last_update_time : 2020-10-26 14:30:49
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

        public static class HanxinBean {
            /**
             * yg00a00020071211000n00 : {"en":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"deviation pause, emergency stop","hostname":"yg00a00020071211000n00","id":5070,"instruction":"move robot back to the trajectory","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"in soft emergency state (monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"Please follow the prompts to fix the exception or press the reset button","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":4859,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4041,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4036,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"Hanxin not alive","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":3804,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":3803,"instruction":"Check node_scan params","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":3777,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_cn":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏离轨迹，紧急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"将机器人开回到轨迹上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"软急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"请按提示修复异常或按复位键","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":4859,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4041,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4036,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韩信异常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":3804,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"请检查点云参数","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":3777,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_tw":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏離軌跡，緊急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"將機器人開回到軌跡上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"軟急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"請按提示修復異常或按復位鍵","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":4859,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4041,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4036,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韓信異常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":3804,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"請檢查點雲參數","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":3777,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}]}
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
                     * DTC : B0LP010003
                     * category_group : LP
                     * consequent_code :
                     * count : 337
                     * create_time : 2020-10-27 08:54:39
                     * dtc_id : B0LP010003
                     * error_mode : deviation pause, emergency stop
                     * hostname : yg00a00020071211000n00
                     * id : 5070
                     * instruction : move robot back to the trajectory
                     * last_update_time : 2020-10-27 09:00:16
                     * level : 10
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause :
                     * robot_type : yugong
                     * self_recoverable : Y
                     * status : active
                     * system_abbreviation : LP0
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
                     * DTC : B0LP010003
                     * category_group : LP
                     * consequent_code :
                     * count : 337
                     * create_time : 2020-10-27 08:54:39
                     * dtc_id : B0LP010003
                     * error_mode : 偏离轨迹，紧急急停
                     * hostname : yg00a00020071211000n00
                     * id : 5070
                     * instruction : 将机器人开回到轨迹上
                     * last_update_time : 2020-10-27 09:00:16
                     * level : 10
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause :
                     * robot_type : yugong
                     * self_recoverable : Y
                     * status : active
                     * system_abbreviation : LP0
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

                public static class ZhTwBeanX {
                    /**
                     * DTC : B0LP010003
                     * category_group : LP
                     * consequent_code :
                     * count : 337
                     * create_time : 2020-10-27 08:54:39
                     * dtc_id : B0LP010003
                     * error_mode : 偏離軌跡，緊急急停
                     * hostname : yg00a00020071211000n00
                     * id : 5070
                     * instruction : 將機器人開回到軌跡上
                     * last_update_time : 2020-10-27 09:00:16
                     * level : 10
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause :
                     * robot_type : yugong
                     * self_recoverable : Y
                     * status : active
                     * system_abbreviation : LP0
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
             * yg00a00020071211000n00 : {"en":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"deviation pause, emergency stop","hostname":"yg00a00020071211000n00","id":5070,"instruction":"move robot back to the trajectory","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"in soft emergency state (monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"Please follow the prompts to fix the exception or press the reset button","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":4859,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4041,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"relocalization timeout","hostname":"yg00a00020071211000n00","id":4036,"instruction":"Please help relocalization manually","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"Hanxin not alive","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"no wheel odometer data","hostname":"yg00a00020071211000n00","id":3804,"instruction":"Please check if the wheel odometer is ok","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"cloud_obs timeout","hostname":"yg00a00020071211000n00","id":3803,"instruction":"Check node_scan params","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"current angle is out of trajectory, emergency stop","hostname":"yg00a00020071211000n00","id":3777,"instruction":"check robot's location，adjust robot's orientation","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_cn":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏离轨迹，紧急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"将机器人开回到轨迹上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"软急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"请按提示修复异常或按复位键","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":4859,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4041,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超时","hostname":"yg00a00020071211000n00","id":4036,"instruction":"请手动辅助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"BG节点处于重定位状态超过预设时间","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韩信异常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"无里程计数据","hostname":"yg00a00020071211000n00","id":3804,"instruction":"请检查里程计是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"未接收到任何odometry数据topic","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障点云异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"请检查点云参数","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋转角度异常,紧急停止","hostname":"yg00a00020071211000n00","id":3777,"instruction":"请检查定位，调整机器人的朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}],"zh_tw":[{"DTC":"B0LP010003","category_group":"LP","consequent_code":"","count":337,"create_time":"2020-10-27 08:54:39","dtc_id":"B0LP010003","error_mode":"偏離軌跡，緊急急停","hostname":"yg00a00020071211000n00","id":5070,"instruction":"將機器人開回到軌跡上","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"LP0","system_version":null},{"DTC":"B0IB010001","category_group":"IB","consequent_code":"B0PL010003","count":343,"create_time":"2020-10-27 08:54:29","dtc_id":"B0IB010001","error_mode":"軟急停(monitor)","hostname":"yg00a00020071211000n00","id":5068,"instruction":"請按提示修復異常或按復位鍵","last_update_time":"2020-10-27 09:00:16","level":10,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"Y","status":"active","system_abbreviation":"IB0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":12,"create_time":"2020-10-26 11:16:45","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":4859,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-26 11:17:53","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:28:06","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4041,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:28:07","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LZ130000","category_group":"LZ","consequent_code":"","count":1,"create_time":"2020-10-20 16:10:36","dtc_id":"B0LZ130000","error_mode":"重定位超時","hostname":"yg00a00020071211000n00","id":4036,"instruction":"請手動輔助重定位","last_update_time":"2020-10-20 16:10:37","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B5GPM20500","category_group":"GP","consequent_code":"","count":10,"create_time":"2020-10-20 16:10:00","dtc_id":"B5GPM20500","error_mode":"韓信異常","hostname":"yg00a00020071211000n00","id":4032,"instruction":"","last_update_time":"2020-10-20 16:10:03","level":1,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"hanxin","self_recoverable":"N","status":"active","system_abbreviation":"GPM","system_version":null},{"DTC":"B0LZ120002","category_group":"LZ","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:58","dtc_id":"B0LZ120002","error_mode":"無里程計資料","hostname":"yg00a00020071211000n00","id":3804,"instruction":"請檢查里程計是否正常","last_update_time":"2020-10-19 16:05:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LZ1","system_version":null},{"DTC":"B0LD030001","category_group":"LD","consequent_code":"","count":0,"create_time":"2020-10-19 16:05:51","dtc_id":"B0LD030001","error_mode":"避障點雲异常","hostname":"yg00a00020071211000n00","id":3803,"instruction":"請檢查點雲參數","last_update_time":"2020-10-19 16:05:51","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"LD0","system_version":null},{"DTC":"B0CT020004","category_group":"CT","consequent_code":"","count":37,"create_time":"2020-10-19 16:00:01","dtc_id":"B0CT020004","error_mode":"原地旋轉角度異常，緊急急停","hostname":"yg00a00020071211000n00","id":3777,"instruction":"檢查定位，調整機器人朝向","last_update_time":"2020-10-19 16:03:58","level":20,"log_file":null,"manual_fix_command":null,"potential_cause":"","robot_type":"yugong","self_recoverable":"N","status":"active","system_abbreviation":"CT0","system_version":null}]}
             */

            private Yg00a00020071211000n00BeanX yg00a00020071211000n00;

            public Yg00a00020071211000n00BeanX getYg00a00020071211000n00() {
                return yg00a00020071211000n00;
            }

            public void setYg00a00020071211000n00(Yg00a00020071211000n00BeanX yg00a00020071211000n00) {
                this.yg00a00020071211000n00 = yg00a00020071211000n00;
            }

            public static class Yg00a00020071211000n00BeanX {
                private List<EnBeanXX> en;
                private List<ZhCnBeanXX> zh_cn;
                private List<ZhTwBeanXX> zh_tw;

                public List<EnBeanXX> getEn() {
                    return en;
                }

                public void setEn(List<EnBeanXX> en) {
                    this.en = en;
                }

                public List<ZhCnBeanXX> getZh_cn() {
                    return zh_cn;
                }

                public void setZh_cn(List<ZhCnBeanXX> zh_cn) {
                    this.zh_cn = zh_cn;
                }

                public List<ZhTwBeanXX> getZh_tw() {
                    return zh_tw;
                }

                public void setZh_tw(List<ZhTwBeanXX> zh_tw) {
                    this.zh_tw = zh_tw;
                }

                public static class EnBeanXX {
                    /**
                     * DTC : B0LP010003
                     * category_group : LP
                     * consequent_code :
                     * count : 337
                     * create_time : 2020-10-27 08:54:39
                     * dtc_id : B0LP010003
                     * error_mode : deviation pause, emergency stop
                     * hostname : yg00a00020071211000n00
                     * id : 5070
                     * instruction : move robot back to the trajectory
                     * last_update_time : 2020-10-27 09:00:16
                     * level : 10
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause :
                     * robot_type : yugong
                     * self_recoverable : Y
                     * status : active
                     * system_abbreviation : LP0
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

                public static class ZhCnBeanXX {
                    /**
                     * DTC : B0LP010003
                     * category_group : LP
                     * consequent_code :
                     * count : 337
                     * create_time : 2020-10-27 08:54:39
                     * dtc_id : B0LP010003
                     * error_mode : 偏离轨迹，紧急急停
                     * hostname : yg00a00020071211000n00
                     * id : 5070
                     * instruction : 将机器人开回到轨迹上
                     * last_update_time : 2020-10-27 09:00:16
                     * level : 10
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause :
                     * robot_type : yugong
                     * self_recoverable : Y
                     * status : active
                     * system_abbreviation : LP0
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

                public static class ZhTwBeanXX {
                    /**
                     * DTC : B0LP010003
                     * category_group : LP
                     * consequent_code :
                     * count : 337
                     * create_time : 2020-10-27 08:54:39
                     * dtc_id : B0LP010003
                     * error_mode : 偏離軌跡，緊急急停
                     * hostname : yg00a00020071211000n00
                     * id : 5070
                     * instruction : 將機器人開回到軌跡上
                     * last_update_time : 2020-10-27 09:00:16
                     * level : 10
                     * log_file : null
                     * manual_fix_command : null
                     * potential_cause :
                     * robot_type : yugong
                     * self_recoverable : Y
                     * status : active
                     * system_abbreviation : LP0
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
