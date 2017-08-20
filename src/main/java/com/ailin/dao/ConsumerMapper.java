package com.ailin.dao;

import com.ailin.model.Consumer;

public interface ConsumerMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Consumer record);

 
    int insertSelective(Consumer record);

 
    Consumer selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Consumer record);


    int updateByPrimaryKey(Consumer record);

    Consumer selectByConsumerNameSelective(String userName);
}