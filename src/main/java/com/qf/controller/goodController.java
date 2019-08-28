package com.qf.controller;

import com.qf.pojo.Goods;
import com.qf.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/22 21:38
 * @Description:本类集合商品的所有信息，执行所有商品业务层的数据交互
 */
@Controller
public class goodController {
    @Autowired
    GoodService goodService;
    //查询全部商品
    @RequestMapping("/loadAllGoods")
    public String loadAllGoods(@RequestParam(required = false,defaultValue = "1") int page,
                               @RequestParam(required = false,defaultValue = "4") int rows, Model model){
        int maxPage=goodService.caleMaxPage(rows);
        if (page<1){
            page=maxPage;
        }
        if (page>maxPage){
            page=1;
        }
        List<Goods> goodsList=goodService.loadAllGoods(page,rows);
        model.addAttribute("goodsList",goodsList);
        model.addAttribute("page",page);
        model.addAttribute("maxPage",maxPage);
        return "goods";

    }
    @RequestMapping("/addGoods")
    public String addGoods(Goods goods){
        int count=goodService.saveGoods(goods);
        return count>1?"addGoods":"error";
    }
    @RequestMapping("/deleteGoods")
    public String deleteGoods(@RequestParam("ids") List<Integer> ids){
        int count=goodService.deleteGoods(ids);
        return count>0?"redirect:loadAllGoods":"error";
    }
    //根据商品Id查商品
    @RequestMapping("loadByGoods")
    public String loadByGoods(int goodId,Model model){
        Goods goods=goodService.loadByGoods(goodId);
        model.addAttribute("goods",goods);
        return "editGoods";//修改页
    }
    //修改
    @RequestMapping("updateGoods")
    public  String updateGoods(Goods goods){
        int count=goodService.updateGoods(goods);

        return count>0?"redirect:loadAllGoods":"error";
    }
}
