package com.iwsx.spring.aopxml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;
import java.util.List;

// 把这个类声明为一个切面：需要把该类放入到IOC容器中，再声明为一个切面
public class LoggingAspect {

  //前置通知：在目标方法开始之前执行
  public void beforeMethod(JoinPoint joinPoint){
    String methodName = joinPoint.getSignature().getName();
    List<Object> args = Arrays.asList(joinPoint.getArgs());
    System.out.println("The method " + methodName + " begins with " + args);
  }

  //后置通知：在目标方法执行后（无论是否发生异常），执行的通知
  //在后置通知中还不能访问目标方法执行的结果
  public void afterMethod(JoinPoint joinPoint){
    String methodName = joinPoint.getSignature().getName();
    List<Object> args = Arrays.asList(joinPoint.getArgs());
    System.out.println("The method " + methodName + " ends");
  }

  /*
  *
  * 返回通知：在方法正常结束后执行的代码，是可以访问到方法的返回值的
  * */
  public void afterReturning(JoinPoint joinPoint, Object result){
    String methodName = joinPoint.getSignature().getName();
    List<Object> args = Arrays.asList(joinPoint.getArgs());
    System.out.println("The method " + methodName + " ends with " + result);
  }

  /*
  * 异常通知：
  * 在目标方法出现异常时会执行的代码
  * 可以访问到异常对象，且可以指定在出现特定异常时在执行通知代码
  * */
  public void afterThrowing(JoinPoint joinPoint, Exception ex){
    String methodName = joinPoint.getSignature().getName();
    List<Object> args = Arrays.asList(joinPoint.getArgs());
    System.out.println("The method " + methodName + " occurs with: " + ex);
  }

  /*
   * 环绕通知需要携带ProceedingJoinPoint 类型的参数
   * 环绕通知类似于动态代理的全过程：ProceedingJoinPoint 类型的参数可以决定是否执行目标方法
   * 且环绕通知必须有返回值，返回值即为目标方法的返回值
   * */
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
