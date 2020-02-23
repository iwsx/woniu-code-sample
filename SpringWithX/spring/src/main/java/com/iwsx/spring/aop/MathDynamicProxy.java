package com.iwsx.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class MathDynamicProxy {

  //要代理的对象
  private IMath target;

  public MathDynamicProxy(IMath mathImpl){
    this.target = mathImpl;
  }

  public IMath getLoggingProxy(){
    IMath proxy = null;

    //代理对象由哪一类加载器负责加载
    ClassLoader loader = target.getClass().getClassLoader();
    //代理对象的类型，即其中有哪些方法
    Class<?>[] interfaces = new Class[]{IMath.class};
    /*也可以用interfaces4，不能用interfaces2、interfaces3
    * */
    Class<?>[] interfaces2 = new Class[]{target.getClass()};
    Class<?>[] interfaces3 = IMath.class.getInterfaces();
    Class<?>[] interfaces4 = target.getClass().getInterfaces();

    //当调用代理对象其中的方法时，该执行的代码
    InvocationHandler handler = new InvocationHandler() {
      /*
      * proxy: 正在返回的那个代理对象，一般情况下，在invoke方法中都不使用该对象
      * method：正在被调用的方法
      * args：调用方法时，传入的参数
      * */
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        System.out.println("方法名：" + methodName + "，参数值：" + Arrays.asList(args));

        Object result = null;

        try {
          //前置通知
          result = method.invoke(target, args);
          //后置通知，不走catch，可以获取到返回值
        } catch (Exception e) {
          e.printStackTrace();
          //异常通知，可以访问到方法的异常
        }

        //后置通知，因为方法可能会出异常，所以访问不到方法的返回值


        System.out.println("方法名：" + methodName + "，结果：" + result);
        return result;
      }
    };

    proxy = (IMath) Proxy.newProxyInstance(loader, interfaces, handler);
    return proxy;
  }
}
