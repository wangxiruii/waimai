package com.qf.service;

import com.qf.pojo.Users;

import java.util.List;

/**
 * @Auther:
 * @Date: 2019/8/21 20:20
 * @Description:
 */
public interface UserService {
    //根据用户名查询用户信息
    public Users findUserInfo(String userName);
    //注册
    public int save(Users users);
    //查找用户
    public Users loadUser(Users users);
    //查询所有用户
    public List<Users> loadAll(int page,int rows);
    //删除(批量)
    public int delete(List<Integer> ids);
    //修改
    public int updetaUser(Users users);
    //模糊查询
    public List<Users> loadName(String userName);
    //查询行数
    public int caleMaxPage(int rows);
    //根据Id查询用户
    public Users loadById(int userId);
<<<<<<< HEAD

    //
   // public void sendSimpleMail(String to, String title, String content);

    //前台

=======
    //用户列表查询
    public List<Users> findAllUser();
    //
    public void sendSimpleMail(String to, String title, String content);
>>>>>>> origin/master
}
