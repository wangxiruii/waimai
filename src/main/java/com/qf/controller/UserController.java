package com.qf.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLoginForm(){
            return "login";
    }

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
}
