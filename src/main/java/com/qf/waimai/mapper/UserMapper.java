package com.qf.waimai.mapper;

import com.qf.waimai.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther:
 * @Date: 2019/8/21 19:45
 * @Description:
 */


/*提供权限系统对外访问的数据请求*/
    @Mapper
public interface UserMapper {
    /*根据登陆名查询用户*/
    public Users findUserInfo(@Param("userName") String userName);
    public int save(Users users);
}
