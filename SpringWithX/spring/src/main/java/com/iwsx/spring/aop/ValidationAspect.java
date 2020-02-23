package com.iwsx.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class ValidationAspect {

  @Before("com.iwsx.spring.aop.MathAspect.declareJointPointExpression()")
  public void beforeMethod(JoinPoint joinPoint){
    Object[] args = joinPoint.getArgs();
    System.out.println("----> 验证参数");
  }
}
