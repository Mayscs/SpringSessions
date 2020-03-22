package com.springprojects.SpringAppRunner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springprojects.InversionOfControl.Coach;

public class BeanScopeApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach primaryCoachCity = context.getBean("bblCoach", Coach.class);
		Coach assistantCoachCity = context.getBean("bblCoach", Coach.class);
		checkCoach(primaryCoachCity,assistantCoachCity);
		Coach primaryCoachState = context.getBean("bblCoach2", Coach.class);
		Coach assistantCoachState = context.getBean("bblCoach2", Coach.class);
		checkCoach(primaryCoachState, assistantCoachState);
	}

	private static void checkCoach(Coach primaryCoach, Coach assistantCoach) {
		if (primaryCoach.equals(assistantCoach)) {
			System.out.println(String.format("Same Coach: %s and %s", primaryCoach, assistantCoach));
		} else
			System.out.println(String.format("Different Coach: %s and %s", primaryCoach, assistantCoach));
	}
}
