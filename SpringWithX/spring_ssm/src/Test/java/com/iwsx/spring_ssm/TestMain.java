package com.iwsx.spring_ssm;


import com.iwsx.spring_ssm.dao.UserMapper;
import com.iwsx.spring_ssm.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMain {

  @Test
  public void TestFindAll() throws  Exception{
    String config = "spring/mybatis-config.xml";
    InputStream stream = Resources.getResourceAsStream(config);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    List<User> users = userMapper.selectList(null);
    for (User user : users)
    {
      System.out.println(user);
    }
  }
}
