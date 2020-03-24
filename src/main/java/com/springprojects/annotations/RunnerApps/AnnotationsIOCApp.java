package com.springprojects.annotations.RunnerApps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springprojects.annotations.interfaces.Coach;

public class AnnotationsIOCApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
		Coach myCoach = context.getBean("golfCoach", Coach.class);
		System.out.println("================ Annotations =================");
		System.out.println(myCoach.getDailyRoutine());
		context.close();
	}

}
