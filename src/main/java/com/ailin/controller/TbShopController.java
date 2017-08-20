package com.ailin.controller;

import com.ailin.model.TbShop;
import com.ailin.service.TbShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("shop")
public class TbShopController {
    @Autowired
    private TbShopService shopService;
    //µÍ∆ÃºÚΩÈ
    @RequestMapping("selectWithManager")
    public String selectWithManager(HttpServletRequest req){
        //System.out.println("  mmmmmmmmmmm");
        List<TbShop> managerList=shopService.selectManager();
        if(managerList!=null&&managerList.size()>0){
            req.setAttribute("managerList",managerList);
//            for(TbShop managers:managerList){
//                System.out.println(managers);
//            }
            return "success";
        }
        return "error";
    }

}
