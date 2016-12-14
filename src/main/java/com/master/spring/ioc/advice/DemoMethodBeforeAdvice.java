package com.master.spring.ioc.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class DemoMethodBeforeAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("DemoMethodBeforeAdvice.before");
    }

}