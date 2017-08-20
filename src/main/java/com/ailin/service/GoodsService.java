package com.ailin.service;

import com.ailin.model.Goods;
import com.ailin.model.GoodsImage;

import java.util.List;

/**
 * Created by 达达 on 2017/8/13.
 */
public interface GoodsService {
    int updateById(Goods record);

    int createGood(Goods record);

    Goods selectGood(Integer id);

    List<Goods> selectAllGoods();

    List<GoodsImage> selectGoodsImage(Integer goodsId);

    Goods selectMaxPrimaryKey();
}
