package com.linfd.scri.disinfectrobot.entity;
/*
* 查询⾃动充电开关状态
* */
public class GetChargingStatusEntity extends BaseEntity {

    /**
     * status : 1
     */

    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
