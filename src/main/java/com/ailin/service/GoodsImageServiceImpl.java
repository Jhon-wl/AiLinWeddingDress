package com.ailin.service;

import com.ailin.dao.GoodsImageDao;
import com.ailin.model.GoodsImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 达达 on 2017/8/17.
 */
@Service("GoodsImageServiceImpl")
public class GoodsImageServiceImpl implements GoodsImageService  {
    @Autowired
    private GoodsImageDao goodsImageDao;
    public int ImageUpload(GoodsImage record) {
        return goodsImageDao.insertSelective(record);
    }
}
