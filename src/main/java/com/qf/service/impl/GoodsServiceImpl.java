package com.qf.service.impl;

import com.qf.mapper.GoodsMapper;
import com.qf.pojo.Goods;
import com.qf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/22 21:40
 * @Description:
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    //前台

    /**
     * 调用dao层loadGoodsAll的方法实现搜索所有的商品
     * @return  所有的商品
     */
    @Override
    public List<Goods> loadGoodsAll() {
        return goodsMapper.loadGoodsAll();
    }

    /**
     * 调用dao层selectGoods方法  实现模糊查询
     * @param aa 参数类型string
     * @return  返回搜索出的商品
     */
    @Override
    public List<Goods> selectGoods(String aa) {
        return goodsMapper.selectGoods(aa);
    }


    /**
     * 根据分类查询商品
     * @param bb  参数类型是商品的类型
     * @return    返回的是商品的集合list
     */
    @Override
    public List<Goods> loadStapleFood(String bb) {
        return goodsMapper.loadStapleFood(bb);
    }

    /**
     * 根据分类查询商品
     * @param cc  参数类型是商品的类型
     * @return    返回的是商品的集合list
     */
    @Override
    public List<Goods> loadStapleFood2(String cc) {
        return goodsMapper.loadStapleFood(cc);
    }

    /**
     * 根据分类查询商品
     * @param dd  参数类型是商品的类型
     * @return    返回的是商品的集合list
     */
    @Override
    public List<Goods> loadStapleFood3(String dd) {
        return goodsMapper.loadStapleFood(dd);
    }

    /**
     * 根据商品id查询具体的商品信息
     * @param goodsId  参数是商品id
     * @return  返回值是具体的商品信息
     */
    @Override
    public Goods loadGoodsById(int goodsId) {
        return goodsMapper.loadGoodsById(goodsId);
    }
}
