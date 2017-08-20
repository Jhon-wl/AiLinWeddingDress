package com.ailin.controller;

import com.ailin.model.TbShopGoodsRelation;
import com.ailin.service.TbShopGoodsRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("shopGoodsRelation")
public class TbShopGoodsRelationController {
    @Autowired
    private TbShopGoodsRelationService shopGoodsRelationService;
    //店铺查询
    @RequestMapping("selectByShopName")
    public String selectByShopName(HttpServletRequest req){
        String name=req.getParameter("name");
        List<TbShopGoodsRelation> shopList = shopGoodsRelationService.selectByShop(name);
        if (shopList!=null&&shopList.size()>0){
            req.setAttribute("shopList",shopList);
           /* for(TbShopGoodsRelation shop:shopList){
                System.out.println(shop);
            }*/
            return "success";
        }
        return "error";
    }
    //商品查询
    @RequestMapping("selectByGoodsName")
    public String selectByGoodsName(HttpServletRequest req){
        //System.out.println("   ggggggggggg");
        String name=req.getParameter("name");
        List<TbShopGoodsRelation> goodsList = shopGoodsRelationService.selectByGoods(name);
        if (goodsList!=null&&goodsList.size()>0){
            req.setAttribute("goodsList",goodsList);
//            for(TbShopGoodsRelation goods:goodsList){
//                System.out.println(goods);
//            }
            return "success";
        }
        return "error";
    }

    //首页无限加载
    @RequestMapping("selectAllGoods")
    public String selectAllGoods(HttpServletRequest req){
        System.out.println("   tttttttttt");
        List<TbShopGoodsRelation> goodsList = shopGoodsRelationService.selectAll();
        if (goodsList!=null&&goodsList.size()>0){
            req.setAttribute("goodsList",goodsList);
            for(TbShopGoodsRelation goods:goodsList){
                System.out.println(goods);
            }
            return "success";
        }
        return "error";
    }
}
