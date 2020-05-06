package com.linfd.scri.disinfectrobot.entity;

/*
*   消毒状态返回
* \*/
public class DesinStateCallbackEntity extends TypeEntity {

    /**
     * id : xxx
     * to_id :
     * spray_level : 0
     * water_level : 0
     * ray_state : 0
     * lift : 0
     * filter : 0
     * disin_time : 0
     * disin_area : 0
     */

    private String id;
    private String to_id;
    private int spray_level;
    private int water_level;
    private int ray_state;
    private int lift;
    private int filter;
    private int disin_time;
    private int disin_area;

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

    public int getSpray_level() {
        return spray_level;
    }

    public void setSpray_level(int spray_level) {
        this.spray_level = spray_level;
    }

    public int getWater_level() {
        return water_level;
    }

    public void setWater_level(int water_level) {
        this.water_level = water_level;
    }

    public int getRay_state() {
        return ray_state;
    }

    public void setRay_state(int ray_state) {
        this.ray_state = ray_state;
    }

    public int getLift() {
        return lift;
    }

    public void setLift(int lift) {
        this.lift = lift;
    }

    public int getFilter() {
        return filter;
    }

    public void setFilter(int filter) {
        this.filter = filter;
    }

    public int getDisin_time() {
        return disin_time;
    }

    public void setDisin_time(int disin_time) {
        this.disin_time = disin_time;
    }

    public int getDisin_area() {
        return disin_area;
    }

    public void setDisin_area(int disin_area) {
        this.disin_area = disin_area;
    }

    @Override
    public String toString() {
        return "DesinStateCallbackEntity{" +
                "id='" + id + '\'' +
                ", to_id='" + to_id + '\'' +
                ", spray_level=" + spray_level +
                ", water_level=" + water_level +
                ", ray_state=" + ray_state +
                ", lift=" + lift +
                ", filter=" + filter +
                ", disin_time=" + disin_time +
                ", disin_area=" + disin_area +
                '}';
    }
}
