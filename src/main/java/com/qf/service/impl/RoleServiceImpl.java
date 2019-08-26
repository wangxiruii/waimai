package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
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
    public List<Role> findAll(int page,int rows) {
        PageHelper.startPage(page,rows);
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

    @Override
    public int loadByRoleName(String roleName) {
        return roleMapper.loadByRoleName(roleName);
    }

    @Override
    public int calcMaxpage(int rows) {
        int count=roleMapper.getTolalcount();
        return count%rows==0?count/rows:count/rows+1;

    }


}
