package com.iwsx.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

import java.util.Arrays;

// 把这个类声明为一个切面：需要把该类放入到IOC容器中，再声明为一个切面
//@Component
//@Aspect
public class MathAspect2 {


  /*
  * 环绕通知需要携带ProceedingJoinPoint 类型的参数
  * 环绕通知类似于动态代理的全过程：ProceedingJoinPoint 类型的参数可以决定是否执行目标方法
  * 且环绕通知必须有返回值，返回值即为目标方法的返回值
  * */
  @Around("execution(* com.iwsx.spring.aop.*.*(..))")
  public Object aroundMethod(ProceedingJoinPoint pjd){
    Object result = null;
    String methodName = pjd.getSignature().getName();
    Object[] args = pjd.getArgs();

    try {
      System.out.println("The method " + methodName + " begins with " + Arrays.asList(args));
      result = pjd.proceed();
      System.out.println("The method " + methodName + " ends with " + result);
    }catch (Throwable e){
      //e.printStackTrace();
      System.out.println("The method " + methodName + " occurs with: " + e.getMessage());
    }

    System.out.println("The method " + methodName + " ends");

    return result;
  }
}
