package com.qf.controller;

import com.qf.pojo.Users;
import com.qf.service.RoleService;
import com.qf.service.UserService;
import com.qf.service.User_Role_Service;
import com.qf.service.impl.UserServiceImpl;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Random;

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
<<<<<<< HEAD
=======
    //

   /*
    @Resource
    JavaMailSender javaMailSender;*/
>>>>>>> origin/master
    //登陆
    @RequestMapping("/dengLogin")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("userPwd") String userPwd){
        System.out.println(userName+"=="+userPwd);
        try {
            Subject subject= SecurityUtils.getSubject();
            UsernamePasswordToken token=new UsernamePasswordToken(userName,userPwd);
            subject.login(token);
            if (subject.isAuthenticated()){
                System.out.println("登陆成功");
                return "redirect:loadgoodsall";
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
  /* @RequestMapping("save")
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
   }*/
  //管理员添加用户
   @RequestMapping("saveuser")
   public String save(Users users){
       if (users.getUserName().equals("") || users.getUserPwd().equals("")){
           return "error";
       }
       int count=userService.save(users);
     return count>1?"main":"error";
   }
   //注册
   @RequestMapping("reg")
   public String reg(Users users){

       if (users.getUserName().equals("") || users.getUserPwd().equals("")){
           return "error";
       }

       int count=userService.save(users);

       return count>0?"redirect:loginView":"error";
   }
   // 用户
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
       System.out.println(usersList);
       model.addAttribute("userList",usersList);
       model.addAttribute("page",page);
       model.addAttribute("maxpage",maxPage);
       return "userList";
   }
   //用户列表数据表述
   @RequestMapping("findAllUser")
   public String findAllUser (Model model){
       List<Users> users=userService.findAllUser();
       model.addAttribute("users",users);
       return "userList";
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
    @RequestMapping("getCheckCode")
    @ResponseBody
    public String getCheckCode(String email) throws EmailException {

        String checkcode = String.valueOf(new Random().nextInt(899999) + 100000);
        String message="您正在注册千峰外卖邮箱，验证码为:"+checkcode+"。感谢您对千峰的信任!请妥善保管该验证码!";
        try {
            userService.sendSimpleMail(email,"千峰外卖注册验证码",message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checkcode;
    }
    @ResponseBody
    @RequestMapping("/emil")
    public String eMail(String mail, HttpServletRequest request)throws EmailException{

       /* Users users=(Users)request.getSession().getAttribute("user");
        String usereName=users.getUserName();*/
        HtmlEmail el=new HtmlEmail();    //创建一个HtmlEmail 实例
        el.setHostName("smtp.qq.com");   //邮箱的SMTP服务器
        el.setCharset("utf-8");   //设置发送的字符类型
        el.addTo(mail);    //对方
        el.setFrom("714338547@qq.com","千峰外卖");  //从哪发
        el.setAuthentication("714338547@qq.com","gbubjivndekzbffj");  //设置发送的邮箱  和授权码
        el.setSubject("千峰外卖---验证码");
        String yan = String.valueOf(new Random().nextInt(899999) + 100000);
        request.getSession().setAttribute("cc",yan);
        el.setMsg("【千峰外卖】验证码:"+"("+yan+")"+"请勿转发,转发可能导致账号被盗。感谢您对千峰的信任!请妥善保管该验证码!");
        el.send();
        return yan;

    }
    @RequestMapping("code")
    @ResponseBody
    public String code(String code,HttpServletRequest request){

       String code1=(String)request.getSession().getAttribute("cc");

       String va=code1.equals(code)?"yes":"no";

       return va;

    }



   //前台
}
