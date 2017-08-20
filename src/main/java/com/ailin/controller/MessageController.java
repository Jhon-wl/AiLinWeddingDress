package com.ailin.controller;

import com.ailin.model.Consumer;
import com.ailin.model.Message;
import com.ailin.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by HanHan on 2017/8/7.
 */
@Controller
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageService messageService;
    @RequestMapping("/get")
    public String sendMessage(Message message,ModelMap model, HttpServletRequest request){
        Consumer consumer = (Consumer) request.getSession().getAttribute("consumer");
        System.out.println(consumer);
        message = messageService.getMessage(consumer.getId());
        model.addAttribute("message",message);
        System.out.println(message);
        return "showmessage";
    }
}
