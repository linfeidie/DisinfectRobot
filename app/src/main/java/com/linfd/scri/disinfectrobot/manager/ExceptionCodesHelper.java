package com.linfd.scri.disinfectrobot.manager;

import java.util.HashMap;
import java.util.Map;

public class ExceptionCodesHelper {

    private Map<Integer,String> exceptionCodes = new HashMap<>();

    private static ExceptionCodesHelper instance = new ExceptionCodesHelper();

    private void LoadExceptionCodes(){
        exceptionCodes.put(10101,"机器人定位出现丢失或定位跳跃现象");
        exceptionCodes.put(10102,"无法找到地图或地图解析错误");
        exceptionCodes.put(20103,"机器人处于障碍物内,或无地图区域,有可能机器人初始位置不正确,无法定位,请进行人工标定");
        exceptionCodes.put(20104,"路径查找失败");
        exceptionCodes.put(20201,"过载");
        exceptionCodes.put(20202,"过流");
        exceptionCodes.put(20203,"欠压");
        exceptionCodes.put(10204,"通讯异常");
        exceptionCodes.put(20301,"过载");
        exceptionCodes.put(20302,"过流");
        exceptionCodes.put(20303,"欠压");
        exceptionCodes.put(10304,"通讯异常");
        exceptionCodes.put(10401,"激光雷达通讯异常,请检查连接线路");
        exceptionCodes.put(10402,"激光雷达开启失败");
        exceptionCodes.put(10403,"激光雷达关闭失败");
        exceptionCodes.put(10501,"工控机与地板通讯异常,请检查地板通讯线路");
        exceptionCodes.put(20601,"通讯异常");
        exceptionCodes.put(20701,"通讯异常");
        exceptionCodes.put(10801,"电压偏低或偏高");
        exceptionCodes.put(20802,"电量低于10%,应进行充电");
        exceptionCodes.put(10803,"获取不了电量或电压");
        exceptionCodes.put(10804,"充电电压异常,偏高或偏低");
        exceptionCodes.put(20901,"急停按钮被按下");
        exceptionCodes.put(11001,"碰撞传感器长期处于触发状态,请检查碰撞传感器是否有损害或异物卡住");
        exceptionCodes.put(21101,"请检查视觉传感器线路");
        exceptionCodes.put(21201,"请检查交互屏幕的线路");
        exceptionCodes.put(21301,"过载");
        exceptionCodes.put(21302,"电机无法开启或通讯异常,请检测电机连线");
        exceptionCodes.put(21401,"过载");
        exceptionCodes.put(21402,"电机无法开启或通讯异常,请检测电机连线");
        exceptionCodes.put(21501,"过载");
        exceptionCodes.put(21502,"电机无法开启或通讯异常,请检测电机连线");
        exceptionCodes.put(21601,"过载");
        exceptionCodes.put(21602,"电机无法开启或通讯异常,请检测电机连线");
        exceptionCodes.put(21301,"滚刷已达使用时长,为更好的清扫效果请进行更换");
        exceptionCodes.put(21401,"盘刷使用时长已达,为更好清扫效果请进行更换");
        exceptionCodes.put(21501,"滤网更换");
        exceptionCodes.put(21601,"污水已满");
        exceptionCodes.put(21702,"清水已空");
        exceptionCodes.put(11801,"机器跌");
        exceptionCodes.put(21901,"水位低");
        exceptionCodes.put(21902,"水位高");
        exceptionCodes.put(12001,"过氧化氢传感器没有信号");
        exceptionCodes.put(22101,"过滤器阻塞");
        exceptionCodes.put(12102,"过滤器工作异常");
        exceptionCodes.put(12201,"摄像头工作异常");
        exceptionCodes.put(22202,"摄像头帧率不稳定或偏低");
        exceptionCodes.put(22301,"陀螺仪传感器发送频率偏低");
        exceptionCodes.put(12302,"陀螺仪无数据输出,或数据接收不正确");
        exceptionCodes.put(12303,"陀螺仪启动失败");
        exceptionCodes.put(12401,"串口开启失败");
        exceptionCodes.put(22402,"底层串口读取超时");
        exceptionCodes.put(22501,"机器人对接充电座超过三次不成功,提示该警告");

    }




}
