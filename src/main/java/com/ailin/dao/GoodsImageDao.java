package com.ailin.dao;

import com.ailin.model.GoodsImage;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface GoodsImageDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsImage record);

    int insertSelective(GoodsImage record);

    GoodsImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsImage record);

    int updateByPrimaryKey(GoodsImage record);
}