package com.iwsx.spring.dao.impl;

import com.iwsx.spring.dao.IUserDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserDao implements IUserDao {

  @Resource
  JdbcTemplate jdbcTemplate;


  public void addPrice(String name, int price) {
    String sql = "update user set price = price + ?  WHERE name = ?";
    jdbcTemplate.update(sql, price, name);
  }

  public void subPrice(String name, int price) {
    String sql = "update user set price = price - ?  WHERE name = ?";
    jdbcTemplate.update(sql, price, name);
  }
}
