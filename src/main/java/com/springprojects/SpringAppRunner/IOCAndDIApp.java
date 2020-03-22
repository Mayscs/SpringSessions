package com.springprojects.SpringAppRunner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springprojects.DependencyInjection.BadmintonCoach;
import com.springprojects.InversionOfControl.Coach;

public class IOCAndDIApp {
	// Using Spring metadata or configuration file i.e. xml file
	public static void main(String[] args) {
		//1.load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2. Retrieve bean from the spring container
		Coach coach = context.getBean("bblCoach", Coach.class);
		//3. Call methods on the bean object which is like any other java object
		System.out.println("++++++++=======++++++++++$$$$++++++++++++=======++++++++");
		System.out.println("BASEBALL" + "\n" + coach.getDailyWorkout());

		coach = context.getBean("trckCoach", Coach.class);
		System.out.println("\n" + "TRACKCOACH" + "\n" + coach.getDailyWorkout());

		coach = (Coach) context.getBean("cricketCoach");
		System.out.println("\n" + "CRICKET" + "\n" + coach.getDailyWorkout());

		//Dependency Injection: Constructor Injection
		coach = context.getBean("footballCoach", Coach.class);
		System.out.println("\n" + "FOOTBALL" + "\n" + coach.getDailyWorkout() + "\n" + coach.getTrainingService());

		//Dependency Injection: Setter Injection
		coach = context.getBean("badmintonCoach", Coach.class);
		System.out.println( "\n" + "BADMINTON" + "\n" + coach.getDailyWorkout() + "\n" + coach.getTrainingService());
		//Literal Values in XML file
		BadmintonCoach badmintonCoach = context.getBean("badmintonCoach", BadmintonCoach.class);
		System.out.println("+++++ Literal Values in XML files ++++++");
		System.out.println("The Best Coach: " + badmintonCoach.getCoachName() + "\nThe official Id of academy is: " + badmintonCoach.getEmailId());
		//Practice Activity2: Dependency Injection
		System.out.println(("+++++ Dependency Injection: Setter Injection +++++\n" + badmintonCoach.getAdvancedTraining()));

		System.out.println("++++++++=======++++++++++$$$$++++++++++++=======++++++++");
		//4. Close the context
		context.close();
	}
}
