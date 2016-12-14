package com.master.spring.ioc.service.impl;

import com.master.spring.ioc.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    public void add() {
        System.out.println("EmployeeServiceImpl.add() get invoked.....");
    }

    public void add(String str) {
        System.out.println("EmployeeServiceImpl.add(String str) get invoked.....");
    }

    public void delete() {
        System.out.println("delete");
    }

}