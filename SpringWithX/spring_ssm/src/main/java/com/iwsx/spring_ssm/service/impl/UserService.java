package com.iwsx.spring_ssm.service.impl;

import com.iwsx.spring_ssm.dao.UserMapper;
import com.iwsx.spring_ssm.entity.User;
import com.iwsx.spring_ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

  @Autowired
  private UserMapper userMapper;

  public User QueryUserById(int id) {
    return userMapper.selectById(id);
  }
}
