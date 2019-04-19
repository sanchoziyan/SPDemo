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
    @RequestMapping("/user")  ///
    public User getUser(@RequestParam("date") Date date){
        User user = new User();
        user.setAge(18);
//        user.setName("Dava");
//        user.setPass("");
        user.setCreateDate(date);
        return user;
    }
}
