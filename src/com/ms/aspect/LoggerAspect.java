package com.ms.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("��־:��ʼ"+joinPoint.getSignature().getName());
		
//		��������ִ��
		Object object=joinPoint.proceed();
		
		System.out.println("��־:����"+joinPoint.getSignature().getName());
		
		return object;
		
	}
}
