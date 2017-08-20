package com.ailin.controller;

import com.ailin.model.info.OrderDetail;
import com.ailin.model.info.OrderGoodsList;
import com.ailin.model.info.TransferDetail;
import com.ailin.service.OrderDetailDaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/oneOrder")
public class OrderDetailController {
    @Resource
    private OrderDetailDaoService orderDetailDaoService;

    @ResponseBody
    @RequestMapping("/orderDetail")
    public String orderDetail(@RequestBody Integer orderId, Model model) {
        List<OrderGoodsList> orderGoodsList=orderDetailDaoService.orderGoodsList(orderId);
        OrderDetail orderDetail=orderDetailDaoService.selectOrderDetail(orderId);
        model.addAttribute("orderGoodsList",orderGoodsList);
        model.addAttribute("orderDetail",orderDetail);
        return "orderDetail";
    }

    @RequestMapping("/transferDetail")
    @ResponseBody
    public String transferDetail(@RequestBody Integer orderId, Model model) {
        TransferDetail transferDetail=orderDetailDaoService.selectTransferDetail(orderId);
        return "transferDetail";
    }

}