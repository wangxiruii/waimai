package com.qf.service.impl;

import com.qf.mapper.ShopMapper;
import com.qf.pojo.Shop;
import com.qf.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Resource
    private ShopMapper shopMapper;

    /**
     * 调用dao层定义方法查询所有的商家
     * @return  返回的是商家的集合list
     */
    @Override
    public List<Shop> loadShopAll() {
        return shopMapper.loadShopAll();
    }


    /**
     * 调用dao层的方法  查询商家
     * @param shopId  参数是点击获得的商家id
     * @return   返回值是这个商家
     */
    @Override
    public Shop getShopById(int shopId) {
        return shopMapper.getShopById(shopId);
    }
}
