package com.demo.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "D:/Eclipse_Workspaces/Java_Programs/spring-demo-annotations/src/inputfile.txt";
	private List<String> fortuneList;;
	Random myRandom = new Random();

	public FileFortuneService() {
		System.out.println("FileFortuneService: Inside FileFortuneService");
	}

	@PostConstruct
	public void fortunesLoader(){
		System.out.println("Load the data from the file");
		File file = new File(fileName);
		System.out.println("Reading data from  the file "+file);
		System.out.println("File exists: "+file.exists());
		fortuneList=new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String temp;
			while((temp=br.readLine())!=null){
				fortuneList.add(temp);
			}
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortuneList.size());
		String ranFortune=fortuneList.get(index);
		return ranFortune;
	}

}
