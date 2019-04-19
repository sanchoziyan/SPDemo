package com.example.spdemo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class HelloTest {
    protected Logger logger =  LoggerFactory.getLogger(this.getClass());
    @Test
    public void hello(){
        System.out.println("hello world");
    }


}
