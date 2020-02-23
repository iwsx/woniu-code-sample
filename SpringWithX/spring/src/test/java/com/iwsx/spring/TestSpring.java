package com.iwsx.spring;

import com.iwsx.spring.config.ApplicationCfg;
import com.iwsx.spring.config.DbUtils;
import com.iwsx.spring.entity.Address;
import com.iwsx.spring.entity.Car;
import com.iwsx.spring.entity.Person;
import com.iwsx.spring.service.AddressService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class TestSpring {

  ApplicationContext context;

  @Before
  public void before(){
    //context = new ClassPathXmlApplicationContext("classpath:springConfig.xml");
    context = new AnnotationConfigApplicationContext(ApplicationCfg.class);
  }

  @Test
  public void test() throws Exception{
    //Thread.sleep(6000);
    Address address = (Address) context.getBean("address");
    Address address2 = (Address) context.getBean("address");
    System.out.println(address);
    System.out.println(address2);
    System.out.println(address == address2);
  }

  @Test
  public void test01(){
//    Address address = (Address) context.getBean("address");
//    System.out.println(address);

    Person person = (Person) context.getBean("person");
    System.out.println(person);
  }

  @Test
  public void test02(){
    Date myDate = (Date) context.getBean("myDate");
    System.out.println(myDate);
  }

  @Test
  public void testZhuJie01(){
    AddressService addressService = (AddressService) context.getBean("addressService");
    addressService.addAddress(null);
  }

  @Test
  public void testZhuJie02(){
    Car car = (Car) context.getBean("car");
    System.out.println(car);
  }

  @Test
  public void testZhuJie03(){
    Car car = (Car) context.getBean("carFactory");
    System.out.println(car);
  }

  @Test
  public void testZhuJie04(){
    Car car = (Car) context.getBean("carbyFactory2");
    System.out.println(car);
  }

  @Test
  public void testValue01(){
    DbUtils dbUtils = (DbUtils) context.getBean("dbUtils");
    System.out.println(dbUtils);
  }

}
