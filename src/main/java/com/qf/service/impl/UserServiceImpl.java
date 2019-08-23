package com.qf.service.impl;

import com.qf.mapper.UserMapper;
import com.qf.pojo.Users;
import com.qf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther:
 * @Date: 2019/8/21 20:22
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public Users findUserInfo(String userName) {
        Users users=userMapper.findUserInfo(userName);
        return users;
    }

    @Override
    public int save(Users users) {
        int count=userMapper.save(users);
        return count;
    }

}
