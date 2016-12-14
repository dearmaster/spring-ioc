package com.master.spring.ioc.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class DemoAspect {

    private static final Logger logger = Logger.getLogger(DemoAspect.class);

    public Object printLog(ProceedingJoinPoint joinpoint) {
        logger.info("DemoLogAspect.pringLog starts...");
        //////////
        //do something here
        /////////
        try {
            return joinpoint.proceed();
        } catch (Throwable e) {
            logger.error(e.getMessage());
        } finally {
        }
        return null;
    }

    public Object authentication(ProceedingJoinPoint joinpoint) {
        logger.info("DemoLogAspect.pringLog starts...");
        //////////
        //do something here
        /////////
        try {
            return joinpoint.proceed();
        } catch (Throwable e) {
            logger.error(e.getMessage());
        } finally {
        }
        return null;
    }

    public Object cache(ProceedingJoinPoint joinpoint) {
        logger.info("DemoLogAspect.pringLog starts...");
        //////////
        //do something here
        /////////
        try {
            return joinpoint.proceed();
        } catch (Throwable e) {
            logger.error(e.getMessage());
        } finally {
        }
        return null;
    }

}