package com.ailin.service;

import com.ailin.dao.OrderDetailDao;
import com.ailin.model.info.OrderDetail;
import com.ailin.model.info.OrderGoodsList;
import com.ailin.model.info.TransferDetail;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderDetailDaoServiceImpl implements OrderDetailDaoService{

    @Resource
    private OrderDetailDao orderDetailDao;

    public OrderDetail selectOrderDetail(Integer orderId) {
        OrderDetail orderDetail=orderDetailDao.selectOrderDetail(orderId);
        return orderDetail;
    }

    public List<OrderGoodsList> orderGoodsList(Integer orderId){
        List<OrderGoodsList> goodsList=orderDetailDao.orderGoodsList(orderId);
        return goodsList;
    }

    public TransferDetail selectTransferDetail(Integer orderId) {
        TransferDetail transferDetail=orderDetailDao.selectTransferDetail(orderId);
        return transferDetail;
    }
}
