package com.iwsx.spring_ssm.controller;

import com.iwsx.spring_ssm.entity.User;
import com.iwsx.spring_ssm.service.impl.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("user")
@Controller
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping("queryuserbyid")
  public String QueryUserById(@RequestParam("id") int id, ModelMap modelMap)
  {
    User user = userService.QueryUserById(id);
    modelMap.addAttribute("user", user);
    return "user";
  }

  @RequestMapping("login")
  public String Login(@RequestParam("username") String username, @RequestParam("password") String password){
    Subject subject = SecurityUtils.getSubject();
    UsernamePasswordToken token = new UsernamePasswordToken(username, password);
    token.setRememberMe(true);
    try {
      subject.login(token);
    } catch (AuthenticationException e) {
      System.out.println("登录失败");
    }
    return "success";
  }
}
