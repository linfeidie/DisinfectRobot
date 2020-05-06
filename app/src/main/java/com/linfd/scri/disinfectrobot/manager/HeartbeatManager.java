package com.linfd.scri.disinfectrobot.manager;

import android.os.Handler;

import com.linfd.scri.disinfectrobot.BaseApplication;
import com.linfd.scri.disinfectrobot.Contanst;


/**
 * 文件描述：.
 * <p>  心跳管理类
 * 作者：Created by 林飞堞 on 2020/1/7
 * <p>
 * 版本号：donghaoProect
 */
public class HeartbeatManager {

    private MyRunnable mRunnable;
    private Handler mHandler;
    private static HeartbeatManager instance;
    public static HeartbeatManager getInstance(){
        if(instance == null) {
            synchronized (HeartbeatManager.class){
                if(instance == null) {
                    instance = new HeartbeatManager();
                }
            }
        }
        return instance;
    }

    public HeartbeatManager() {
        mHandler = BaseApplication.getHandler();
    }

    public void start(){
        if (mRunnable == null) {
            mRunnable = new MyRunnable();
            mHandler.postDelayed(mRunnable, 0);
        }
    }

    public void stop(){
        mHandler.removeCallbacks(mRunnable);
        mRunnable = null;
    }

    private class MyRunnable implements Runnable {
        @Override
        public void run() {

            UdpControlSendManager.getInstance().set_heartbeat("b4f89c82-8d3f-4b15-b293-0c605678a537");
            mHandler.postDelayed(this, Contanst.HEARTBEAT);
        }
    }
}
