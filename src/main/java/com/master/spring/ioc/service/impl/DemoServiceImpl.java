package com.master.spring.ioc.service.impl;

import com.master.spring.ioc.service.DemoService;

public class DemoServiceImpl implements DemoService {

    public void add() {
        System.out.println("DemoServiceImpl.add");
    }

    public void delete() {
        System.out.println("DemoServiceImpl.delete");
        throw new IllegalArgumentException();
    }

    public void update() {
        System.out.println("DemoServiceImpl.update");
        throw new NullPointerException();
    }

    public void query() {
        System.out.println("DemoServiceImpl.query");
    }

}