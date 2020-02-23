package com.iwsx.test;

import com.iwsx.config.SpringConfig;
import com.iwsx.dao.UserMapper;
import com.iwsx.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by iwsx on 2019/12/25
 */
public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        User user = (User) applicationContext.getBean("user");
//        System.out.println(user);
//
//        Role role = (Role)applicationContext.getBean("role");
//        System.out.println(role);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name: beanDefinitionNames) {
            System.out.println(name);
        }

        UserMapper userMapper = (UserMapper)applicationContext.getBean("userMapper");
        User user = userMapper.queryUserById(1);
        System.out.println(user);

    }


}
