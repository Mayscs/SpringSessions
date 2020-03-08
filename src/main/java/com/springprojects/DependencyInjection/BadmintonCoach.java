package com.springprojects.DependencyInjection;

import com.springprojects.InversionOfControl.Coach;

//Example of Dependency Injection with Setter Injection
public class BadmintonCoach implements Coach {
	private Training trainingService;
	public BadmintonCoach() {
		System.out.println("No-args Constructor");
	}

	//Setter Method, this method name's property needs to be defined in the XML file.
	public void setTrainingService(Training trainingService) {
		this.trainingService = trainingService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 1 hour daily in leg exercise for swift forward and backward movement.";
	}

	@Override
	public String getTrainingService() {
		return "Expert training from International players like Saina Nehwal, PV Sindhu, Lin Dan, Lee Chong Woi.";
	}
}
