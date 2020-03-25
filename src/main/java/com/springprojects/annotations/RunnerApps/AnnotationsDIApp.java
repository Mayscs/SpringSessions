package com.springprojects.annotations.RunnerApps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springprojects.annotations.DependencyInjection.SwimmingCoach;
import com.springprojects.annotations.interfaces.Coach;

public class AnnotationsDIApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
		String newLine = "\n";
		System.out.println("===============-------------===================" + newLine + "============== ~Annotations~ ==================" + newLine + "===============-------------===================");
		//Constructor Injection with Annotations
		Coach ttCoach = context.getBean("tableTennisCoach", Coach.class);
		System.out.println(newLine  + ttCoach.getDailyRoutine() + newLine + ttCoach.getTrainingService());

		//Setter Injection with Annotations
		Coach swimmingCoach = context.getBean("mySwimmingCoach", SwimmingCoach.class);
		System.out.println(newLine + swimmingCoach.getDailyRoutine() + newLine + swimmingCoach.getTrainingService());

		//Field Injection with Annotations
		System.out.println(newLine + ((SwimmingCoach) swimmingCoach).getNewTrainingService());

		//Practice Activity 5: Read from file and random selection

		Coach fieldHockeyCoach = context.getBean("hockeyCoach", Coach.class);
		System.out.println(newLine + fieldHockeyCoach.getDailyRoutine() + newLine + fieldHockeyCoach.getTrainingService());

			context.close();
		System.out.println(newLine + "=================== ~END~ ===================");
	}
}
