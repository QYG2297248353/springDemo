package com.ms.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("日志:开始"+joinPoint.getSignature().getName());
		
//		方法继续执行
		Object object=joinPoint.proceed();
		
		System.out.println("日志:结束"+joinPoint.getSignature().getName());
		
		return object;
		
	}
}
