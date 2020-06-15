package com.ukou.service;

import com.ukou.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getByEmailAndPwd(@Param("email") String email, @Param("password") String password);

    Integer addUser(User user);

    Integer updateUser(User user);

    User getByFullName(String name);

    User getByFullEmail(String email);
}
