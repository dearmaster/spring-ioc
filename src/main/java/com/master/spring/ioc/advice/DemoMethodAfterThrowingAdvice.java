package com.master.spring.ioc.advice;

import org.springframework.aop.ThrowsAdvice;

public class DemoMethodAfterThrowingAdvice implements ThrowsAdvice {

    /**
     * Must implement the method with specified method name afterThrowing
     * and parameter exception instance. otherwise exception will be thrown
     * @param e
     * @throws Throwable
     */
    public void afterThrowing(IllegalArgumentException e) throws Throwable {
        System.out.println("DemoMethodAfterThrowingAdvice.afterThrowing(IllegalArgumentException e)");
    }

    public void afterThrowing(NullPointerException e) throws Throwable {
        System.out.println("DemoMethodAfterThrowingAdvice.afterThrowing(NullPointerException e)");
    }

}