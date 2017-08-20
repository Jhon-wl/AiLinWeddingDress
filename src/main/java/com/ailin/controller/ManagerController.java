package com.ailin.controller;

import com.ailin.model.Manager;
import com.ailin.model.Shop;
import com.ailin.service.ManagerService;
import org.apache.velocity.runtime.directive.Foreach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 达达 on 2017/8/6.
 */
@Controller
@RequestMapping("manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;
    @RequestMapping("login")
    public String login(Manager manager, HttpServletRequest request){
        Manager existManager = managerService.managerlogin(manager);
        Integer managerId=existManager.getId();
        List<Shop> shop = managerService.shopSelect(managerId);
//        System.out.println(shop);
        request.getSession().setAttribute("existManager",existManager.getUserName());
        request.setAttribute("shop",shop);
        if (existManager!=null){
            return "admin";
        }
        return "1";
    }
}
