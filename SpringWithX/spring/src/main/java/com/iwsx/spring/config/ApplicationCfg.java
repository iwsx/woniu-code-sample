package com.iwsx.spring.config;

import com.iwsx.spring.entity.Address;
import com.iwsx.spring.entity.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.iwsx.spring")
@PropertySource("classpath:db/db.properties")
public class ApplicationCfg {

  @Bean
  public Address getAddress(){
    return new Address("福建", "厦门");
  }

  @Bean("car")
  public Car getCar(){
    return new Car("audi", 300000);
  }
}
