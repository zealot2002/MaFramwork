package com.credithc.module_address.model;

/**
 * Created by dell-7020 on 2017/11/16.
 */

public class AddressBean {
    private String name;
    private String phone;
    private String detail;

    public AddressBean(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
