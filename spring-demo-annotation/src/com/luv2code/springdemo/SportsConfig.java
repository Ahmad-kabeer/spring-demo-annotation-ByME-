package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")


//injecting properties file
@PropertySource("classpath:foo.properties")
public class SportsConfig {
	
	//define bean for our sad fortune service
	@Bean
	public FortuneService fortuneService() {
		return new SadForuneService();
		
	}
	
	//define bean for the swim coach service
	@Bean
	public Coach swimCoach() {
		SwimCoach sc=new SwimCoach(fortuneService());
		return sc;
	}
	

}
