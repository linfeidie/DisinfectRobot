package com.linfd.scri.disinfectrobot.entity;


import com.linfd.scri.disinfectrobot.Tools;

import java.util.List;

/*
 * 返回的机器人状态
 * */
public class RobotStatusCallbackEntity extends TypeEntity {


    /**
     * id : xxx
     * to_id : xxx
     * action :
     * battery_percent : 80.8
     * speed : [1,0]
     * robot_pose : [1,2,0,1]
     * exception_code : 10000
     * stamp : 1.58892384034235E9
     * map_update : 1.58892384034235E9
     */

    private String id;
    private String to_id;
    private String action;
    private double battery_percent;
    private int exception_code;
    private double stamp;
    private double map_update;
    private List<Double> speed;
    private List<Double> robot_pose;
    private boolean localization;
    private int temperature;
    private int humidity;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTo_id() {
        return to_id;
    }

    public void setTo_id(String to_id) {
        this.to_id = to_id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public double getBattery_percent() {
        return battery_percent;
    }

    public void setBattery_percent(double battery_percent) {
        this.battery_percent = battery_percent;
    }

    public int getException_code() {
        return exception_code;
    }

    public void setException_code(int exception_code) {
        this.exception_code = exception_code;
    }

    public double getStamp() {
        return stamp;
    }

    public void setStamp(double stamp) {
        this.stamp = stamp;
    }

    public double getMap_update() {
        return map_update;
    }

    public void setMap_update(double map_update) {
        this.map_update = map_update;
    }

    public List<Double> getSpeed() {
        return speed;
    }

    public void setSpeed(List<Double> speed) {
        this.speed = speed;
    }

    public List<Double> getRobot_pose() {
        return robot_pose;
    }

    public void setRobot_pose(List<Double> robot_pose) {
        this.robot_pose = robot_pose;
    }
    /*
    * 1585552060.5534401 转 1585552060553
    * */
    public double get_hand_map_update(){
        return Tools.nami2mil(this.map_update);
    }

    /*
    * 去掉科学计数法 并转成了字符串
    * */
    public String get_hand_map_update_str(){
        return Tools.goaheadE(get_hand_map_update());
    }

    public boolean isLocalization() {
        return localization;
    }

    public void setLocalization(boolean localization) {
        this.localization = localization;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "RobotStatusCallbackEntity{" +
                "id='" + id + '\'' +
                ", to_id='" + to_id + '\'' +
                ", action='" + action + '\'' +
                ", battery_percent=" + battery_percent +
                ", exception_code=" + exception_code +
                ", stamp=" + stamp +
                ", map_update=" + map_update +
                ", speed=" + speed +
                ", robot_pose=" + robot_pose +
                ", localization=" + localization +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
