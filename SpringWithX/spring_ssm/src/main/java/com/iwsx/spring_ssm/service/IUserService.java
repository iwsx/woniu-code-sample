package com.iwsx.spring_ssm.service;

import com.iwsx.spring_ssm.entity.User;

public interface IUserService {
  User QueryUserById(int id);
}
