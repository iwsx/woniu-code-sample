package com.iwsx.spring;

import com.iwsx.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

public class TestTransaction {

  ApplicationContext context;
  JdbcTemplate jdbcTemplate;

  @Before
  public void before(){
    context = new ClassPathXmlApplicationContext("classpath:springConfig-tx.xml");
    jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
  }

  @Test
  public void test01()
  {
    DataSource dataSource = (DataSource) context.getBean("dataSource");
    try {
      System.out.println(dataSource.getConnection());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void test02()
  {
    String sql = "update user set price = price - 10 WHERE name='小红'";
    jdbcTemplate.update(sql);
    double a = 1/0;
    String sql2 = "update user set price = price + 10 WHERE name='小白'";
    jdbcTemplate.update(sql2);
  }

  @Test
  public void test03()
  {
    UserService userService = (UserService) context.getBean("userService");
    userService.testTransaction2();
  }


}
