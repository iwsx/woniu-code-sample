package com.iwsx.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

// 把这个类声明为一个切面：需要把该类放入到IOC容器中，再声明为一个切面
@Component
@Aspect
@Order(2)
public class MathAspect {

  /*
  *   定义一个方法，用于声明切入点表达式。一般地，该方法中不需要添加其他代码。
  *   使用@Pointcut 来声明切入点表达式
  *   后面的其他通知直接使用方法名来引用当前的切入点表达式
  * */
  @Pointcut("execution(* com.iwsx.spring.aop.*.*(..))")
  public void declareJointPointExpression(){}

  //前置通知：在目标方法开始之前执行
  @Before("declareJointPointExpression()")
  public void beforeMethod(JoinPoint joinPoint){
    String methodName = joinPoint.getSignature().getName();
    List<Object> args = Arrays.asList(joinPoint.getArgs());
    System.out.println("The method " + methodName + " begins with " + args);
  }

  //后置通知：在目标方法执行后（无论是否发生异常），执行的通知
  //在后置通知中还不能访问目标方法执行的结果
  @After("declareJointPointExpression()")
  public void afterMethod(JoinPoint joinPoint){
    String methodName = joinPoint.getSignature().getName();
    List<Object> args = Arrays.asList(joinPoint.getArgs());
    System.out.println("The method " + methodName + " ends");
  }

  /*
  *
  * 返回通知：在方法正常结束后执行的代码，是可以访问到方法的返回值的
  * */
  @AfterReturning(value = "declareJointPointExpression()",
                returning = "result")
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
  @AfterThrowing(value = "declareJointPointExpression()",
          throwing = "ex")
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
  //@Around("execution(* com.iwsx.spring.aop.*.*(..))")
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
