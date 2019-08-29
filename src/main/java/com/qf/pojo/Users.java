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
        private String nickName;//用户昵称
        private String email;//用户邮箱
        private String tel;//用户手机
        private String num;//用户身份证好
        /*private String realName;//用户邮箱*/
  /*     `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(200) DEFAULT NULL,
  `userPwd` varchar(200) DEFAULT NULL,
  `nickName` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `tel` varchar(30) DEFAULT NULL,
  `num` varchar(200) DEFAULT NULL,
  `realName` varchar(200) DEFAULT NULL,*/
    public Users() {
    }

    public Users(int userId, String userName, String userPwd, String nickName,
                 String email, String tel, String num) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.nickName = nickName;
        this.email = email;
        this.tel = tel;
        this.num = num;
    }
}
