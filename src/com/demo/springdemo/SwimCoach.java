package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	@Value("{buzz.email}")
	String email;
	
	@Value("{buzz.coach}")
	String coach;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "It's a good Workout";
	}

	@Override
	public String getDailyFortune() {
		return "Enjoy swiming";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public String getCoach() {
		return coach;
	}

	
	

}
