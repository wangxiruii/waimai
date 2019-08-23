package com.qf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther:
 * @Date: 2019/8/22 16:14
 * @Description:
 */
@Data
public class Role  implements Serializable {
    private int roleId;
    private String roleName;
}
