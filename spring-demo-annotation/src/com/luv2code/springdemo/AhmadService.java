package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("ahmadservice")
public class AhmadService implements FortuneService {
	
	private String[] arr= {"hey today you will get milk","hey today you will get chocolate","hey today you will get brownybread"};

	private Random rndm=new Random();
	
	
	@Override
	public String YourDailyService() {
		int ranNumber=rndm.nextInt(arr.length);

		return arr[ranNumber];
	}

 

}
