package com.demo.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String data[] = { "Beware of Dogs in CHX", "Have a nice Day!!", "Best of Luck!!",
			"This journey is hard but you have to travel it!!" };

	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
