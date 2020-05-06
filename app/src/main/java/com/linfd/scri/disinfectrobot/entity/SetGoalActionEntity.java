package com.linfd.scri.disinfectrobot.entity;


import com.linfd.scri.disinfectrobot.Contanst;

import java.util.List;

/*
*设置目标点任务
* */
public class SetGoalActionEntity extends TypeEntity {

    /**
     * id : xxx
     * to_id : xxx
     * goal : [0.1,0.1,0]
     * goal_id : 1
     * move_type : flex/stiff
     * max_l : 0.3
     * max_a : 0.3
     * time_out : 1.0
     */

    private String id;
    private String to_id;
    private int goal_id;
    private String move_type;
    private double max_l;
    private double max_a;
    private double time_out;
    private List<Double> goal;

    public SetGoalActionEntity() {
        this.setType(Contanst.set_goal_action);
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

    public int getGoal_id() {
        return goal_id;
    }

    public void setGoal_id(int goal_id) {
        this.goal_id = goal_id;
    }

    public String getMove_type() {
        return move_type;
    }

    public void setMove_type(String move_type) {
        this.move_type = move_type;
    }

    public double getMax_l() {
        return max_l;
    }

    public void setMax_l(double max_l) {
        this.max_l = max_l;
    }

    public double getMax_a() {
        return max_a;
    }

    public void setMax_a(double max_a) {
        this.max_a = max_a;
    }

    public double getTime_out() {
        return time_out;
    }

    public void setTime_out(double time_out) {
        this.time_out = time_out;
    }

    public List<Double> getGoal() {
        return goal;
    }

    public void setGoal(List<Double> goal) {
        this.goal = goal;
    }
}
