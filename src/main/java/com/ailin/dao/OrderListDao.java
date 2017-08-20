package com.ailin.dao;


import com.ailin.model.info.OrderList;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderListDao {
    /**
     * 查询全部订单
     * 包括订单、商品、店铺的简单信息
     **/
    List<OrderList> selectAllOrder(Integer consumerId);
    /**
     * 根据订单状态查询-------待收货
     **/
    List<OrderList> receivingOrder(Integer consumerId);
    /**
     * 根据订单状态查询-------待评价
     **/
    List<OrderList> commentOrder(Integer consumerId);
    /**
     * 根据订单状态查询-------待付款
     **/
    List<OrderList> paymentOrder(Integer consumerId);
}


