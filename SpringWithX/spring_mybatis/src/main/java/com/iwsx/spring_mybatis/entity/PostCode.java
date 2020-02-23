package com.iwsx.spring_mybatis.entity;

public class PostCode {

  private String home;

  private String code;

  public PostCode() {
  }

  @Override
  public String toString() {
    return "PostCode{" +
            "home='" + home + '\'' +
            ", code='" + code + '\'' +
            '}';
  }

  public PostCode(String home, String code) {
    this.home = home;
    this.code = code;
  }

  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
