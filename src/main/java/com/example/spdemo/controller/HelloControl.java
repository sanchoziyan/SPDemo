package com.example.spdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class HelloControl {

    @RequestMapping("/hello")
    public String hello(Map<String, Object> model){
        model.put("time", new Date());
        model.put("message", "hello world");
        return "Hello";
    }
}
