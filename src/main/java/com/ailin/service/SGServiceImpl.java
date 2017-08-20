package com.ailin.service;

import com.ailin.dao.ShopGoodsRelationDao;
import com.ailin.model.ShopGoodsRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 达达 on 2017/8/13.
 */
@Service("SGServiceImpl")
public class SGServiceImpl implements SGService {
 @Autowired
 private ShopGoodsRelationDao SGDao;
    public List<ShopGoodsRelation> goodsSelect(Integer shopId) {
        return SGDao.selectByPrimaryKeyWithShopAndGoods(shopId);
    }

    public ShopGoodsRelation shopSelect(Integer goodsId){
        return  SGDao.selectByPrimaryKeyWithShop(goodsId);
    }

    public int goodsShelve(ShopGoodsRelation record) {
        return SGDao.updateByPrimaryKey(record);
    }

    public int createSG(ShopGoodsRelation record) {
        return SGDao.insertSelective(record);
    }
}
