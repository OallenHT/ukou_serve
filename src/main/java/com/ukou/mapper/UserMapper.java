package com.ukou.mapper;

import com.ukou.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Select("select * from t_user")
    List<User> getAll();

    @Select("select * from t_user where id=#{id}")
    User getUserById(Integer id);

    @Select("select * from t_user where email=#{email} and password=#{password}")
    User getByEmailAndPwd(@Param("email") String email, @Param("password") String password);

    @Insert("insert into t_user (name, password, register_time, phone, email, message, sex, qq, avatar) " +
            "values (#{name}, #{password}, #{registerTime}, #{phone}, #{email}, #{message}, #{sex}, #{qq}, #{avatar})")
    Integer addUser(User user);

    @Update("update t_user set name=#{name}, password=#{password}, register_time=#{registerTime}, phone=#{phone}, message=#{message}, " +
            "sex=#{sex}, qq=#{qq}, avatar=#{avatar} where email=#{email}")
    Integer updateUser(User user);

    @Select("select * from t_user where name = #{name}")
    User getByFullName(String name);

    @Select("select * from t_user where email = #{email}")
    User getByFullEmail(String email);
}
