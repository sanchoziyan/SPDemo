package com.example.spdemo;

import com.example.spdemo.properties.NeoProperties;
import com.example.spdemo.properties.OtherProperties;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.print.attribute.standard.MediaSize;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    protected Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Value("${neo.title}")
    private String title;

    @Resource
    private NeoProperties properties;

    @Resource
    private OtherProperties otherProperties;

    @org.junit.Test
    public void test(){
        Assert.assertEquals(title,"纯洁的微笑");
        logger.info(title);
        logger.info(properties.getDescription());
    }

    @org.junit.Test
    public void testOther() throws Exception {
        logger.info("title:"+otherProperties.getTitle());
        logger.info("blog:"+otherProperties.getBlog());
    }

}
