package com.qf.controller;

import com.qf.pojo.Users;
import com.qf.service.RoleService;
import com.qf.service.UserService;
import com.qf.service.User_Role_Service;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther:
 * @Date: 2019/8/21 20:26
 * @Description:
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    User_Role_Service user_role_service;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLoginForm(){
            return "login";
    }

    //登陆
    @RequestMapping(value = "/dengLogin",method = RequestMethod.POST)
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("userPwd") String userPwd){
        System.out.println(userName+"=="+userPwd);
        try {
            Subject subject= SecurityUtils.getSubject();
            UsernamePasswordToken token=new UsernamePasswordToken(userName,userPwd);
            subject.login(token);
            if (subject.isAuthenticated()){
                System.out.println("登陆成功");
                return "main";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "opop";

    }
    @RequestMapping("/main")
    public String showMain(){
        return "main";
    }
   /* @RequestMapping("error")
    public String showError(){
        return "error";
    }*/
   //注册
   @RequestMapping("/save")
    public String save(Users users){
        int count=userService.save(users);
        Users u=userService.loadUser(users);
        int count1= user_role_service.saveUr(users.getUserId());
        if (count>1){
            if (count1>1){
                return "login";
            }
            return "error";
        }
        return "error";

   }
}
