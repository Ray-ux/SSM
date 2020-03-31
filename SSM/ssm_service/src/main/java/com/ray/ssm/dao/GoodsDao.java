package com.ray.ssm.dao;

import com.ray.ssm.entity.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GoodsDao {
    void insert(Goods goods);

    void update(Goods goods);

    void delete(int id);

    Goods selectById(int id);

    List<Goods> selectAll();
}
