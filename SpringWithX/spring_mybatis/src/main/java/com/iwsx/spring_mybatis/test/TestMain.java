package com.iwsx.spring_mybatis.test;

import com.iwsx.spring_mybatis.dao.UserMapper;
import com.iwsx.spring_mybatis.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by iwsx on 2019/12/30
 */
public class TestMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:xml/springConfig.xml");
//        Configuration configuration = (Configuration)applicationContext.getBean("configuration");
//        System.out.println(configuration.getDbDriver());
//        System.out.println(configuration.getDbUrl());
//        System.out.println(configuration.getDbUsername());
//        System.out.println(configuration.getDbPasswd());

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames){
            System.out.println(name);
        }

        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        List<User> users = userMapper.queryUserAll();
        for (User user : users){
            System.out.println(user);
        }

    }
}
