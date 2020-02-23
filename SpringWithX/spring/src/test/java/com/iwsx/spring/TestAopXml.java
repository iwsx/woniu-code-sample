package com.iwsx.spring;

import com.iwsx.spring.aopxml.IMath;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopXml {

  ApplicationContext context;

  @Before
  public void before(){
    context = new ClassPathXmlApplicationContext("classpath:springConfig-aopXml.xml");
  }


  @Test
  public void test02()
  {
    IMath bean = context.getBean(IMath.class);
    bean.add(1, 3);

    //bean.div(1, 0);

  }
}
