package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SadForuneService implements FortuneService {

	@Override
	public String YourDailyService() {
		return "FortuneService interface implented in SadForuneService class";
	}

}
