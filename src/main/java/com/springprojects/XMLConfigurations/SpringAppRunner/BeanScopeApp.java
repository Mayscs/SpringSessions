package com.springprojects.XMLConfigurations.SpringAppRunner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springprojects.XMLConfigurations.interfaces.Coach;
import com.springprojects.utilities.ConsoleColors;

public class BeanScopeApp {
	public static void main(String[] args) {
		System.out.println(ConsoleColors.RESET);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach primaryCoachCity = context.getBean("bblCoach", Coach.class);
		Coach assistantCoachCity = context.getBean("bblCoach", Coach.class);
		checkCoach(primaryCoachCity,assistantCoachCity);
		Coach primaryCoachState = context.getBean("bblCoach2", Coach.class);
		Coach assistantCoachState = context.getBean("bblCoach2", Coach.class);
		checkCoach(primaryCoachState, assistantCoachState);
		// =========== Our Own Custom Methods(Hook) =========
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		context.close();
	}

	private static void checkCoach(Coach primaryCoach, Coach assistantCoach) {
		if (primaryCoach.equals(assistantCoach)) {
			System.out.println(String.format("Same Coach: %s and %s", primaryCoach, assistantCoach));
		} else
			System.out.println(String.format("Different Coach: %s and %s", primaryCoach, assistantCoach));
	}
}
