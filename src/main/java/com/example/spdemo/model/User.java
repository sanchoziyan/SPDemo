package com.example.spdemo.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class User {

    private String name;

    private int age;

    private String pass;

//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

}
