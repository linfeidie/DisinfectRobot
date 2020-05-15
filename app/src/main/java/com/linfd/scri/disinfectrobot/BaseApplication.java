package com.linfd.scri.disinfectrobot;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

import com.linfd.scri.disinfectrobot.listener.SimpleUdpListener;
import com.linfd.scri.disinfectrobot.manager.AckListenerService;
import com.linfd.scri.disinfectrobot.manager.GetFromServerData;
import com.linfd.scri.disinfectrobot.manager.LooperDisinStatusService;
import com.linfd.scri.disinfectrobot.manager.LooperStatusService;
import com.linfd.scri.disinfectrobot.manager.ObtainStatusStamp;
import com.linfd.scri.disinfectrobot.manager.ServerListeners;
import com.linfd.scri.disinfectrobot.manager.TimerManager;
import com.linfd.scri.disinfectrobot.manager.UdpControlSendManager;


public class BaseApplication extends Application {
  private static BaseApplication application;
  private static int mainTid;
  private static Handler handler;

  @Override
  public void onCreate() {
    super.onCreate();
    application=this;
    mainTid = android.os.Process.myTid();
    handler=new Handler();
    ObtainStatusStamp.init();
    AckListenerService.init();
    GetFromServerData.listener();

    //LooperDisinStatusService.obtainStatus();
    LooperStatusService.obtainStatus();
    ServerListeners.register();
  }


  public static Context getApplication() {
    return application;
  }
  public static int getMainTid() {
    return mainTid;
  }
  public static Handler getHandler() {
    return handler;
  }
}
