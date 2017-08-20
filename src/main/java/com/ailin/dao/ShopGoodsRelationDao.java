package com.ailin.dao;

import java.util.List;

import com.ailin.model.Goods;
import com.ailin.model.ShopGoodsRelation;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface ShopGoodsRelationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopGoodsRelation record);

    int insertSelective(ShopGoodsRelation record);

    ShopGoodsRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopGoodsRelation record);

    int updateByPrimaryKey(ShopGoodsRelation record);
   
    List<ShopGoodsRelation> selectByPrimaryKeyWithShopAndGoods(Integer shopId);

    ShopGoodsRelation selectByPrimaryKeyWithShop(Integer goodsId);
    
}