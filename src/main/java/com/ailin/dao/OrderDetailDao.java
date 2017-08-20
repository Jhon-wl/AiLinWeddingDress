package com.ailin.dao;

import com.ailin.model.info.OrderDetail;
import com.ailin.model.info.OrderGoodsList;
import com.ailin.model.info.TransferDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailDao {
    /**
     * 查询该订单的订单信息
     */
    OrderDetail selectOrderDetail(Integer orderId);

    /**
     * 查询该订单的所有商品信息
     */
    List<OrderGoodsList> orderGoodsList(Integer orderId);

    /**
     * 查询物流的所有信息
     */
    TransferDetail selectTransferDetail(Integer orderId);
}
