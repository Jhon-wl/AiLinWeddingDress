package com.ailin.service;

import com.ailin.dao.GoodsDao;
import com.ailin.model.Goods;
import com.ailin.model.GoodsImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 达达 on 2017/8/13.
 */
@Service("GoodsServiceImpl")
public class GoodsServiceImpl implements  GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    public int updateById(Goods record) {
        return goodsDao.updateById(record);
    }

    public int createGood(Goods record) {
        return goodsDao.insertSelective(record);
    }

    public Goods selectGood(Integer id) {
        return goodsDao.selectById(id);
    }

    public List<Goods> selectAllGoods(){return goodsDao.selectAll();}

    public List<GoodsImage> selectGoodsImage(Integer goodsId) {
        return goodsDao.selectByPrimaryKeyWithGoodsImage(goodsId) ;
    }

    public Goods selectMaxPrimaryKey() {
        return goodsDao.selectMaxPrimaryKey();
    }
}
