package com.solt.limitatontwoproxies.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeRepositoryAspect {
    @Pointcut("within(com.solt.limitatontwoproxies.service.*.*)||within(com.solt.limitatontwoproxies.*)")
    public void serviceOrSamePackageRepository(){

    }

    @Before("serviceOrSamePackageRepository()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Before - "+ joinPoint.getSignature());
    }
    @Before("serviceOrSamePackageRepository()")
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println("After -"+ joinPoint.getSignature());
    }
}
