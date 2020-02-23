package com.iwsx.spring_mybatis.test;

import com.iwsx.spring_mybatis.dao.AddressMapper;
import com.iwsx.spring_mybatis.dao.UserMapper;
import com.iwsx.spring_mybatis.entity.Address;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestMain2 {

  public UserMapper userMapper;
  public AddressMapper addressMapper;
  public SqlSession sqlSession;

  @Before
  public void setUp() throws Exception {
    // mybatis-config.xml
    String resource = "xml/mybatisConfig2.xml";
    // 读取配置文件
    InputStream is = Resources.getResourceAsStream(resource);
    // 构建SqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    // 获取sqlSession
    sqlSession = sqlSessionFactory.openSession(true);

    //动态代理
    //this.userMapper = sqlSession.getMapper(UserMapper.class);
    this.addressMapper = sqlSession.getMapper(AddressMapper.class);
  }

  @Test
  public void testQueryAddress(){
    Address address = addressMapper.queryAddress(2);
    System.out.println(address);
  }

  @Test
  public void testQueryAddress2(){
    Map<String, Object> map = addressMapper.queryAddressReturnMap(2);
    System.out.println(map);
  }

  @Test
  public void testQueryAddress3(){
    Map<String, Address> addressMap = addressMapper.queryAddressReturnMap2(2);
    System.out.println(addressMap);
  }

  @Test
  public void testQueryAddress4(){
    Address address = addressMapper.queryAddressReturnMap3(2);
    System.out.println(address.getId());
    //System.out.println(address);
  }

  @Test
  public void testAddAddress(){
    Address address = new Address(0,"漳州", "云霄");
    addressMapper.addAddress(address);
    System.out.println(address.getId());
  }

  @Test
  public void testAddAddress2(){
    addressMapper.addAddress2("漳州", "云霄");
  }

  @Test
  public void testAddAddress3(){
    addressMapper.addAddress3("漳州", "云霄");
  }

  @Test
  public void testAddAddress4(){
    addressMapper.addAddress4("漳州", "云霄");
  }

  @Test
  public void testAddAddress5(){
    Address address = new Address(0, "湖", "武汉");
    addressMapper.addAddress5("湖北", address);
  }

  @Test
  public void testAddAddress6(){
    List<Address> addresses = new ArrayList<Address>();
    addresses.add(new Address(0, "湖北", "武汉"));
    addressMapper.addAddress6(addresses);
  }

  @Test
  public void testUpdateAddress(){
    Address address = new Address(3,"漳州", "东山");
    addressMapper.updateAddress(address);
  }

  @Test
  public void testDeleteAddress(){
    addressMapper.deleteAddress(3);
  }

}
