package com.master.spring.ioc.service.impl;

import com.master.spring.ioc.service.DemoService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DemoBeforeAfterAroundTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    @Qualifier("demoServiceProxy")
    private DemoService demoService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void add() throws Exception {
        System.out.println("\n\n\n-----------------------------------");
        demoService.add();
    }

    @Test
    public void delete() throws Exception {
        System.out.println("\n\n\n-----------------------------------");
        demoService.delete();
    }

    @Test
    public void update() throws Exception {
        System.out.println("\n\n\n-----------------------------------");
        demoService.update();
    }
}