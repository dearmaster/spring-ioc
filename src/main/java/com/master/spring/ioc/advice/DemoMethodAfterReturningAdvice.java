package com.master.spring.ioc.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class DemoMethodAfterReturningAdvice implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("DemoMethodAfterReturningAdvice.afterReturning");
    }

}