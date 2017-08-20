package com.ailin.service;

import com.ailin.model.info.OrderList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderListDaoService {

    public List<OrderList> selectAllOrder(Integer consumerId);

    public List<OrderList> receivingOrder(Integer consumerId);

    public List<OrderList> commentOrder(Integer consumerId);

    public List<OrderList> paymentOrder(Integer consumerId);
}
