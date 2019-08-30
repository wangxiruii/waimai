package com.qf.controller;

import com.qf.pojo.Goods;
import com.qf.pojo.Shop;
import com.qf.service.GoodsService;
import com.qf.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class GoodsController {

        @Autowired
        private GoodsService goodsService;
        @Autowired
        private ShopService shopService;
        //前台
        /**
         * 调用service方法 实现查询所有用户
         * @return  返回的是商品集合
         */
        @RequestMapping("loadgoodsall")
        public String loadGoodsAll(Model model){
            List<Goods> goodsList = goodsService.loadGoodsAll();
            List<Shop> shopList = shopService.loadShopAll();
            model.addAttribute("shopList",shopList);
            model.addAttribute("goodsList",goodsList);
            /*session.setAttribute("goodsList",goodsList);
            System.out.println(goodsList);*/
            return "category";
        }

    /**
     * 调用service方法 实现AJAX异步刷新模糊查询
     * @param aa   参数是搜索的字符串
     * @param model  存储查询到的数据
     * @return   返回值是商品的集合list
     */
        @ResponseBody
        @RequestMapping("selectgoods")
        public List selectGoods(String aa,Model model){
            List<Goods> goodsList=goodsService.selectGoods(aa);
            model.addAttribute("goodsList",goodsList);
            /*session.setAttribute("goodsList",goodsList);
            System.out.println(session.getAttribute("goodsList")+"==========");*/
            return goodsList;

        }

    /**
     * 调用service实现分类显示
     * @param bb  参数是商品类型
     * @param model   存储在model中
     * @return  返回值是对应的商品集合list
     */
    @ResponseBody
    @RequestMapping("selectstaplefood")
    public List loadStapleFood(String bb,Model model){
        List<Goods> goods = goodsService.loadStapleFood(bb);
        model.addAttribute("goods",goods);
        return goods;
    }

    /**
     * 调用service实现分类显示
     * @param cc  参数是商品类型
     * @param model   存储在model中
     * @return  返回值是对应的商品集合list
     */
    @ResponseBody
    @RequestMapping("selectstaplefood2")
    public List loadStapleFood2(String cc,Model model){
        List<Goods> goods = goodsService.loadStapleFood(cc);
        model.addAttribute("goods",goods);
        return goods;
    }

    /**
     * 调用service实现分类显示
     * @param dd  参数是商品类型
     * @param model   存储在model中
     * @return  返回值是对应的商品集合list
     */
    @ResponseBody
    @RequestMapping("selectstaplefood3")
    public List loadStapleFood3(String dd,Model model){
        List<Goods> goods = goodsService.loadStapleFood(dd);
        model.addAttribute("goods",goods);
        return goods;
    }

    /**
     * 调用service方法实现根据物品id查询具体的物品详情
     * @param goodsId   参数是物品的id
     * @param model  用来存储数据
     * @return   返回的是商品的具体信息
     */
    @RequestMapping("loadgoodsbyid")
    public String loadGoodsById(int goodsId,Model model){
        Goods good = goodsService.loadGoodsById(goodsId);
        model.addAttribute("good",good);
        return "detailsp";
    }
}


