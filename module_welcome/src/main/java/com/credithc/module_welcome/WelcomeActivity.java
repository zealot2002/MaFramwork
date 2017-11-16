package com.credithc.module_welcome;

import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.credithc.commonlibrary.base.BaseActivity;

import org.zzy.aframwork.util.TimerUtil;

public class WelcomeActivity extends BaseActivity {
    private static final int SHOW_TIME = 2*1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new TimerUtil().startTimerTask(SHOW_TIME, new TimerUtil.TimerOutListener() {
            @Override
            public void onTimerOut() {
                ARouter.getInstance().build("/mine/MineActivity").navigation();

//                Routers.open(WelcomeActivity.this, "hyd://MineActivity");
//                Routers.open(WelcomeActivity.this, "hyd://LoanActivity");
            }
        });

//        Intent it = new Intent(WelcomeActivity.this,LoanActivity.class);
//        startActivity(it);
    }
}
