package com.linfd.scri.disinfectrobot.manager;

import android.graphics.Rect;


import com.linfd.scri.disinfectrobot.Contanst;

import java.util.List;

/*
 * 根据后台返回来的位置转换成可用用在地图上的Rect对象
 * 隔离业务
 * */
public class HandlePositionHelper {

    private static Rect mrect;
    public static Rect handle(List<Double> serverPos){
        /*
        * 防止崩溃
        * */
        if (Contanst.MAPPARAMENTITY == null){
            return null;
        }
        int width = BGSelectorManager.getInstance().getMapWH().get(0);
        int height = BGSelectorManager.getInstance().getMapWH().get(1);
        double left = width - (-(Contanst.MAPPARAMENTITY.getOrigin().get(1) - serverPos.get(1)) / Contanst.MAPPARAMENTITY.getResolution());
        double top = height - (-(Contanst.MAPPARAMENTITY.getOrigin().get(0) - serverPos.get(0)) / Contanst.MAPPARAMENTITY.getResolution());
        mrect = new Rect();
        mrect.left = (int) left;
        mrect.top = (int) top;
        return mrect;
    }


}
