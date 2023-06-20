package com.archana;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExtraData {
	
	/*   @Before("msg()")
	public void welcome() {
		System.out.println("we are here from Before method");
	}
	@After("msg()")
	public void welcome1() {
		System.out.println("we are here from After method");
	}
	@Pointcut("execution(public void *method())")
	public void msg() {}
	
	}*/
	@Around("execution(public void teacherMethod())")
	public void welcome(ProceedingJoinPoint pjp)throws Throwable {
		System.out.println("we are here from Before");
		pjp.proceed();
		
			System.out.println("we are here from After");
		}
	}


