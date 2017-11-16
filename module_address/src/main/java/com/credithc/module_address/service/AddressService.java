package com.credithc.module_address.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.credithc.module_address.model.AddressBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell-7020 on 2017/11/16.
 */
// 实现接口
@Route(path = "/service/hello", name = "测试服务")
public class AddressService implements IAddressService{
    @Override
    public List<AddressBean> getAddressList() {
        List<AddressBean> list = new ArrayList<>();
        list.add(new AddressBean("zzy","1213234"));
        return list;
    }

    @Override
    public void init(Context context) {

    }
}
