package com.qf.service;

import com.qf.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther:
 * @Date: 2019/8/23 17:31
 * @Description:
 */
public interface User_Role_Service {
    //注册用户关系
    public int saveUr(@Param("uid") int uid ,@Param("rid") int rid) ;
    //根据用户Id查询用户角色关系
    public List<Integer> loadByUid(List<Integer> userId);
    //删除关系
    public int deleteG(@Param("uId") List<Integer> uid, @Param("ids") List<Integer> ids);
    //查询用户Id查询角色表
    public List<Role> loadIn(int userId);
    public List<Role> loadOut(int userId);
}
