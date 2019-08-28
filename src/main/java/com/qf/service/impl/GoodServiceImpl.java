package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.qf.mapper.GoodsMapper;
import com.qf.pojo.Goods;
import com.qf.service.GoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 王玺瑞
 * @Date: 2019/8/22 21:40
 * @Description:
 */
@Service
public class GoodServiceImpl implements GoodService {
    @Resource
    GoodsMapper goodsMapper;
    @Override
    public List<Goods> loadAllGoods(int page, int rows) {
        PageHelper.startPage(page,rows);
        return goodsMapper.loadAllGoods();
    }

    @Override
    public Goods loadByGoods(int goodsId) {
        return goodsMapper.loadByGoods(goodsId);
    }

    @Override
    public int saveGoods(Goods goods) {
        return goodsMapper.saveGoods(goods);
    }

    @Override
    public int deleteGoods(List<Integer> ids) {
        return 0;
    }

    @Override
    public int updateGoods(int goodsId) {
        return 0;
    }

    @Override
    public List<Goods> loadName(String goodsName) {
        return null;
    }

    @Override
    public int caleMaxPage(int rows) {
        return 0;
    }
}
