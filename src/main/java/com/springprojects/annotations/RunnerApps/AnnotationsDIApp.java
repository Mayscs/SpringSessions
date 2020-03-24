package com.springprojects.annotations.RunnerApps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springprojects.annotations.interfaces.Coach;

public class AnnotationsDIApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
		//Constructor Injection
		Coach ttCoach = context.getBean("tableTennisCoach", Coach.class);

		System.out.println("\n"  + ttCoach.getDailyRoutine() + "\n" + ttCoach.getTrainingService());
	}
}
