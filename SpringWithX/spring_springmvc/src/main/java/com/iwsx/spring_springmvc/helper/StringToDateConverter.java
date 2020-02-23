package com.iwsx.spring_springmvc.helper;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

  public Date convert(String source){
    if(source == null){
      throw new RuntimeException("传入的字符串为空，无法转成时间类型。");
    }
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
      return dateFormat.parse(source);
    } catch (ParseException e) {
      throw new RuntimeException("传入的字符串转化时间类型失败。");
    }
  }
}
