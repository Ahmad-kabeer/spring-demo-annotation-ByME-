package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AhmadConfig {

	@Bean
	public FortuneService ahmadFortune() {
		return new AhmadFortune();
	}
	
	@Bean
	public Coach ahmadCoach() {
		AhmadCoach ac=new AhmadCoach(ahmadFortune());
		return ac; 
	}
}
