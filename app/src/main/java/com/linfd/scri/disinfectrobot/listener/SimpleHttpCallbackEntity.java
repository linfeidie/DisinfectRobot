package com.linfd.scri.disinfectrobot.listener;

import com.linfd.scri.disinfectrobot.Tools;

public abstract  class SimpleHttpCallbackEntity<T> implements HttpCallbackEntity<T> {


    @Override
    public void onFailure(String errmsg) {
        Tools.showToast(errmsg);
    }
}
