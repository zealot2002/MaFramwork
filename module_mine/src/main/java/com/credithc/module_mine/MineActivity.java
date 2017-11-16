package com.credithc.module_mine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.credithc.commonlibrary.base.RxBus;
import com.credithc.module_config.BusConstant;
import com.hwangjr.rxbus.annotation.Subscribe;
import com.hwangjr.rxbus.annotation.Tag;
import com.hwangjr.rxbus.thread.EventThread;

@Route(path = "/mine/MineActivity")
public class MineActivity extends AppCompatActivity {
    private Button btnOpenLoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        RxBus.get().register(this);
        initViews();
    }

    private void initViews() {
        btnOpenLoan = (Button) findViewById(R.id.btnOpenLoan);
        btnOpenLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ARouter.getInstance().build("/loan/LoanActivity").navigation();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RxBus.get().unregister(this);
    }

    /**
     * 订阅贷款开始消息
     */
    @Subscribe(thread = EventThread.MAIN_THREAD, tags = {@Tag(value = BusConstant.LOAN_STATE_START)})
    public void loadStartEventReceiver(String s) {
        try {
            Toast.makeText(MineActivity.this,"loadStartEventReceiver:"+s,Toast.LENGTH_LONG).show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 订阅贷款开始消息
     */
    @Subscribe(thread = EventThread.MAIN_THREAD, tags = {@Tag(value = BusConstant.LOAN_STATE_END)})
    public void loadEndEventReceiver(String s) {
        try {
            Toast.makeText(MineActivity.this,"loadEndEventReceiver:"+s,Toast.LENGTH_LONG).show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
