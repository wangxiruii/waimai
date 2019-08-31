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
    /* `goodsId` int(11) NOT NULL,
  `goodsName` varchar(2000) DEFAULT NULL,
  `price` double DEFAULT NULL,
            `sale` varchar(2000) DEFAULT NULL,
  `types` varchar(2000) DEFAULT NULL,
  `info` varchar(2000) DEFAULT NULL,
  `images` varchar(2000) DEFAULT NULL,*/
    private int goodsId;
    private String goodsName;
    private double price;
    private String sale;
    private String types;
    private String info;
    private String images;


    public Goods() {
    }

    public Goods(int goodsId, String goodsName, double price, String sale, String types, String info, String images) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
        this.sale = sale;
        this.types = types;
        this.info = info;
        this.images = images;
    }

}
