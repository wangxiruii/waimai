package com.qf.mapper;

import com.qf.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther:
 * @Date: 2019/8/24 16:10
 * @Description:
 */
@Mapper
public interface PermissionMapper {
    //查询权限
    public List<Permission> loadAll();
    //查询角色权限根据角色Id
    public List<Permission> loadByRoleId(int roleId);
    //删除角色权限
    public int deletePer(@Param("rid") int rid);
    //增加角色权限
    public int savePer(@Param("rid") int rid,@Param("ids") List<Integer> ids);
}
