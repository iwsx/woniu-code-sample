package com.iwsx.spring_mybatis.dao;

import com.iwsx.spring_mybatis.entity.PostCode;

public interface PostCodeMapper {
  PostCode queryPostCodeByHome(String home);
}
