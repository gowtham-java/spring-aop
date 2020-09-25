package com.ex;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation m1) throws Throwable {
		System.out.println("Authentication Aspect");
		Object o=m1.proceed();
		
		
		System.out.println("Logging Aspect");
		
	
		return o;
	}

}
