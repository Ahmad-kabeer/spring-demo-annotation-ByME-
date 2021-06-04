package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//test which config file is execute
		System.out.println("xml config file is execute");
		
		//get the bean from spring container
		Coach thecoach=context.getBean("tennisCoach",Coach.class);
		
		//call a method on a bean
		System.out.println(thecoach.getDailyCoach());

		//call another method to test construction injection
		System.out.println(thecoach.getDailyFortune());
		
		//close context
		context.close();
		

	}

}
