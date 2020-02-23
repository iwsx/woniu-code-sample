package com.iwsx.spring_springmvc.entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * Created by iwsx on 2020/1/9
 */
public class User {

  private int id;
  @NotEmpty(message="用户名不能为空")
  private String userName;

  @Pattern(regexp="[0-9a-zA-Z]{6,30}",message="密码是6-30个字符，必须是字母或数字组合")
  private String password;

  //过去的时间
  @Past
  //日期格式化
  @DateTimeFormat(pattern = "yyyy/MM/dd")
  private Date birthday;
  //数字格式化
  @NumberFormat(pattern = "#,###,###.#")
  private Float price;

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public User(int id, String userName) {
    this.id = id;
    this.userName = userName;
  }

  public User() {
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", userName='" + userName + '\'' +
            ", password='" + password + '\'' +
            ", birthday=" + birthday +
            ", price=" + price +
            '}';
  }
}
