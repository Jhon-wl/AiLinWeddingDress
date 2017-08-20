package com.ailin.service;

import com.ailin.dao.OrderListDao;
import com.ailin.model.info.OrderList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderListDaoServiceImpl implements OrderListDaoService{

    @Resource
    private OrderListDao orderListDao;

    public List<OrderList> selectAllOrder(Integer consumerId) {
        List<OrderList> selectAllOrderList= orderListDao.selectAllOrder(consumerId);
        if(selectAllOrderList==null){
            System.out.println("您目前还没有订单");
        }
        return selectAllOrderList;
    }

    public List<OrderList> receivingOrder(Integer consumerId) {
        List<OrderList> receivingOrderList= orderListDao.receivingOrder(consumerId);
        if(receivingOrderList==null){
            System.out.println("您目前还没有相关的订单");
        }
        return receivingOrderList;
    }

    public List<OrderList> commentOrder(Integer consumerId) {
        List<OrderList> commentOrderList=orderListDao.commentOrder(consumerId);
        if(commentOrderList==null){
            System.out.println("您目前还没有相关的订单");
        }
        return commentOrderList;
    }

    public List<OrderList> paymentOrder(Integer consumerId) {
        List<OrderList> paymentOrderList=orderListDao.paymentOrder(consumerId);
        if(paymentOrderList==null){
            System.out.println("您目前还没有相关的订单");
        }
        return paymentOrderList;
    }
}
