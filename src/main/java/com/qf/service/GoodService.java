package com.qf.service;

import com.qf.pojo.Goods;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/22 21:39
 * @Description:
 */
public interface GoodService {
    //查询所有商品
    public List<Goods> loadAllGoods(int page,int rows);
    //根据id查询单个物品
    public Goods loadByGoods(int goodsId);
    //增加物品
    public int saveGoods(Goods goods);
    //删除物品
    public int deleteGoods(List<Integer> ids);
    //修改物品
    public int updateGoods(Goods goods);
    //模糊查询
    public List<Goods> loadName(String goodsName);
    //查询行数
    public int caleMaxPage(int rows);
}
