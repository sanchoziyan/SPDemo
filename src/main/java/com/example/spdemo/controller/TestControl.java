package com.example.spdemo.controller;

import com.example.spdemo.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class TestControl {

    @RequestMapping("/test/{name}")
    public String test(@PathVariable String name){
        return "姓名："+name;
    }

    @RequestMapping("/user")  ///
    public User getUser(@RequestParam("date") Date date){
        User user = new User();
        user.setAge(28);
//        user.setName("Dava");
//        user.setPass("");
        user.setCreateDate(date);
        return user;
    }

    @RequestMapping("/date")
        public Map hello(Map<String, Object> model){
        model.put("time", new Date());
        model.put("message", "hello world");
        return model;
    }

    /**
     * @Valid 参数校验
     * @param user
     * @param result 参数校验的结果存储在该对象中
     */
    @RequestMapping("/save")
    public void saveUser(@Valid User user, BindingResult result) {
        System.out.println("user:"+user);
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode()+ "-" + error.getDefaultMessage());
            }
        }
    }
}
