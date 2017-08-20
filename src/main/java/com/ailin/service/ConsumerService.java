package com.ailin.service;


import com.ailin.model.Consumer;

public interface ConsumerService {
    //注册新用户
    public int createConsumer(Consumer consumer);
    //用户登录，根据用户名查找用户密码
    public Consumer findConsumerService(String userName);
}
