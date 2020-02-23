package com.iwsx.spring_mybatis.dao;


import com.iwsx.spring_mybatis.entity.Employees;

public interface EmployeesMapper {

    int deleteByPrimaryKey(Integer employeenumber);

    int insert(Employees record);

    int insertSelective(Employees record);

    Employees selectByPrimaryKey(Integer employeenumber);

    int updateByPrimaryKeySelective(Employees record);

    int updateByPrimaryKey(Employees record);
}