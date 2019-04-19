package com.example.spdemo.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private String name;

    private int age;

    private String pass;

    private Date createDate;

}
