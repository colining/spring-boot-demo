package com.example.web;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

public class BlogPropertiesTest {

    @Autowired
    private BlogProperties blogProperties;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getProperties() {
        System.out.println(blogProperties.age);
        Assert.assertEquals(blogProperties.getName(),"colin");
    }
}