package com.qf.mapper;

import com.qf.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther:
 * @Date: 2019/8/26 20:37
 * @Description:
 */
@Mapper
public interface GoodsMapper {
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


    //前台

    /**
     * 查询数据库所有的商品
     * @return  返回值是商品的list
     */
    public List<Goods> loadGoodsAll();

    /**
     * 模糊搜索
     * @param aa 参数类型string
     * @return  返回的是模糊搜索的商品list
     */
    public List<Goods> selectGoods(@Param("aa") String aa);

    /**
     * 根据分类查询商品
     * @param bb  参数类型是商品的类型
     * @return    返回的是商品的集合list
     */
    public List<Goods> loadStapleFood(@Param("bb") String bb);


    /**
     * 根据分类查询商品
     * @param cc  参数类型是商品的类型
     * @return    返回的是商品的集合list
     */
    public List<Goods> loadStapleFood2(@Param("cc") String cc);


    /**
     * 根据分类查询商品
     * @param dd  参数类型是商品的类型
     * @return    返回的是商品的集合list
     */
    public List<Goods> loadStapleFood3(@Param("dd") String dd);


    /**
     * 根据物品id查询商品
     * @param goodsId  参数是商品id
     * @return 返回值是具体的商品
     */
    public Goods loadGoodsById(int goodsId);
}
