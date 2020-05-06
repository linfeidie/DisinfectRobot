package com.linfd.scri.disinfectrobot;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

import com.linfd.scri.disinfectrobot.manager.AckListenerService;
import com.linfd.scri.disinfectrobot.manager.ObtainStatusStamp;


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
