package com.qf.mapper;

import com.qf.pojo.Users;
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

    /**
     * @param users 接收业务层传来的要新增的用户信息
     * @return返回int值做为添加用户是否成功的判断条件
     */
    public int addUsers(@Param("user")Users users);
}
