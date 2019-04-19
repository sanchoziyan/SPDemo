package com.example.spdemo;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    protected Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Value("${neo.title}")
    private String title;

    @org.junit.Test
    public void test(){
        Assert.assertEquals(title,"纯洁的微笑");
//        logger.info(title);
    }

}
