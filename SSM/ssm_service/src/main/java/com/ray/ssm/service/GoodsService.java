package com.ray.ssm.service;

import com.ray.ssm.entity.Goods;

import java.util.List;

public interface GoodsService {
    void add(Goods goods);

    void edit(Goods goods);

    void remove(int id);

    Goods get(int id);

    List<Goods> getAll();
}
