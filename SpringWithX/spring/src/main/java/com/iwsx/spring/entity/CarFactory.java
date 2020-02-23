package com.iwsx.spring.entity;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

  private Map<String, Car> cars;

  public CarFactory(){
    cars = new HashMap<String, Car>();
    cars.put("奥迪", new Car("奥迪", 350000));
    cars.put("宝马", new Car("宝马", 300000));
  }

  public Car getCar(String brand){
    return cars.get(brand);
  }
}
