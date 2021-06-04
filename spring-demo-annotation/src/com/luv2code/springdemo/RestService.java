package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("RestService")
public class RestService implements FortuneService {

	@Value("${foo.name}")
	private String name;
	
	@Override
	public String YourDailyService() {
		// TODO Auto-generated method stub
		return name;
	}

 
}
