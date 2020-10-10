package com.linfd.scri.disinfectrobot.manager;

import android.util.Log;

import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.linfd.scri.disinfectrobot.BaseApplication;
import com.linfd.scri.disinfectrobot.Contanst;
import com.linfd.scri.disinfectrobot.entity.BaseEntity;
import com.linfd.scri.disinfectrobot.entity.GetAllTasksEntity;
import com.linfd.scri.disinfectrobot.entity.RobotRegisterEntity;
import com.linfd.scri.disinfectrobot.entity.TaskStatusEntity;
import com.linfd.scri.disinfectrobot.listener.HttpCallbackEntity;
import com.tsy.sdk.myokhttp.MyOkHttp;
import com.tsy.sdk.myokhttp.response.GsonResponseHandler;
import com.tsy.sdk.myokhttp.response.RawResponseHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class HttpRequestManager {

    public static final String TAG = HttpRequestManager.class.getSimpleName();

    private static volatile HttpRequestManager ourInstance;
    private  MyOkHttp mMyOkHttp;

    /*
    * 构造函数
    * */
    public HttpRequestManager() {
    }

    public static HttpRequestManager getInstance(){
        if (ourInstance == null){
            synchronized (HttpRequestManager.class){
                if (ourInstance == null){
                    ourInstance = new HttpRequestManager();
                }
            }
        }
        return ourInstance;
    }

    public  void init(){
//持久化存储cookie
        ClearableCookieJar cookieJar =
                new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(BaseApplication.getApplication()));

        //log拦截器
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        //自定义OkHttp
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                .cookieJar(cookieJar)       //设置开启cookie
                .addInterceptor(logging)            //设置开启log
                .build();
        mMyOkHttp = new MyOkHttp(okHttpClient);
    }

    public void cancel(){
        mMyOkHttp.cancel(this);     //tag 即之前请求时传入的tag 建议直接将页面作为object传入
    }
    /*
    * 查询任务运⾏状态 - 根据任务id
    * */
    public <T> void  get_task_status(int id, final HttpCallbackEntity<T> httpCallbackEntity){
        String url = Contanst.api_get_task_status + id;


        mMyOkHttp.get()
                .url(url)
//                        .addParam("name", "tsy")
//                        .addParam("id", "5")
                .tag(this)
                .enqueue(new GsonResponseHandler<TaskStatusEntity>() {

                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        httpCallbackEntity.onFailure();
                    }

                    @Override
                    public void onSuccess(int statusCode, TaskStatusEntity response) {

                        httpCallbackEntity.onSuccess((T) response);

                    }
                });


    }
    /*
    * 启动韩信
    * */
    public <T> void hanxin_start(final HttpCallbackEntity<T> httpCallbackEntity){
        String url = Contanst.api_hanxin_start;
        mMyOkHttp.get()
                .url(url)
                .tag(this)
                .enqueue(new GsonResponseHandler<BaseEntity>() {

                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        httpCallbackEntity.onFailure();
                    }

                    @Override
                    public void onSuccess(int statusCode, BaseEntity response) {

                        httpCallbackEntity.onSuccess((T) response);

                    }
                });
    }

    /*
    * 关闭韩信
    * */
    public <T >void hanxin_stop(final HttpCallbackEntity<T> httpCallbackEntity){
        String url = Contanst.api_hanxin_stop;
        mMyOkHttp.get()
                .url(url)
                .tag(this)
                .enqueue(new GsonResponseHandler<BaseEntity>() {

                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        httpCallbackEntity.onFailure();
                    }

                    @Override
                    public void onSuccess(int statusCode, BaseEntity response) {

                        httpCallbackEntity.onSuccess((T) response);

                    }
                });
    }
    /*
    * 注册机器人
    * */
    public <T> void robot_register(final HttpCallbackEntity<T> httpCallbackEntity){
        String url = Contanst.api_robot_register + Contanst.ROBOT_SERIAL;
        mMyOkHttp.get()
                .url(url)
                .tag(this)
                .enqueue(new GsonResponseHandler<RobotRegisterEntity>() {

                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        httpCallbackEntity.onFailure();
                    }

                    @Override
                    public void onSuccess(int statusCode, RobotRegisterEntity response) {

                        httpCallbackEntity.onSuccess((T) response);

                    }
                });
    }

    /*
    *查询所有任务信息
    * */
    public <T> void get_all_tasks(final HttpCallbackEntity<T> httpCallbackEntity){
        String url = Contanst.api_get_all_tasks;
        mMyOkHttp.get()
                .url(url)
                .tag(this)
                .enqueue(new GsonResponseHandler<GetAllTasksEntity>() {

                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        httpCallbackEntity.onFailure();
                    }

                    @Override
                    public void onSuccess(int statusCode, GetAllTasksEntity response) {

                        httpCallbackEntity.onSuccess((T) response);

                    }
                });
    }

    /*
    * 重复任务
    * */
    public <T> void repeat_tasks(int taskId ,  final HttpCallbackEntity<T> httpCallbackEntity){

        String url = Contanst.api_repeat_tasks;

        Map<String, Object> params = new HashMap<>();
        params.put("repeat_num", 1);
        List<Integer> id_list = new ArrayList<>();
        id_list.add(taskId);
        params.put("id_list", id_list);

        mMyOkHttp.post()
                .url(url)
                .tag(this)
                .enqueue(new GsonResponseHandler<BaseEntity>() {

                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        httpCallbackEntity.onFailure();
                    }

                    @Override
                    public void onSuccess(int statusCode, BaseEntity response) {

                        httpCallbackEntity.onSuccess((T) response);

                    }
                });
    }
}
