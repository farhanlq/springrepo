package com.demo.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach yourCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(yourCoach.getDailyWorkout());
		System.out.println(yourCoach.getDailyFortune());
		
		context.close();
	}

}
