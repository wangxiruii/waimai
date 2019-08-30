package com.qf.controller;


import com.qf.pojo.Shop;
import com.qf.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ShopController {
    @Autowired
    private ShopService shopService;

    /**
     * 查询所有的店铺
     * @param model  存储数值
     * @return  返回值是一个店铺的集合
     */
    @RequestMapping("loadshopall")
    public String loadShopAll(Model model){
        List<Shop> shopList = shopService.loadShopAll();
        model.addAttribute("shopList",shopList);
        return "";
    }

    /**
     * 根据id来查询店铺
     * @param shopId 参数类型是店铺id
     * @param model   存储数值
     * @return  返回的是具体的数值
     */
    @RequestMapping("getshopbyid")
    public String getShopById(int shopId,Model model){
        Shop shop = shopService.getShopById(shopId);
        model.addAttribute("shop",shop);
        return "shop";
    }

    /*@RequestMapping("loadshopbyid")
    public String loadShopById(int shopId){
        Shop shopp = shopService.getShopById(shopId);
        return "shop";
    }*/
}
