package com.credithc.module_loan;

import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.credithc.commonlibrary.base.RxBus;
import com.credithc.module_address.model.AddressBean;
import com.credithc.module_address.service.IAddressService;
import com.credithc.module_config.BusConstant;

import java.util.List;

@Route(path = "/loan/LoanActivity")
public class LoanActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "LoanActivity";
    private Button btnStartLoan,btnFinishLoan,btnGetAddressList;
    @Autowired
    IAddressService addressService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);
        initViews();
        ARouter.getInstance().inject(this);

    }

    private void initViews() {
        btnStartLoan = (Button) findViewById(R.id.btnStartLoan);
        btnFinishLoan = (Button) findViewById(R.id.btnFinishLoan);
        btnGetAddressList = (Button) findViewById(R.id.btnGetAddressList);

        btnStartLoan.setOnClickListener(this);
        btnFinishLoan.setOnClickListener(this);
        btnGetAddressList.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnStartLoan){
            RxBus.get().post(BusConstant.LOAN_STATE_START, "start load");
            Toast.makeText(LoanActivity.this,"消息已经发送",Toast.LENGTH_SHORT).show();
        }else if(v.getId()==R.id.btnFinishLoan){
            RxBus.get().post(BusConstant.LOAN_STATE_END, "end load");
            Toast.makeText(LoanActivity.this,"消息已经发送",Toast.LENGTH_SHORT).show();
        }else if(v.getId()==R.id.btnGetAddressList){
            List<AddressBean> addressList = addressService.getAddressList();
            for(AddressBean bean:addressList){
                Log.e(TAG,"name:"+bean.getName());
                Log.e(TAG,"phone :"+bean.getPhone());
                Toast.makeText(this,"得到一条地址：\n"+bean.getName()+" "+bean.getPhone(),Toast.LENGTH_LONG).show();
            }
        }
    }
}
