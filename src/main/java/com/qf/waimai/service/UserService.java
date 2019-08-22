package com.qf.waimai.service;

import com.qf.waimai.pojo.Users;

/**
 * @Auther:
 * @Date: 2019/8/21 20:20
 * @Description:
 */
public interface UserService {
    public Users findUserInfo(String userName);
}
