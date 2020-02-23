package com.iwsx.spring.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("address")
public class Address {

  public Address() {
    //System.out.println("调用了Address的无参构造方法");
  }

  public Address(String city, String street) {
    City = city;
    Street = street;
  }

  private String City;

  private String Street;

  public String getCity() {
    return City;
  }

  public void setCity(String city) {
    City = city;
  }

  public String getStreet() {
    return Street;
  }

  public void setStreet(String street) {
    Street = street;
  }

  @Override
  public String toString() {
    return "Address{" +
            "City='" + City + '\'' +
            ", Street='" + Street + '\'' +
            '}';
  }

  @PostConstruct
  public void init(){
    //System.out.println("Address创建完成");
  }

  @PreDestroy
  public void destroy(){
    System.out.println("Address准备销毁了");
  }
}
