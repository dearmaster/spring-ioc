package com.master.spring.ioc.service.impl;

import com.master.spring.ioc.service.EmployeeService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EmployeeServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private EmployeeService employeeService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    //@Ignore
    @Test
    public void add() throws Exception {
        Assert.assertNotNull(employeeService);
        employeeService.add();
        employeeService.add("Test");
    }

    @Ignore
    @Test
    public void delete() throws Exception {
        employeeService.delete();
    }
}