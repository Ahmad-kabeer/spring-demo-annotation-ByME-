package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("ahmadservice")
	private FortuneService fs;

	public TennisCoach() { 
		System.out.println("tennis class constructor");
	}

	@Override
	public String getDailyCoach() {

		return "CoachInterface under Tennis Coach ";
	}

	@Override
	public String getDailyFortune() {
		return fs.YourDailyService();
	}

	
	//define my @postconstructor
	@PostConstruct
	public void doMyStuff() {
		System.out.println("@PostConstruct");
	}
	
	
	//define my @predestroyer
	 @PreDestroy
	 public void domyystuff() {
		 System.out.println("@PreDestroy"); 
	 }
}
