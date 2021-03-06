package com.dark.mode.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DemoConfigAspect {
    @Pointcut("execution(public void com.dark.mode.aop.*.add*(..))")
    public void logAddedAccount() {
    }

    @Pointcut("execution(public * com.dark.mode.aop.*.find*(boolean))")
    public void findAdvice() {
    }

    @Pointcut("execution(public * com.dark.mode.aop.*.find*(..))")
    public void exception() {
    }

    @Pointcut("execution(java.util.List<com.dark.mode.aop.*> find*(..))")
    public void successOrFail() {
    }

    @Pointcut("execution(public String getFortune())")
    public void fortuneService() {
    }
}
