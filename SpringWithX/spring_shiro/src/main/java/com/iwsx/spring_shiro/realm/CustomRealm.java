package com.iwsx.spring_shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.ArrayList;
import java.util.List;

public class CustomRealm extends AuthorizingRealm{

  @Override
  public void setName(String name) {
    super.setName("CustomRealm");
  }

  //用于认证
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
          throws AuthenticationException {

    //1.从token中取出身份信息
    String userName = (String) authenticationToken.getPrincipal();
    //2.根据用户输入的userName从数据库查询，
    // ...模拟从数据库查询密码
    String password = "111111";

    //如果查询不到返回null
    if(!userName.equals("zhangsansan")){
      return null;
    }

    //如果查询到，返回认证信息
    SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userName, password, this.getName());

    return authenticationInfo;
  }

  //用于授权
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

    //1.从principalCollection中取出身份信息
    String principal = (String) principalCollection.getPrimaryPrincipal();

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
