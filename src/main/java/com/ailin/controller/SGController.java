package com.ailin.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ailin.model.ShopGoodsRelation;
import com.ailin.service.GoodsService;
import com.ailin.service.SGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("shopGoods")
public class SGController {
	@Autowired
private SGService sgService;
	@Autowired
	private GoodsService goodsService;
	@RequestMapping("goods")
	public String sclectGoods(Integer shopId, HttpServletRequest request){
		List goodList = sgService.goodsSelect(shopId);
		request.setAttribute("goodList",goodList);
		return "admingoods";
	}
	@RequestMapping("goodsShelve")
	public String goodsShelve(ShopGoodsRelation shopGoodsRelation,Integer shopId,RedirectAttributes attributes){
		Integer goodsId=shopGoodsRelation.getGoodsId();
		attributes.addAttribute("shopId",shopId);
		shopGoodsRelation.setShopId(shopId);
		byte visibility=1;
		shopGoodsRelation.setVisibility(visibility);
		int num=sgService.goodsShelve(shopGoodsRelation);
		if(num>0){
			return "redirect:/shopGoods/goods";
		}
		return  "1";
	}
	@RequestMapping("createSG")
	public String createSG(ShopGoodsRelation shopGoodsRelation,RedirectAttributes attributes){
		shopGoodsRelation.setVisibility((byte)0);
		shopGoodsRelation.setCreateTime(new Date());
		shopGoodsRelation.setLastUpdate(new Date());
		shopGoodsRelation.setQuantity(999);
		shopGoodsRelation.setSaleCount(25);
		Integer shopId=shopGoodsRelation.getShopId();
		attributes.addAttribute("shopId",shopId);
		int num = sgService.createSG(shopGoodsRelation);
		if(num>0){
			return "redirect:/shopGoods/goods";
		}
		return  "1";

	}
}
