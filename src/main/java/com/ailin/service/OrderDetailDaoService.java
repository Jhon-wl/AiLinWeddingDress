package com.ailin.service;


import com.ailin.model.info.OrderDetail;
import com.ailin.model.info.OrderGoodsList;
import com.ailin.model.info.TransferDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailDaoService {

    OrderDetail selectOrderDetail(Integer orderId);

    List<OrderGoodsList> orderGoodsList(Integer orderId);

    TransferDetail selectTransferDetail(Integer orderId);
}
