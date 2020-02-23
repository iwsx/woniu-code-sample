package com.iwsx.spring_springmvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "用户名和密码不匹配！")
public class MyException extends RuntimeException {


  private static final long serialVersionUID = -573011430766137713L;
}
