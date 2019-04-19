package com.example.spdemo.controller;

import com.example.spdemo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class TestControl {

    @RequestMapping("/test")
    public String test(String name){
        return "姓名："+name;
    }
    @RequestMapping("/user")
    public User getUser(){
        User user = new User();
        user.setAge(18);
        user.setName("Dava");
        user.setPass("123");
        user.setCreateDate(new Date());
        return user;
    }
}
