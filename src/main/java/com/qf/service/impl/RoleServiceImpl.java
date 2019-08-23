package com.qf.service.impl;

import com.qf.mapper.RoleMapper;
import com.qf.pojo.Role;
import com.qf.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/22 21:39
 * @Description:
 */
@Service
public class RoleServiceImpl implements RoleService{
    @Resource
    RoleMapper roleMapper;
    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    @Override
    public Role loadByRoleId(int roleId) {
        return roleMapper.loadByRoleId(roleId);
    }

    @Override
    public int saveRole(Role role) {
        return roleMapper.saveRole(role);
    }

    @Override
    public int deleteRole(List<Integer> ids) {
        return roleMapper.deleteRole(ids);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateRole(role);
    }
}
