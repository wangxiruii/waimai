package com.qf.service;

import com.qf.pojo.Goods;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/22 21:39
 * @Description:
 */
public interface GoodsService {
    //前台

    /**
     * 查询所有的商品
     * @return  返回值是一个商品的list
     */
    public List<Goods> loadGoodsAll();


    /**
     * 模糊搜索
     * @param aa  参数类型string
     * @return  返回的是模糊搜索出的商品list
     */
    public List<Goods> selectGoods(String aa);


    /**
     * 根据分类查询商品
     * @param bb  参数类型是商品的类型
     * @return    返回的是商品的集合list
     */
    public List<Goods> loadStapleFood(String bb);


    /**
     * 根据分类查询商品
     * @param cc  参数类型是商品的类型
     * @return    返回的是商品的集合list
     */
    public List<Goods> loadStapleFood2(String cc);


    /**
     * 根据分类查询商品
     * @param dd  参数类型是商品的类型
     * @return    返回的是商品的集合list
     */
    public List<Goods> loadStapleFood3(String dd);

    /**
     * 根据物品id查询商品
     * @param goodsId  参数是商品id
     * @return 返回值是具体的商品
     */
    public Goods loadGoodsById(int goodsId);
}
