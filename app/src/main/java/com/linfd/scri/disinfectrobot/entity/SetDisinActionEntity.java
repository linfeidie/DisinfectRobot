package com.linfd.scri.disinfectrobot.entity;


import com.linfd.scri.disinfectrobot.Contanst;

/*
* 设置消毒任务
* */
public class SetDisinActionEntity extends TypeEntity {

    /**
     * id : xxx
     * to_id : xxx
     * disin_mode : auto/manual
     * rays : true/false
     * lift : 0
     * spray : 0
     * filter : true/false
     */

    private String id;
    private String to_id;
    private String disin_mode;
    private String rays;
    private int lift;
    private int spray;
    private String filter;

    public SetDisinActionEntity() {
        this.setType(Contanst.set_disin_action);
        //先设置默认
        this.setFilter("false");
        this.setLift(0);
        this.setRays("false");
        this.setDisin_mode("auto");
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

    public String getDisin_mode() {
        return disin_mode;
    }

    public void setDisin_mode(String disin_mode) {
        this.disin_mode = disin_mode;
    }

    public String getRays() {
        return rays;
    }

    public void setRays(String rays) {
        this.rays = rays;
    }

    public int getLift() {
        return lift;
    }

    public void setLift(int lift) {
        this.lift = lift;
    }

    public int getSpray() {
        return spray;
    }

    public void setSpray(int spray) {
        this.spray = spray;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
