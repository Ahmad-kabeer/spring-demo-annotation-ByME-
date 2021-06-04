package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

//@Component(value="swimCoach")
public class SwimCoach implements Coach {
	
	//injecting properties file
	@Value("${foo.email}")
	private String email;
	@Value("${foo.name}")
	private String name;

	private FortuneService fs;
	
	public SwimCoach(FortuneService fs) {
		 
		this.fs = fs;
	}

	@Override
	public String getDailyCoach() {
		return "getdaily coach interface's method in swim coach";
	}

	@Override
	public String getDailyFortune() {
		 return fs.YourDailyService();
	}

	//getter and setter of properties file variable
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
