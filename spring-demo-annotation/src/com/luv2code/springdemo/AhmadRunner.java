package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AhmadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AhmadConfig.class);
		
		AhmadCoach theahmadcoach=context.getBean("ahmadCoach",AhmadCoach.class);
		
		System.out.println(theahmadcoach.getDailyCoach());
		
		context.close();

	}

}
