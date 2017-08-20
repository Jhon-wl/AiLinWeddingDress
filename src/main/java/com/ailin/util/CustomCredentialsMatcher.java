package com.ailin.util;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * Created by HanHan on 2017/8/12.
 */
/**
 *@Author SmileZhai
 *@Date 2017/8/12 16:50
 *@Description  自定义用户密码验证
 */
public class CustomCredentialsMatcher extends SimpleCredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        return true;
    }
}
