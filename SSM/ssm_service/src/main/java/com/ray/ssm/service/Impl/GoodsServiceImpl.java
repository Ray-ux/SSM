package com.ray.ssm.service.Impl;

import com.ray.ssm.dao.GoodsDao;
import com.ray.ssm.entity.Goods;
import com.ray.ssm.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service("goodsServiceImpl")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;
    public void add(Goods goods) {
        goods.setUpdateTime(new Date(System.currentTimeMillis()));
        goodsDao.insert(goods);
    }

    public void edit(Goods goods) {
        goods.setUpdateTime(new Date(System.currentTimeMillis()));
        goodsDao.update(goods);
    }

    public void remove(int id) {
        goodsDao.delete(id);
    }

    public Goods get(int id) {
        return goodsDao.selectById(id);
    }

    public List<Goods> getAll() {
        return goodsDao.selectAll();
    }
}
