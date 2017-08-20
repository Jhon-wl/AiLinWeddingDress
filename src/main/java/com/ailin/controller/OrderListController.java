package com.ailin.controller;


import com.ailin.model.info.OrderList;
import com.ailin.service.OrderListDaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/orderList")
public class OrderListController {
    @Resource
    private OrderListDaoService orderListDaoService;
    @ResponseBody
    @RequestMapping("/selectAllOrder")
    public String selectAllOrder(@RequestBody Integer consumerId,Model model){
        List<OrderList> selectAllOrderList = orderListDaoService.selectAllOrder(consumerId);
        model.addAttribute("selectAllOrderList",selectAllOrderList);
        return "OrderList";
    }

    @ResponseBody
    @RequestMapping("/receivingOrder")
    public String receivingOrder(@RequestBody Integer consumerId,Model model){
        List<OrderList> receivingOrderList = orderListDaoService.receivingOrder(consumerId);
        model.addAttribute("receivingOrderList",receivingOrderList);
        return "OrderList";
    }

    @ResponseBody
    @RequestMapping("/commentOrder")
    public String commentOrder(@RequestBody Integer consumerId,Model model){
        List<OrderList> commentOrderList = orderListDaoService.commentOrder(consumerId);
        model.addAttribute("commentOrderList",commentOrderList);
        return "OrderList";
    }

    @ResponseBody
    @RequestMapping("/paymentOrder")
    public String paymentOrder(@RequestBody Integer consumerId,Model model){
        List<OrderList> paymentOrderList = orderListDaoService.paymentOrder(consumerId);
        model.addAttribute("paymentOrderList",paymentOrderList);
        return "OrderList";
    }
}
