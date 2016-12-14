package com.master.spring.ioc.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DemoRegexMethodAroundAdvice implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        try {
            System.out.println("DemoRegexMethodAroundAdvice.before");
            Object result = invocation.proceed();
            System.out.println("DemoRegexMethodAroundAdvice.after");
            return result;
        } catch (Exception e) {
            System.out.println("DemoRegexMethodAroundAdvice.invoke : throw  an  exception ");
            throw e;
        }
    }

}