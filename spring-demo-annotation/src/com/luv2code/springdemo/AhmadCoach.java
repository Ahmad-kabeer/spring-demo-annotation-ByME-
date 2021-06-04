package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class AhmadCoach implements Coach {

	private FortuneService fs;
	
	public AhmadCoach(FortuneService fs) { 
		this.fs = fs;
	}

	@Override
	public String getDailyCoach() {
		// TODO Auto-generated method stub
		return "getDailyCoach Coach in AhmadCoach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.YourDailyService();
	}

}
