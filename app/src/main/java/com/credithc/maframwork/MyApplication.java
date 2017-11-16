package com.credithc.maframwork;

import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;
import com.credithc.commonlibrary.base.BaseApplication;

public class MyApplication extends BaseApplication {


    @Override
    public void onCreate() {
        super.onCreate();
//        if (Utils.isAppDebug()) {
//            //开启InstantRun之后，一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
//        }
        ARouter.init(this);
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // dex突破65535的限制
//        MultiDex.install(this);
    }
}
