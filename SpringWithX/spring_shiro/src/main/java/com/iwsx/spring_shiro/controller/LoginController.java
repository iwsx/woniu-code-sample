package com.iwsx.spring_shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/login")
@Controller
public class LoginController {

  @RequestMapping("/hello")
  public String Hello(){
    return "hello";
  }
}
