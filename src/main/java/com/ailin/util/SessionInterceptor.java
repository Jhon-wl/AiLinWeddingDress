package com.ailin.util;

import com.ailin.model.Consumer;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by HanHan on 2017/8/6.
 */
public class SessionInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String url = request.getRequestURI();
        if(url.indexOf("login")>=0){
            return true;
        }
        HttpSession session= request.getSession();
        Consumer consumer = (Consumer) session.getAttribute("consumer");
            if(consumer!=null){
                return true;
            }else {
            request.getRequestDispatcher("/user/login").forward(request,response);
            }
            return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
