package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.qf.pojo.Users;
import com.qf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:
 * @Date: 2019/8/21 20:22
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private com.qf.mapper.UserMapper userMapper;
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

    @Override
    public Users loadUser(Users users) {
        return userMapper.loadUser(users);
    }

    @Override
    public List<Users> loadAll(int page, int rows) {
        PageHelper.startPage(page,rows);
        return userMapper.loadAll();
    }


    @Override
    public int delete(List<Integer> ids) {
        return userMapper.delete(ids);
    }

    @Override
    public int updetaUser(Users users) {
        return userMapper.updetaUser(users);
    }

    @Override
    public List<Users> loadName(String userName) {
        return userMapper.loadName(userName);
    }

    @Override
    public int caleMaxPage(int rows) {
        int count=userMapper.getTotalCount();
        return count % rows==0?count/rows:count/rows+1;
    }

    @Override
    public Users loadById(int userId) {
        return userMapper.loadById(userId);
    }


}
