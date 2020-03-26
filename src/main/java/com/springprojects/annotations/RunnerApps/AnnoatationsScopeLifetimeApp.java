package com.springprojects.annotations.RunnerApps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springprojects.annotations.interfaces.Coach;

public class AnnoatationsScopeLifetimeApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
		Coach hockeyCoach = context.getBean("hockeyCoach", Coach.class);
		Coach fieldHockeyCoach = context.getBean("hockeyCoach", Coach.class);
		areObjectsReferringSameBean(hockeyCoach, fieldHockeyCoach);

		Coach swimCoach = context.getBean("mySwimmingCoach", Coach.class);
		Coach divingCoach = context.getBean("mySwimmingCoach", Coach.class);
		areObjectsReferringSameBean(swimCoach, divingCoach);
	}

	private static void areObjectsReferringSameBean(Coach primaryCoach, Coach secondaryCoach) {
		if (primaryCoach.equals(secondaryCoach)) {
			System.out.println("Same Object: " + primaryCoach.getClass() + "and" + secondaryCoach.getClass() );
		} else {
			System.out.println("Different Object:" + primaryCoach.getClass() + "and" + secondaryCoach.getClass());
		}
	}
}
