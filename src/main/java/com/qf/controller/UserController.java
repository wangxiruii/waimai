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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
    public String save(Users users,String roleName){
        int count=userService.save(users);
        Users u=userService.loadUser(users);


        int count1= user_role_service.saveUr(users.getUserId(),roleService.loadByRoleName(roleName));
        if (count>1){
            if (count1>1){
                return "login";
            }
            return "error";
        }
        return "error";

   }
   //用户
   @RequestMapping("/loadAll")
    public String loadAll(@RequestParam(required = false,defaultValue = "1") int page,
                          @RequestParam(required = false, defaultValue = "4") int rows, Model model){
       int maxPage=userService.caleMaxPage(rows);
       if (page<1){
           page=maxPage;
       }
       if (page>maxPage){
           page=1;
       }
       List<Users> usersList=userService.loadAll(page,rows);
       model.addAttribute("userList",usersList);
       model.addAttribute("page",page);
       model.addAttribute("maxpage",maxPage);
       return "user";
   }
   @RequestMapping("delete")
    public String delete(@RequestParam("ids") List<Integer> ids){

       List<Integer> rid=user_role_service.loadByUid(ids);
       int count=user_role_service.deleteG(ids,rid);
       int c=userService.delete(ids);
       return c>0?"redirect:loadAll":"error";
   }
       //根据Id查询用户
   @RequestMapping("loadById")
    public String loadById(int userId,Model model){
       Users users=userService.loadById(userId);
       model.addAttribute("users",users);
       return "edit";
   }
   @RequestMapping("update")
    public String update(Users users){
       int count=userService.updetaUser(users);

       return count>0?"redirect:loadAll":"error";
   }
   @RequestMapping("loadName")
    public String loadBySearch(String userName,Model model){
       List<Users> usersList=userService.loadName(userName);
       model.addAttribute("userlist",usersList);
       return "user";
   }

}
