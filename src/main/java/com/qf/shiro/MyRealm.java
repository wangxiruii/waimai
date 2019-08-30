package com.qf.shiro;

import com.qf.pojo.Users;
import com.qf.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

/**
 * @Auther:
 * @Date: 2019/8/21 20:36
 * @Description:
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        Object principal = token.getPrincipal();
        String userName=(String) principal;
        if (!StringUtils.isEmpty(userName)){
            Users users=userService.findUserInfo(userName);
            System.out.println(users+"这是用户");
            SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(userName,users.getUserPwd(),getName());
            return authenticationInfo;
        }
        return null;
    }
}
