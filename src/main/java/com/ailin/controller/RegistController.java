package com.ailin.controller;

import com.ailin.model.Consumer;
import com.ailin.service.ConsumerService;
import com.ailin.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Controller
@RequestMapping("/consumer")
public class RegistController
{
    @Autowired
    ConsumerService consumerService;
    /**
 *@Author SmileZhai
 *@Date 2017/8/4 10:07
 *@Description 注册页面
 */
@RequestMapping("/regist")
public String regist(){
    return "regist";
}

    @RequestMapping("/doregist")
    public String register(Consumer consumer, HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String password = MD5Util.getMd5(request.getParameter("password"));
        String gender = request.getParameter("gender");
//        System.out.println(gender);
        System.out.println(consumer);
        return "login";
    }

}
