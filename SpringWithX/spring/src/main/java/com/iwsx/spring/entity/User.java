package com.iwsx.spring.entity;

public class User {

  private String name;
  private int age;
  private double price;

  public User() {
  }

  public User(String name, int age, double price) {
    this.name = name;
    this.age = age;
    this.price = price;
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

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", price=" + price +
            '}';
  }
}
