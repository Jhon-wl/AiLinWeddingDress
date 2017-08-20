package com.ailin.util;

import com.ailin.model.Consumer;
import com.ailin.service.ConsumerService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

/**
 * Created by HanHan on 2017/8/6.
 */
public class MyRealm extends AuthorizingRealm {
/**
 *@Author SmileZhai
 *@Date 2017/8/6 10:46
 *@Description 为当前用户登录之后的权限做处理
 */
@Resource
    ConsumerService consumerService;
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
/**
 *@Author SmileZhai
 *@Date 2017/8/6 10:46
 *@Description 验证登录
 */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();
        Consumer consumer = this.consumerService.findConsumerService(username);
        if(consumer!=null){
            SecurityUtils.getSubject().getSession().setAttribute("consumer",consumer);
            SimpleAuthenticationInfo simpleAuthenticationInfo =
                    new SimpleAuthenticationInfo(consumer.getUserName(),consumer.getPassword(),getName());
            return simpleAuthenticationInfo;
        }else {
            return  null;
        }
    }
}
