package com.ukou.service.impl;

import com.ukou.entity.User;
import com.ukou.mapper.UserMapper;
import com.ukou.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getByEmailAndPwd(String email, String password) {
        return userMapper.getByEmailAndPwd(email, password);
    }

    @Override
    public Integer addUser(User user) {

        user.setRegisterTime(new Date());
        return userMapper.addUser(user);
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User getByFullName(String name) {
        return userMapper.getByFullName(name);
    }

    @Override
    public User getByFullEmail(String email) {
        return userMapper.getByFullEmail(email);
    }
}
