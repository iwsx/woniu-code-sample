package com.iwsx.security.init;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringSecurityApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

  public SpringSecurityApplicationInitializer(){
    //如果当前环境没有使用Spring或者SpringMVC，则不能注释下面代码
    //super(WebSecurityConfig.class);
  }
}
