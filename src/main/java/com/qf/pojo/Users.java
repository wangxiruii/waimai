package com.qf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther:
 * @Date: 2019/8/21 19:40
 * @Description:
 */
@Data
public class Users implements Serializable {
        private int userId;//用户id
        private String userName;//用户名
        private String userPwd;//用户密码
        private String uname;//用户昵称
        private String email;//用户邮箱

    public Users() {
    }

    public Users(int userId, String userName, String userPwd, String uname, String email) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.uname = uname;
        this.email = email;
    }
}
