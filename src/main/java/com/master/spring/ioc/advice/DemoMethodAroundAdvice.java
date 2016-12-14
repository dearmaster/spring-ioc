package com.master.spring.ioc.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DemoMethodAroundAdvice implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        try {
            System.out.println("DemoMethodAroundAdvice.before");
            Object result = invocation.proceed();
            System.out.println("DemoMethodAroundAdvice.after");
            return result;
        } catch (Exception e) {
            System.out.println("Around method : throw  an  exception ");
            throw e;
        }
    }

}