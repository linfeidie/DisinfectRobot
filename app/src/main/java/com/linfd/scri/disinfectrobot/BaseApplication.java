package com.linfd.scri.disinfectrobot;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.os.Environment;
import android.os.Handler;

import com.linfd.scri.disinfectrobot.listener.SimpleUdpListener;
import com.linfd.scri.disinfectrobot.manager.AckListenerService;
import com.linfd.scri.disinfectrobot.manager.GetFromServerData;
import com.linfd.scri.disinfectrobot.manager.LogCookManager;
import com.linfd.scri.disinfectrobot.manager.LooperDisinStatusService;
import com.linfd.scri.disinfectrobot.manager.LooperStatusService;
import com.linfd.scri.disinfectrobot.manager.ObtainStatusStamp;
import com.linfd.scri.disinfectrobot.manager.ServerListeners;
import com.linfd.scri.disinfectrobot.manager.TimerManager;
import com.linfd.scri.disinfectrobot.manager.UdpControlSendManager;
import com.whieenz.LogCook;


public class BaseApplication extends Application {
  private static BaseApplication application;
  private static int mainTid;
  private static Handler handler;
  public static Rect chargerect;//充电桩位置
  public static boolean isdrawPaht = false;//当前地图是否绘制行走路径

  @Override
  public void onCreate() {
    super.onCreate();
    application=this;
    mainTid = android.os.Process.myTid();
    handler=new Handler();
   // CrashHandler.getInstance().initCrashHandler(this);
    ObtainStatusStamp.init();
    AckListenerService.init();
    GetFromServerData.listener();

    //LooperDisinStatusService.obtainStatus();
   //开机就获取机器人状态和消毒状态
    LooperStatusService.obtainStatus();
    ServerListeners.register();

    LogCookManager.init();
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
