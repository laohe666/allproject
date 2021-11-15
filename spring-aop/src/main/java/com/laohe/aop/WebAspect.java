package com.laohe.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: 孙靖淳
 * @Date: 2021/11/15 17:53
 */
@Aspect
@Component
public class WebAspect {
    /**
     * 切入点
     * */
    @Pointcut("execution("")")
    public void pointCut() {}

    /**
     * 前置通知 , 目标方法调用前被调用
     * */
    @Before("pointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("<-----前置通知----->");
        Signature signature = joinPoint.getSignature();
        System.out.println("返回目标方法的签名:" + signature);
    }
}
