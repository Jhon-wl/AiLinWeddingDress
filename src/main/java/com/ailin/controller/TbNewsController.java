package com.ailin.controller;

import com.ailin.model.TbNews;
import com.ailin.service.TbNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
//首页新闻资讯
@Controller
@RequestMapping("news")
public class TbNewsController {
    @Autowired
    private TbNewsService newsService;
    @RequestMapping("selectAllNews")
    public String selectAll(HttpServletRequest req) {
        //System.out.println("   nnnnnnnnnnnnnnnn");
        List<TbNews> list = newsService.selectAll();
        if (list != null && list.size() > 0) {
            req.setAttribute("list", list);
//            for(TbNews news:list){
//                System.out.println(news);
//            }
            return "success";
        }
        return "error";
    }
}
