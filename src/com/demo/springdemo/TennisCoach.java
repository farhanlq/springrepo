package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("amazingCoach")
@Component
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	public TennisCoach() {
		System.out.println("Tennis Coach: Inside Default Constructor");
	}

	
	/*@Autowired 
	public void doSomeGoodWork(FortuneService fortuneService) {
		System.out.println("Tennis Coach: Inside doSomeGoodWork Method()");
		this.fortuneService = fortuneService;
	}*/



	@Override
	public String getDailyWorkout() {
		return "Practise your serving Skills!!";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
