package com.iwsx.spring_shiro.Test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class TestMain {

  @Test
  public void testShiro(){
    // 创建SecurityManager工厂，通过ini配置文件创建SecurityManager工厂
    IniSecurityManagerFactory managerFactory =
            new IniSecurityManagerFactory("classpath:config/shiro-config.ini");
    // 创建SecurityManager
    SecurityManager securityManager = managerFactory.createInstance();
    // 将SecurityManager设置到当前运行环境中
    SecurityUtils.setSecurityManager(securityManager);
    // 从SecurityUtils里创建一个subject【测试才这样使用】
    Subject subject = SecurityUtils.getSubject();
    //在认证提交前准备token（令牌）
    UsernamePasswordToken passwordToken = new UsernamePasswordToken("zhangsan", "111111");

    try {
      //执行认证提交
      subject.login(passwordToken);
    } catch (AuthenticationException e) {
      e.printStackTrace();
    }

    //是否认证通过
    if(subject.isAuthenticated()){
      System.out.println("登录成功！");
    }
    else{
      System.out.println("登录失败！");
    }
  }

  @Test
  public void testCustomRealm(){
    // 创建SecurityManager工厂，通过ini配置文件创建SecurityManager工厂
    IniSecurityManagerFactory managerFactory =
            new IniSecurityManagerFactory("classpath:config/shiro-config.ini");
    // 创建SecurityManager
    SecurityManager securityManager = managerFactory.createInstance();
    // 将SecurityManager设置到当前运行环境中
    SecurityUtils.setSecurityManager(securityManager);
    // 从SecurityUtils里创建一个subject【测试才这样使用】
    Subject subject = SecurityUtils.getSubject();
    //在认证提交前准备token（令牌）
    UsernamePasswordToken passwordToken = new UsernamePasswordToken("zhangsansan", "111111");

    try {
      //执行认证提交
      subject.login(passwordToken);
    } catch (AuthenticationException e) {
      e.printStackTrace();
    }

    //是否认证通过
    if(subject.isAuthenticated()){
      System.out.println("登录成功！");


      boolean permitted = subject.isPermitted("user:create");
      if(permitted){
        System.out.println("拥有单个权限");
      }else {
        System.out.println("没有单个权限");
      }


      boolean permittedAll = subject.isPermittedAll("user:create", "user:query2");
      if(permittedAll){
        System.out.println("拥有所有权限");
      }else {
        System.out.println("没有所有权限");
      }

    }
    else{
      System.out.println("登录失败！");
    }
  }
}
