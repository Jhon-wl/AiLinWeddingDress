package com.ailin.controller;

import com.ailin.model.Consumer;
import com.ailin.model.User;
import com.ailin.service.ConsumerService;
import com.ailin.util.MD5Util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private ConsumerService consumerService;
 /**
  *@Author SmileZhai
  *@Date 2017/8/4 10:05
  *@Description 登录页面
  */
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/home")
    public String enter(){
        return "home";
    }
/**
 *@Author SmileZhai
 *@Date 2017/8/4 10:06
 *@Description 校验登录
 */
    @RequestMapping("/logincheck")
    @ResponseBody
    public String checkLogin(HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String username = request.getParameter("username");
        String pwd=request.getParameter("password");
//        System.out.println(username+"  "+pwd);
        UsernamePasswordToken token = new UsernamePasswordToken(username, pwd);
        token.setRememberMe(true);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            SecurityUtils.getSubject().getSession().setTimeout(1800000);
        } catch (Exception e) {
            return "login_fail";
        }
        return "login_succ";
            //查数据库 如果查到数据  调用MD5加密对比密码
//        Consumer consumer = consumerService.findConsumerService(username);

//        System.out.println(consumer+"  bbb");
//        System.out.println(consumer.getPassword()+"  "+ pwd);
//        if (consumer!=null&&(pwd.equals(consumer.getPassword()))){
//            System.out.println(consumer);
//            request.getSession().setAttribute("consumer",consumer);
//            return "login_succ";
//        }else {
//            return  "login_fail";
//        }
//        if(user!=null){
//            if(MD5Utils.checkPassword(pwd,user.getPassword())){
//                //校验成功  设置session
//                request.getSession().setAttribute("userinfo",user);
//                return "login_succ";
//            }else{
//                // 校验失败  返回校验失败signal
//                return "login_fail";
//            }
//        }else {
//            // 校验失败  返回校验失败signal
//            return "login_fail";
//        }

    }

    @RequestMapping("/do")
//    测试前台传json，后台通过注解接收
    public String register(@RequestBody User user) {
        System.out.println(user.getUsername());
        return "home";
    }
}
