package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Mylogin {
	
	
	  @Before("execution(public void demo())")
	public void beforeaddAccountAdvice() {
		System.out.println("Execute before advice on addAccount()");
	}

}
