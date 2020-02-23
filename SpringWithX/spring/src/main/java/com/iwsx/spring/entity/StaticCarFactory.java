package com.iwsx.spring.entity;

import java.util.HashMap;
import java.util.Map;

/**
 *  静态工厂方法：直接调用某一个类的静态方法就可以直接返回 Bean 实例
 */
public class StaticCarFactory {

  private static Map<String, Car> cars;

  static  {
    cars = new HashMap<String, Car>();
    cars.put("宝马", new Car("宝马", 300000));
    cars.put("吉利", new Car("吉利", 150000));
  }

  public static Car getCar(String brand){
    return cars.get(brand);
  }
}
