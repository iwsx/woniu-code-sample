package com.iwsx.spring.service;

import com.iwsx.spring.dao.impl.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserService {

  @Resource
  UserDao userDao;


  /*
  * 添加事务注释
  * 1.使用 propagation 指定事务的传播行为，即当前的事务方法被另一个事务方法调用时，
  * REQUIRED：默认取值，即使用调用方法的事务
  * REQUIRED_NEW：使用自己的事务，调用方法的事务被挂起
  * 2.isolation：指定事务的隔离级别，最常用取值为 Isolation.READ_COMMITTED
  * 3.使用readOnly 指定事务是否为只读，表示这个事务只读取数据但不更新数据，
  * 这样可以帮助数据库引擎优化事务，若真的是一个只读取数据库值的方法，应该设置realOnly=true
  * 4.使用timeout 指定强制回滚事务可以占用的事件，单位秒
  * */
  @Transactional(propagation = Propagation.REQUIRED,
          isolation = Isolation.READ_COMMITTED,
          readOnly = false,
          timeout = 10)
  public void testTransaction(){
    userDao.addPrice("小白", 10);
    userDao.subPrice("小红", 10);
  }

  public void testTransaction2(){
    userDao.addPrice("小白", 10);
    double a = 1/0;
    userDao.subPrice("小红", 10);
  }
}
