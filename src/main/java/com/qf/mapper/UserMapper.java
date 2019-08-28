package com.qf.mapper;

import com.qf.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
    //注册用户
    public int save(Users users);
    //查找用户
    public Users loadUser(Users users);
    //查询所有用户
    public List<Users> loadAll();
        //删除(批量)
    public int delete(List<Integer> ids);
        //修改
    public int updetaUser(Users users);
    //模糊查询
    public List<Users> loadName(String userName);
    //查询行数
    public int getTotalCount();
    //根据Id查询用户
    public Users loadById(int userId);


}
