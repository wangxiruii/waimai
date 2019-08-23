package com.qf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/23 10:12
 * @Description:
 */
@Data
public class Bookmark implements Serializable {
    private int markId;
    private String markName;
}
