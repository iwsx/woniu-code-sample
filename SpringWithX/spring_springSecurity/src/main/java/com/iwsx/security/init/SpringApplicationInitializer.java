package com.iwsx.security.init;

import com.iwsx.security.config.ApplicationConfig;
import com.iwsx.security.config.WebConfig;
import com.iwsx.security.config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
* Spring容器初始化类，加载WebApplicationInitializer接口的所有实现类
* */
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

  //spring容器，相当于加载 applicationContext.xml
  protected Class<?>[] getRootConfigClasses() {
    return new Class[]{ApplicationConfig.class, WebSecurityConfig.class};
  }

  //servletContext，相当于加载springmvc.xml
  protected Class<?>[] getServletConfigClasses() {
    return new Class[]{WebConfig.class};
  }

  //url-mapping
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }
}
