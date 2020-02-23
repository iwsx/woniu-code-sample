package com.iwsx.spring_springmvc.exception.handle;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/*
* @ControllerAdvice修饰的类
* 可以让异常处理作用于所有Controller
* */
//@ControllerAdvice
public class FirstExceptionHandle {

  /*
   * 1. 在@ExceptionHandler 方法的入参可以加入Exception类型的参数，该参数即对应发生的异常对象
   * 2. @ExceptionHandler 方法的入参中不能传入Map，若希望把异常信息传到页面上，需要使用ModelAndView 作为返回值
   * 3. @ExceptionHandler 方法标记的异常有优先级问题，根据异常类型就近原则
   * 4. @ControllerAdvice：如果在当前Handler 中找不到@ExceptionHandler 方法处理当前方法出现的异常，
   *    则将去@ControllerAdvice 标记的类中查找@ExceptionHandler标记的方法来处理异常
   * */
  @ExceptionHandler(value = {ArithmeticException.class})
  public ModelAndView returnError(Exception ex){
    System.out.println(ex.toString());
    ModelAndView mv = new ModelAndView("error");
    mv.addObject("exception", ex);
    return mv;
  }
}
