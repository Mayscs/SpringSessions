package com.springprojects.SpringAppRunner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springprojects.InversionOfControl.Coach;

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

		coach = (Coach) context.getBean("cricketCoach");
		System.out.println("\n" + coach.getDailyWorkout());

		//Dependency Injection: Constructor Injection
		coach = context.getBean("footballCoach", Coach.class);
		System.out.println("\n" + coach.getDailyWorkout() + "\n" + coach.getTrainingService());

		//Dependency Injection: Setter Injection
		coach = context.getBean("badmintonCoach", Coach.class);
		System.out.println("\n" + coach.getDailyWorkout() + "\n" + coach.getTrainingService());

		//4. Close the context
		context.close();
	}
}
