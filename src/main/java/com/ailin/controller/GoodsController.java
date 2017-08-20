package com.ailin.controller;

import javax.servlet.http.HttpServletRequest;

import com.ailin.model.Goods;
import com.ailin.model.ShopGoodsRelation;
import com.ailin.service.GoodsService;
import com.ailin.service.SGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("adminGoods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private SGService sgService;
    @RequestMapping("selectGood")
    public String select(Integer id,Integer shopId,HttpServletRequest request){
        Goods good = goodsService.selectGood(id);
        request.setAttribute("good", good);
        request.setAttribute("shopId",shopId);
        return "goodUpdate";

    }
    @RequestMapping("/updateGood")
    public String update(Goods good,Integer shopId,HttpServletRequest request,RedirectAttributes attributes){
            good.setLastUpdate(new Date());
        int num = goodsService.updateById(good);
//        Integer goodsId=good.getId();
//        ShopGoodsRelation shopSelect= sgService.shopSelect(goodsId);
//        Integer shopId = shopSelect.getShop().getId();

        attributes.addAttribute("shopId",shopId);
//        System.out.println(num);
        if(num>0){
            return "redirect:/shopGoods/goods";
        }
        return "error";
    }
    @RequestMapping("/createGood")
    public String createGood(Goods good){
        good.setCreateTime(new Date());
        good.setLastUpdate(new Date());
        good.setVisibility((byte)0);
        good.setIsPutaway((byte)0);
        good.setPutawayTime(new Date());
        int num = goodsService.createGood(good);
        if(num>0){
            return "createGood";
        }
        return "error";
    }
    @RequestMapping("selectAllGoods")
    public  String selectAllGoods(Integer shopId,HttpServletRequest request){
        List<Goods> addGoods= goodsService.selectAllGoods();
        request.setAttribute("addGoods",addGoods);
        request.setAttribute("shopId",shopId);
        return "addGoods";
    }

}
