package com.linfd.scri.disinfectrobot.entity;

/*
*设置底盘命令
* */


import com.linfd.scri.disinfectrobot.Contanst;

public class SetBaseCmdEntity extends TypeEntity {

    /**
     * id :
     * to_id :
     * power : 0
     * ext_power : true
     * motor_lock : false
     * obs_enable : true
     */

    private String id;
    private String to_id;
    private int power;
    private boolean ext_power;
    private boolean motor_lock;
    private boolean obs_enable;

    public SetBaseCmdEntity() {
        this.setType(Contanst.set_base_cmd);
        this.setMotor_lock(false);
        this.setObs_enable(true);
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isExt_power() {
        return ext_power;
    }

    public void setExt_power(boolean ext_power) {
        this.ext_power = ext_power;
    }

    public boolean isMotor_lock() {
        return motor_lock;
    }

    public void setMotor_lock(boolean motor_lock) {
        this.motor_lock = motor_lock;
    }

    public boolean isObs_enable() {
        return obs_enable;
    }

    public void setObs_enable(boolean obs_enable) {
        this.obs_enable = obs_enable;
    }
}
