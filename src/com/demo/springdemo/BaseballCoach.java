package com.demo.springdemo;

import org.springframework.stereotype.Component;

@Component("sillyBaseballCoach")
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Transfer the ball correctly!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Your all wish comes true!!!";
	}

}
