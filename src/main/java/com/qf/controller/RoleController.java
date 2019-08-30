package com.qf.controller;

import com.qf.pojo.Role;
import com.qf.service.RoleService;
import com.qf.service.User_Role_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Auther:
 * @Date: 2019/8/24 15:29
 * @Description:
 */
@Controller
public class RoleController {
    @Autowired
    RoleService roleService;
    @Autowired
    User_Role_Service user_role_service;
    // 分配角色
    @RequestMapping("roleFen")
    public String roleFen(int userId, HttpSession session, Model model){
        session.setAttribute("userId",userId);
        List<Role> list= user_role_service.loadIn(userId);
        List<Role> list1=user_role_service.loadOut(userId);
        model.addAttribute("list",list);
        model.addAttribute("list1",list);
        return "assignRole";
    }
    //左边
    @RequestMapping("left")
    public String left(@RequestParam("ids") List<Integer> ids,HttpSession session){
        List<Integer> uid= (List<Integer>) session.getAttribute("userId");
        user_role_service.deleteG(uid,ids);
        return "redirect:rolefen?userId="+uid;
    }
    //右边
    @RequestMapping("right")
    public String right(int rid,HttpSession session){
        int uid= (int) session.getAttribute("userId");
        user_role_service.saveUr(uid,rid);
        return "redirect:roleFen?userId="+uid;
    }
    //角色
    @RequestMapping("/loadRoleAll")
    public String loadRoleAll(@RequestParam(required = false,defaultValue = "1") int page,
                          @RequestParam(required = false, defaultValue = "4") int rows, Model model) {
        int maxPage=roleService.calcMaxpage(rows);
        if (page<1){
            page=maxPage;
        }
        if (page>maxPage){
            page=1;
        }
        List<Role> roleAll=roleService.findAll(page,rows);
        model.addAttribute("roleAll",roleAll);
        model.addAttribute("page",page);
        model.addAttribute("maxpage",maxPage);
        return "roles";
    }
    //添加角色
    @RequestMapping("saveRole")
    public String saveRole(Role role){
        int i = roleService.saveRole(role);
        return i>0?"redirect:loadRoleAll":"error";
    }
    //根据Id查询角色
    @RequestMapping("loadByRoleId")
    public String loadByRoleId(int roleId,Model model){
        Role role=roleService.loadByRoleId(roleId);
        model.addAttribute("role",role);
        return "up";
    }

    //修改
    @RequestMapping("updateRole")
    public String updateRole(Role role){
        int updateRole = roleService.updateRole(role);
        return updateRole>0?"redirect:loadRoleAll":"error";
    }
    //删除
    @RequestMapping("deleteRole")
    public String deleteRole(@RequestParam("ids") List<Integer> ids){
        int i = roleService.deleteRole(ids);
        return i>0?"redirect:loadRoleAll":"error";
    }
}
