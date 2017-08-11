package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public PingPongCoach() {
		System.out.println("PingPongCoach: Inside Default Constructor:");
		}
	
	@Override
	public String getDailyWorkout() {
		return "Practise your shot wisely!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
