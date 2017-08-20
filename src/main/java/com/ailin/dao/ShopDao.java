package com.ailin.dao;

import java.util.List;

import com.ailin.model.Shop;

public interface ShopDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
    
    List<Shop> selectByManagerid(Shop managerId);
}