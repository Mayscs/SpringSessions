package com.springprojects.XMLConfigurations.DependencyInjection;

import com.springprojects.XMLConfigurations.interfaces.Coach;
import com.springprojects.XMLConfigurations.interfaces.Training;

//Example of Dependency Injection with Setter Injection
public class BadmintonCoach implements Coach {
	private Training trainingService;
	private String coachName;
	private String emailId;
	private Training advancedTraining;

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCoachName() {
		return coachName;
	}

	public String getEmailId() {
		return emailId;
	}

	public BadmintonCoach() {
		System.out.println("No-args Constructor");
	}

	//Setter Method, this method name's property needs to be defined in the XML file.
	public void setTrainingService(Training trainingService) {
		this.trainingService = trainingService;
	}

	//Practice Activity2 Setter Method
	public void setAdvancedTraining(Training advancedTraining) {
		this.advancedTraining = advancedTraining;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 1 hour daily in leg exercise for swift forward and backward movement.";
	}

	@Override
	public String getTrainingService() {
		return trainingService.getTrainingService();
		//return "Expert training from International players like Saina Nehwal, PV Sindhu, Lin Dan, Lee Chong Woi.";
	}

	public String getAdvancedTraining() {
		return advancedTraining.getTrainingService();
	}
}
