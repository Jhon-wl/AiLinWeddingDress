package com.ailin.service;

import com.ailin.dao.ConsumerMapper;
import com.ailin.model.Consumer;
import com.ailin.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserServiceImpl")
public class CousumerServiceImpl implements ConsumerService {
    @Autowired
    private  ConsumerMapper consumerMapper;

    public int createConsumer(Consumer consumer) {
//        consumer.setPassword(MD5Util.getMd5(consumer.getPassword()));
        int num = consumerMapper.insertSelective(consumer);
        return num;
    }

    public Consumer findConsumerService(String userName) {
        Consumer consumer = consumerMapper.selectByConsumerNameSelective(userName);
        return consumer;
    }
}
