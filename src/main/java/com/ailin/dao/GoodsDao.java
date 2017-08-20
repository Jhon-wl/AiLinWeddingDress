package com.ailin.dao;

import com.ailin.model.Goods;
import com.ailin.model.GoodsImage;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface GoodsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    
    Goods selectById(Integer id);
    
    int updateById(Goods record);
    
    int createGood(Goods record);

    List<Goods> selectAll();

    List<GoodsImage> selectByPrimaryKeyWithGoodsImage(Integer goodsId);

    Goods selectMaxPrimaryKey();
}