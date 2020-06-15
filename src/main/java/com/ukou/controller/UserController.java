package com.ukou.controller;

import com.ukou.entity.User;
import com.ukou.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@CrossOrigin
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/addUser")
    public Integer addUser(@Param("name") String name, @Param("email") String email, @Param("password") String password) {

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        return userService.addUser(user);
    }

    @RequestMapping("/login")
    public User getByEmailAndPwd(String email, String password, HttpSession session) {

        User user = userService.getByEmailAndPwd(email, password);
        if (user != null) {
            session.setAttribute("loginUser", user);
        }
        return user;
    }

    @RequestMapping("/logout")
    public void logout(HttpSession session) {
        session.invalidate();
    }

    @RequestMapping("/getSession")
    public User getLoginSession(HttpSession session) {
        return (User) session.getAttribute("loginUser");
    }

    @RequestMapping("/checkName")
    public User checkName(@Param("name") String name) {
        return userService.getByFullName(name);
    }

    @RequestMapping("checkEmail")
    public User checkEmail(String email) {
        return userService.getByFullEmail(email);
    }
}
