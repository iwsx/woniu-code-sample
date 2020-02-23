package com.iwsx.dao;

import com.iwsx.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by iwsx on 2019/12/26
 */
public interface UserMapper {

    List<User> queryUserByNameOrCode(@Param("name") String name,
                                     @Param("code") String code);

    User queryUserById(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);

}
