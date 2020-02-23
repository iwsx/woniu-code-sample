package com.iwsx.spring.entity;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class Person {

  private String name;

  private int age;

  private Date createdTime;

/*  @Autowired
  @Qualifier("address1")
  private Address address;*/

  @Resource
  private Address address;

  public Person() {
  }

  public Person(String name, int age,/* Date createdTime,*/ Address address) {
    this.name = name;
    this.age = age;
    //this.createdTime = createdTime;
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", createdTime=" + createdTime +
            ", address=" + address +
            '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

/*  public Date getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Date createdTime) {
    this.createdTime = createdTime;
  }*/

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
