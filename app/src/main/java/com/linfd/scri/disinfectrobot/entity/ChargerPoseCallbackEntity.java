package com.linfd.scri.disinfectrobot.entity;

import java.util.List;

/*
* 充电座位置
* */
public class ChargerPoseCallbackEntity extends TypeEntity {

    /**
     * id : xxx
     * to_id :
     * pose : [0,0,0]
     */

    private String id;
    private String to_id;
    private List<Float> pose;

    public ChargerPoseCallbackEntity() {
        this.setType("charger_pose");
    }

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

    public List<Float> getPose() {
        return pose;
    }

    public void setPose(List<Float> pose) {
        this.pose = pose;
    }

    @Override
    public String toString() {
        return "ChargerPoseCallbackEntity{" +
                "id='" + id + '\'' +
                ", to_id='" + to_id + '\'' +
                ", pose=" + pose +
                '}';
    }
}
