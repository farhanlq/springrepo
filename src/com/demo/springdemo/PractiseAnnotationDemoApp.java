package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PractiseAnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("pingPongCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}

}
