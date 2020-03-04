package com.springprojects.InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringApp {
	// Using Spring metadata or configuration file i.e. xml file
	public static void main(String[] args) {
		//1.load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2. Retrieve bean from the spring container
		Coach coach = context.getBean("bblCoach", Coach.class);
		//3. Call methods on the bean object which is like any other java object
		System.out.println(coach.getDailyWorkout());

		coach = context.getBean("trckCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		//4. Close the context
		context.close();
	}
}
