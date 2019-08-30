package com.qf.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Shop implements Serializable {
    private int shopId;
    private String shopName;
    private String shopAddress;
    private String shopTel;
    private String times;
    private String shopImg;

    public Shop() {
    }

    public Shop(int shopId, String shopName, String shopAddress, String shopTel, String times, String shopImg) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopTel = shopTel;
        this.times = times;
        this.shopImg = shopImg;
    }
}
