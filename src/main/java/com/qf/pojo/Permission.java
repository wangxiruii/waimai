package com.qf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/23 10:10
 * @Description:
 */
@Data
public class Permission implements Serializable {
    private int perId;
    private int pId;
    private String perName;
    private String checked="false";
}
