package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoAppConfiguration {

	public static void main(String[] args) {
		
		//read the spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//get the bean from spring container
		Coach thecoach=context.getBean("tennisCoach",Coach.class);
		
		//test which config file is execute
		System.out.println("java config file is execute");
		
		//call a method on a bean
		System.out.println(thecoach.getDailyCoach());

		//call another method to test construction injection
		System.out.println(thecoach.getDailyFortune());
		
		//close context
		context.close();
		

	}

}
