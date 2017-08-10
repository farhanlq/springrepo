package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PractiseHelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		SwimCoach swim = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(swim.getDailyWorkout());
		System.out.println(swim.getDailyFortune());
		System.out.println(swim.getEmail());
		System.out.println(swim.getTeam());
		context.close();

	}

}
