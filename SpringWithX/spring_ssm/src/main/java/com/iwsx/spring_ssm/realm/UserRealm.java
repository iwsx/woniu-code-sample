package com.iwsx.spring_ssm.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.ArrayList;
import java.util.List;

public class UserRealm extends AuthorizingRealm{

  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
    //1.从token中取出身份信息
    String userName = (String) token.getPrincipal();
    //2.根据用户输入的userName从数据库查询，
    // ...模拟从数据库查询密码
    String password = "111111";

    //盐


    //如果查询不到返回null
    if(!userName.equals("zhangsansan")){
      return null;
    }

    //如果查询到，返回认证信息
    SimpleAuthenticationInfo authenticationInfo
            = new SimpleAuthenticationInfo(userName, password, ByteSource.Util.bytes(""), this.getName());

    return authenticationInfo;
  }

  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    //1.从principalCollection中取出身份信息
    String principal = (String) principals.getPrimaryPrincipal();

    //2.根据获得的principal从数据库查询，
    // ...模拟从数据库查询权限资源
    List<String> permissions = new ArrayList<String>();
    permissions.add("user:create");
    permissions.add("user:query");

    SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
    info.addStringPermissions(permissions);

    return info;
  }


}
