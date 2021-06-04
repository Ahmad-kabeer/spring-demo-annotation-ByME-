package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationDemoApp3 {

	public static void main(String[] args) {
		
		//read the spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);
		
		//test which config file is execute
//		System.out.println("xml config file is execute");
		
		//get the bean from spring container
		SwimCoach thecoach=context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on a bean
		System.out.println(thecoach.getDailyCoach());

		//call another method to test construction injection
		System.out.println(thecoach.getDailyFortune());
		
//		print the value of foo.properties file variable and test .properties file injectin
		System.out.println("value of properties file email: "+ thecoach.getEmail());
		System.out.println("value of properties file name : "+ thecoach.getName());
		
		//close context
		context.close();
		

	}

}
