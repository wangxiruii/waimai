package com.qf.service.impl;

import com.qf.mapper.User_role_mapper;
import com.qf.pojo.Role;
import com.qf.service.User_Role_Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:
 * @Date: 2019/8/23 17:32
 * @Description:
 */
@Service
public class User_Role_ServiceImpl implements User_Role_Service {
    @Resource
    User_role_mapper user_role_mapper;

    @Override
    public int saveUr(int uid,int rid) {
        return user_role_mapper.saveUr(uid,rid);
    }

    @Override
    public List<Integer> loadByUid(List<Integer> userId) {
        return user_role_mapper.loadByUid(userId);
    }

    @Override
    public int deleteG(List<Integer> uid, List<Integer> ids) {
        return user_role_mapper.deleteG(uid,ids);
    }

    @Override
    public List<Role> loadIn(int userId) {
        return user_role_mapper.loadIn(userId);
    }

    @Override
    public List<Role> loadOut(int userId) {
        return user_role_mapper.loadOut(userId);
    }

}
