package com.ailin.service;


import com.ailin.model.TbShopGoodsRelation;

import java.util.List;

public interface TbShopGoodsRelationService {
    List<TbShopGoodsRelation> selectByShop(String name);

    List<TbShopGoodsRelation> selectByGoods(String name);

    List<TbShopGoodsRelation> selectAll();
}
