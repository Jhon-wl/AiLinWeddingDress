package com.ailin.service;

import com.ailin.dao.TbShopGoodsRelationDao;
import com.ailin.model.TbShopGoodsRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbShopGoodsRelationServiceImpl implements TbShopGoodsRelationService {
    @Autowired
    private TbShopGoodsRelationDao shopGoodsRelationDao;
    public List<TbShopGoodsRelation> selectByShop(String name) {
        return shopGoodsRelationDao.selectByShopName(name);
    }

    public List<TbShopGoodsRelation> selectByGoods(String name) {
        return shopGoodsRelationDao.selectByGoodsName(name);
    }

    public List<TbShopGoodsRelation> selectAll() {
        return shopGoodsRelationDao.selectAllGoods();
    }
}
