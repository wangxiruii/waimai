package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/28 11:52
 * @Description:
 */
@Controller
public class ViewController {
    @RequestMapping("/")
    public String showLoginForm(){
        return "login";
    }
    @RequestMapping("/loginView")
    public String showLogin(){
        return "login";
    }

    @RequestMapping("viewaddmin")
    public String viewaddmin(){
        return "addAdmin";
    }

    @RequestMapping("viewaddbusiness")
    public String viewAddBusiness(){
        return "addBusiness";
    }

    @RequestMapping("viewaddgoods")
    public String viewAddGoods(){
        return "addGoods";
    }

    @RequestMapping("viewaddpermission")
    public String viewAddPermission(){
        return "addPermission";
    }

    @RequestMapping("viewadduser")
    public String viewAddUser(){
        return "addUser";
    }

    @RequestMapping("viewadminlist")
    public String viewAdminList(){
        return "adminList";
    }

    @RequestMapping("viewbusinesslist")
    public String viewBusinessList(){
        return "businessList";
    }

    @RequestMapping("viewcompletedlist")
    public String viewCompletedList(){
        return "completedList";
    }

    @RequestMapping("viewdeliveredlist")
    public String viewDeliveredList(){
        return "deliveredList";
    }

    @RequestMapping("viewdelivergoodslist")
    public String viewDeliverGoodsList(){
        return "deliverGoodsList";
    }

    @RequestMapping("viewdelivergoodsupdate")
    public String viewDeliverGoodsUpdate(){
        return "deliverGoodsUpdate";
    }

    @RequestMapping("viewdrink")
    public String viewDrink(){
        return "drink";
    }

    @RequestMapping("viewgoodlist")
    public String viewGoodList(){
        return "goodList";
    }

    @RequestMapping("viewmain")
    public String viewMain(){
        return "main";
    }

    @RequestMapping("vieworderlist")
    public String viewOrderList(){
        return "orderList";
    }

    @RequestMapping("viewpermission")
    public String viewPermission(){
        return "permission";
    }

    @RequestMapping("viewsnack")
    public String viewSnack(){
        return "snack";
    }

    @RequestMapping("viewstaplefood")
    public String viewStapleFood(){
        return "stapleFood";
    }

    @RequestMapping("viewupdateadmin")
    public String viewUpdateAdmin(){
        return "updateAdmin";
    }

    @RequestMapping("viewupdategoods")
    public String viewUpdateGoods(){
        return "updateGoods";
    }

    @RequestMapping("viewupdateuser")
    public String viewUpdateUser(){
        return "updateUser";
    }

    @RequestMapping("viewuserlist")
    public String viewUserList(){
        return "userList";
    }

    @RequestMapping("viewwechat")
    public String viewWeChat(){
        return "weChat";
    }

    @RequestMapping("viewwelcome")
    public String viewWelcome(){
        return "welcome";
    }
    @RequestMapping("viewReg")
    public String viewReg(){
        return "register";
    }

    @RequestMapping("viewalipay")
    public String viewAlipay(){
        return "alipay";
    }
}
