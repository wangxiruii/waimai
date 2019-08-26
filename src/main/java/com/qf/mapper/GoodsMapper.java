package com.qf.mapper;

import com.qf.pojo.Goods;

import java.util.List;

/**
 * @Auther:
 * @Date: 2019/8/26 20:37
 * @Description:
 */
public interface GoodsMapper {
    /*
    private int goodsId;
    private String goodsName;
    private double price;
    private String sale;
    private String typles;
    private String info;
    * */
    //查询所有的物品
    public List<Goods> loadAllGoods();
    //根据id查询单个物品
    public Goods loadByGoods(int goodsId);
    //增加物品
    public int saveGoods(Goods goods);
    //删除物品
    public int deleteGoods(List<Integer> ids);
    //修改物品
    public int updateGoods(int goodsId);
    //模糊查询
    public List<Goods> loadName(String goodsName);
    //查询行数
    public int getTotalCount();

}
