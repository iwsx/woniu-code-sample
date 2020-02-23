package com.iwsx.spring_springmvc.controller;

import com.iwsx.spring_springmvc.entity.User;
import com.iwsx.spring_springmvc.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

  @RequestMapping(value = "sayhi", method = {RequestMethod.GET})
  public String sayHi(){
    return "hi";
  }

  /**
   * @RequestParam可以避免前端和后端定义的字段名称不一致的问题
   * @param uname
   * @return
   */
  @RequestMapping("success01")
  public String success01(@RequestParam(name = "username") String uname){
    System.out.println(uname);
    return "success";
  }

  /**
   * 获取请求体
   * 测试@requestBody，提取整个请求体到一个字符串内，此注释只对post请求有效，对get请求无效
   * @param body
   * @return
   */
  @RequestMapping("success02")
  public String success02(@RequestBody String body) {
    try {
      body = URLDecoder.decode(body, "utf-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    System.out.println(body);
    return "success";
  }

  /**
   * @PathVariable 支持rest风格请求
   * @param id
   * @return
   */
  @RequestMapping("/testPathvariable/{id}")
  public String testPathvariable(@PathVariable int id){
    System.out.println(id);
    return "success";
  }

  /**
   * 获取请求头
   * 测试@RequestHeader，@RequestHeader需要指定value，不然使用不了
   * @param header
   * @return
   */
  @RequestMapping("testRequestHeader")
  public String testRequestHeader(@RequestHeader(value = "Accept") String header){
    System.out.println(header);
    return "success";
  }

  /**
   * 获取cookie的值
   * @CookieValue需要指定value值，不然无法使用
   * @param cookie
   * @return
   */
  @RequestMapping("testCookieValue")
  public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookie){
    System.out.println(cookie);
    return "success";
  }


  /**
   * @ModelAndValue的使用【少用，慎用，仅做了解】
   * 1.可以作用在方法上，会在其他方法之前执行该方法
   *  a、可以作用在有返回值的方法上，直接返回
   *  b、可以作用在无返回值的方法上，传入一个map，将数据保存到map上
   * 2.可以作用在方法的参数上，配合第1步取到返回值
   */

  /**
   * @ModelAttribute
   * 使用场景：例如修改某个用户信息时，前端发送的用户字段不完整，但是有些字段是不像被修改为空值的，
   * 可以先用该方法在数据库里把该用户查询出来，赋予空值的字段数据
   * @return
   */
  //@ModelAttribute
//  public User getUser(){
//    System.out.println("testModelAttribute之前的getUser执行了");
//    User user = new User();
//    //此处仅为模拟数据库查询
//    user.setId(1);
//    user.setUserName("小明");
//    return user;
//  }

  @ModelAttribute
  public void getUser2(Map<String, User> map){
    User user = new User();
    //此处仅为模拟数据库查询
    user.setId(1);
    user.setUserName("小明");
    map.put("user", user);
  }

  /**
   * 通过@ModelAttribute(value = "user")获取被@ModelAttribute注释的方法的返回值
   * @param user
   * @return
   */
  @RequestMapping("testModelAttribute")
  public String testModelAttribute(@ModelAttribute(value = "user") User user){
    System.out.println("testModelAttribute执行了");
    System.out.println(user);
    return "success";
  }

  /**
   * ModelMap会把值存入到request域里面
   * @param modelMap
   * @return
   */
  @RequestMapping("testInsertSession")
  public String testInsertSession(ModelMap modelMap){
    System.out.println("testInsertSession执行了");
    modelMap.put("userName", "美美");
    return "success";
  }

  /**
   * 要想获取上一个请求的值，必须把上一个请求的值存入到session中，然后再来取值
   * @SessionAttributes(value = "userName") //把一个字段保存到session域中
  public class HelloWorldController
   * @param modelMap
   * @return
   */
  @RequestMapping("testGetSession")
  public String testGetSession(ModelMap modelMap){
    System.out.println("testGetSession执行了");
    String userName = (String) modelMap.get("userName");
    System.out.println(userName);
    return "success";
  }

  /**
   * 清空session的值
   * @param status
   * @return
   */
  @RequestMapping("testDelSession")
  public String testDelSession(SessionStatus status){
    System.out.println("testDelSession执行了");
    //清空session的值
    status.setComplete();
    return "success";
  }

  /**
   * 添加完jackson-databind、jackson-core、jackson-annotations三个包之后，
   * 框架可以直接将json数据封装成javaBean对象
   * @param user
   * @return
   */
  @RequestMapping("testAjax2")
  public @ResponseBody User testAjax2(@RequestBody User user) {
    System.out.println("testAjax执行了");
    //User user = new User();
    user.setUserName("不懂就要问");
    user.setId(2);
    return user;
  }

  @RequestMapping("testUploadFile")
  public String testUploadFile(MultipartFile file, HttpServletRequest request) {
    //文件存放的位置
    String path=request.getSession().getServletContext().getRealPath("/files");
    File filePath = new File(path);
    if(!filePath.exists()){
      filePath.mkdir();
    }
    //保存文件
    File tempFile=new File(path, file.getOriginalFilename());
    try {
      file.transferTo(tempFile);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return "success";
  }

  @RequestMapping("testParamInterceptor")
  public String testParamInterceptor(){
    System.out.println("testParamInterceptor执行了");
    return "success";
  }

  @RequestMapping("testMathError/{i}")
  public String testMathError(@PathVariable(value = "i") int i){
    int a = 10 / i;
    System.out.println("testMath执行了");
    return "success";
  }

  /*
  * 1.在@ExceptionHandler 方法的入参可以加入Exception类型的参数，该参数即对应发生的异常对象
  * 2.在@ExceptionHandler 方法的入参中不能传入Map，若希望把异常信息传到页面上，需要使用ModelAndView 作为返回值
  *
  * */
/*  @ExceptionHandler(value = {ArithmeticException.class})
  public ModelAndView returnError(Exception ex){
    System.out.println(ex.toString());
    ModelAndView mv = new ModelAndView("error");
    mv.addObject("exception", ex);
    return mv;
  }*/

  //@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "用户名和密码不匹配！")
  @RequestMapping("testResponseStatusExceptionResolver/{i}")
  public String testResponseStatusExceptionResolver(@PathVariable(value = "i") int i){
    if(i == 13){
      //抛出自定义异常
      throw new MyException();
    }
    System.out.println("testResponseStatusExceptionResolver执行了");
    return "success";
  }

  @RequestMapping("testDateConvertor")
  public String testDateConvertor(@Valid User user, BindingResult result){
    //System.out.println(birthday);
    if(result.getErrorCount() > 0){
      System.out.println("类型转换异常");
      List<FieldError> fieldErrors = result.getFieldErrors();
      for(FieldError fieldError : fieldErrors){
        System.out.println(fieldError.getField() + "---" + fieldError.getDefaultMessage());
      }

    }
    return "success";
  }
}
