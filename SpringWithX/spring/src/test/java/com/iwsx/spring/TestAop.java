package com.iwsx.spring;

import com.iwsx.spring.aop.IMath;
import com.iwsx.spring.aop.MathProxy;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

  ApplicationContext context;

  @Before
  public void before(){
    context = new ClassPathXmlApplicationContext("classpath:springConfig.xml");
  }


  @Test
  public void test01()
  {
    IMath math=new MathProxy();
    int n1=100,n2=5;
    math.add(n1, n2);
    math.sub(n1, n2);
    math.mut(n1, n2);
    math.div(n1, n2);
  }

  @Test
  public void test02()
  {
    IMath bean = context.getBean(IMath.class);
    bean.add(1, 3);

    //bean.div(1, 0);

  }


}
