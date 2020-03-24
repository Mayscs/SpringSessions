package com.springprojects.XMLConfigurations.DependencyInjection;

import com.springprojects.XMLConfigurations.interfaces.Coach;
import com.springprojects.XMLConfigurations.interfaces.Training;

public class FootBallCoach implements Coach {
	private Training training;
//Dependency Injection :  Constructor Injection
	public FootBallCoach(Training training) {
		this.training = training;
	}

	@Override
	public String getDailyWorkout() {
		return "Aim for Yo Yo test with score 20. Sprints for 10 minutes.";
	}

	//using Training to get training service
	public String getTrainingService() {
		return training.getTrainingService();
	}
}
