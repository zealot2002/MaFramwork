package com.credithc.module_address.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.credithc.module_address.model.AddressBean;

import java.util.List;

/**
 * Created by dell-7020 on 2017/11/16.
 */

public interface IAddressService extends IProvider {
    List<AddressBean> getAddressList();
}
