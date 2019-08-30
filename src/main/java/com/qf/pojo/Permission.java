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
  /*  `perId` int(11) NOT NULL AUTO_INCREMENT,
  `pId` int(11) DEFAULT NULL,
  `perName` varchar(20) DEFAULT NULL,*/

    public Permission() {
    }

    public Permission(int perId, int pId, String perName, String checked) {
        this.perId = perId;
        this.pId = pId;
        this.perName = perName;
        this.checked = checked;
    }
}
