package com.credithc.maframwork;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.credithc.module_home.HomeActivity;
import com.credithc.module_welcome.WelcomeActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        ARouter.getInstance().build("/test/TestActivity").navigation();
//        ARouter.getInstance().build("/loan/LoanActivity").navigation();

        Intent it = new Intent(MainActivity.this, WelcomeActivity.class);
        startActivity(it);
        finish();
    }
}
