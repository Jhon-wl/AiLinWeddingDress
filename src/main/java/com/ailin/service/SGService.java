package com.ailin.service;

import com.ailin.model.ShopGoodsRelation;

import java.util.List;

/**
 * Created by 达达 on 2017/8/13.
 */
public interface SGService {

    List<ShopGoodsRelation> goodsSelect(Integer shopId);

    ShopGoodsRelation shopSelect(Integer goodsId);

    int goodsShelve (ShopGoodsRelation record);

    int createSG(ShopGoodsRelation record);
}
