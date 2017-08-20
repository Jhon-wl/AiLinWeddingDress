package com.ailin.dao;


import com.ailin.model.TbShopGoodsRelation;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@MapperScan
public interface TbShopGoodsRelationDao {
    List<TbShopGoodsRelation> selectByShopName(String name);

    List<TbShopGoodsRelation> selectByGoodsName(String name);

    List<TbShopGoodsRelation> selectAllGoods();
}
