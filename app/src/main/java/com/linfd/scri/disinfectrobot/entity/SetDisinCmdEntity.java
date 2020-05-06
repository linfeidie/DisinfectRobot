package com.linfd.scri.disinfectrobot.entity;


import com.linfd.scri.disinfectrobot.Contanst;

/*
* 设置消毒设备命令  与任务隔离
* */
public class SetDisinCmdEntity extends TypeEntity {


    public SetDisinCmdEntity() {
        this.setType(Contanst.set_disin_cmd);
    }

    /**
     * id : xxx
     * to_id : xxx
     * spray : 0
     * spray_fan : 0
     * spray_motor : 0
     */

    private String id;
    private String to_id;
    private int spray;
    private int spray_fan;
    private int spray_motor;

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

    public int getSpray() {
        return spray;
    }

    public void setSpray(int spray) {
        this.spray = spray;
    }

    public int getSpray_fan() {
        return spray_fan;
    }

    public void setSpray_fan(int spray_fan) {
        this.spray_fan = spray_fan;
    }

    public int getSpray_motor() {
        return spray_motor;
    }

    public void setSpray_motor(int spray_motor) {
        this.spray_motor = spray_motor;
    }
}
