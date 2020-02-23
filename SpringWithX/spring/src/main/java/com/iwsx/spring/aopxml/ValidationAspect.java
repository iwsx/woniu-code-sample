package com.iwsx.spring.aopxml;

import org.aspectj.lang.JoinPoint;

public class ValidationAspect {

  public void beforeMethod(JoinPoint joinPoint){
    Object[] args = joinPoint.getArgs();
    System.out.println("----> 验证参数");
  }
}
