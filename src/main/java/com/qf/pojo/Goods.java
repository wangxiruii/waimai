package com.qf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/22 21:35
 * @Description:
 */
@Data
public class Goods implements Serializable {
    private int goodsId;
    private String goodsName;
    private double price;
    private String sale;
    private String typles;
    private String info;
}
