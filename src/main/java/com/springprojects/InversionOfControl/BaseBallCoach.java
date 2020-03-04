package com.springprojects.InversionOfControl;

public class BaseBallCoach implements Coach {
	@Override
	public String getDailyWorkout(){
		return "Spend 1hr batting.";
	}

	@Override
	public String getTrainingService() {
		return null;
	}
}
