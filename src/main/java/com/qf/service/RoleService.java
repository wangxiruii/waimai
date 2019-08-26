package com.qf.service;

import com.qf.pojo.Role;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/22 21:39
 * @Description:
 */
public interface RoleService {
    //查询所有角色
    public List<Role> findAll(int page,int rows);
    //根据Id查角色
    public Role loadByRoleId(int roleId);
    //增加角色
    public int saveRole(Role role);
    //删角色
    public int deleteRole(List<Integer> ids);
    //改角色
    public int updateRole(Role role);
    //根据角色名查询角色ID
    public int loadByRoleName(String roleName);
    //查询行数
    public int calcMaxpage(int rows);
}
