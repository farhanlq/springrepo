package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach yourCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(yourCoach.getDailyWorkout());
		// Coach baseCoach = context.getBean("sillyBaseballCoach",Coach.class);
		// System.out.println(baseCoach.getDailyWorkout());
		System.out.println(yourCoach.getDailyFortune());
		// System.out.println(baseCoach.getDailyFortune());
		
		context.close();
	}

}
