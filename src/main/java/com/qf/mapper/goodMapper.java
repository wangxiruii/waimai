package com.qf.mapper;

import com.qf.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/22 21:38
 * @Description:
 */
@Mapper
public interface goodMapper {
    /**
     * @return 返回值为商品的一个总集合
     * 查询所有商品向展示页传达数据
     */
    public List<Goods> findAll();

    /**
     * @return 返回一个对应类型的一个总集
     * 在用户按照商品类型浏览时展示数据
     */
    public List<Goods> findAllByLeiBie(String goodsName);
    public Goods loadById(int goodId);
}
