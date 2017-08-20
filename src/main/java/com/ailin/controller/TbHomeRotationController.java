package com.ailin.controller;


import com.ailin.model.TbHomeRotation;
import com.ailin.service.TbHomeRotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
@RequestMapping("homeRotation")
public class TbHomeRotationController {
    @Autowired
    private TbHomeRotationService homeRotationService;
    //Ê×Ò³ÂÖ²¥Í¼
    @RequestMapping("selectAll")
    public String selectAll(HttpServletRequest req) {
        // System.out.println(" nnnnnnn");
        List<TbHomeRotation> list = homeRotationService.selectAllHomeRotation();
        if (list != null && list.size() > 0) {
            req.setAttribute("list", list);
            /*for (TbHomeRotation tbHomeRotation : list) {
                System.out.println(tbHomeRotation);
            }*/
            return "success";
        }
        return "error";
    }
}
