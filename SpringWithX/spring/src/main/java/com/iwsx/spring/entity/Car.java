package com.iwsx.spring.entity;

//@Component("carHH")
public class Car {

  private String brand;

  private double price;

  public Car() {
    //System.out.println("调用了Car的无参构造方法");
  }

  public Car(String brand, double price) {
    this.brand = brand;
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Car{" +
            "brand='" + brand + '\'' +
            ", price=" + price +
            '}';
  }
}
