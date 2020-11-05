package com.linfd.scri.disinfectrobot;

import android.util.Log;
import android.widget.TextView;

import com.linfd.scri.disinfectrobot.entity.GetErrorCodeEntity;
import com.linfd.scri.disinfectrobot.entity.GetErrorCodeResultEntity;
import com.linfd.scri.disinfectrobot.manager.HeartbeatManager5;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

public class ErrorShowActivity extends BaseActivity {

    public static final String TAG = ErrorShowActivity.class.getSimpleName();
    private TextView tv_charging_station,tv_hanxin,tv_yugong;
    private StringBuilder sb_hanxin ,sb_yugong;
    @Override
    public void initView() {
        setContentView(R.layout.activity_error_show);
        tv_charging_station = findViewById(R.id.tv_charging_station);
        tv_hanxin = findViewById(R.id.tv_hanxin);
        tv_yugong = findViewById(R.id.tv_yugong);
    }

    @Override
    protected void onStart() {
        super.onStart();
        HeartbeatManager5.getInstance().start();//异常状态获取
    }

    @Override
    protected void onStop() {
        super.onStop();
        HeartbeatManager5.getInstance().stop();
    }

    /*
     * 接收异常信息的
     * */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveMsg(GetErrorCodeResultEntity entity) {
        Log.e(TAG,entity.charges.get(0).getError_mode());
        sb_hanxin = new StringBuilder();
        //充电桩的
        List<GetErrorCodeEntity.InfoBean.ChargingStationBean.Cj02Bean.EnBean> zhCnBeanXES = new ArrayList<>();//过滤掉重复的
        for (int i = 0; i < entity.charges.size(); i++) {
            if (!zhCnBeanXES.contains(entity.charges.get(i))) {//如果不包含就加入
                zhCnBeanXES.add(entity.charges.get(i));

            }
        }
        tv_charging_station.setText(zhCnBeanXES.toString());
        //韩信  可以恢复的异常
        List<GetErrorCodeEntity.InfoBean.HanxinBean.Yg00a00020071211000n00Bean.ZhCnBeanX> zhCnBeanHXSY = new ArrayList<>();
        //不可恢复的
        List<GetErrorCodeEntity.InfoBean.HanxinBean.Yg00a00020071211000n00Bean.ZhCnBeanX> zhCnBeanHXSN = new ArrayList<>();
        for (int i = 0; i < entity.hanxins.size(); i++) {

            //如果是可以恢复的  否则是不可以恢复的
            if (entity.hanxins.get(i).getSelf_recoverable().equals("Y")) {
                zhCnBeanHXSY.add(entity.hanxins.get(i));
            } else if (entity.hanxins.get(i).getSelf_recoverable().equals("N")) {
                zhCnBeanHXSN.add(entity.hanxins.get(i));
            }
            sb_hanxin.append(entity.hanxins.get(i).getError_mode()).append(",");
        }

        tv_hanxin.setText(sb_hanxin.toString());

    }
}
