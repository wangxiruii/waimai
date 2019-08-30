package com.qf.mapper;

import com.qf.pojo.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {
    //前台
    /**
     * 查询所有的店铺
     * @return  返回值是店铺的集合
     **/
    public List<Shop> loadShopAll();

    /**
     * 根据商家id 来获取商家信息
     * @param shopId  参数是点击获得的商家id
     * @return  返回的是这个商家
     */
   public Shop getShopById(int shopId);
}
