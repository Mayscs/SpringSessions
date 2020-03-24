package com.springprojects.XMLConfigurations.InversionOfControl;


import com.springprojects.XMLConfigurations.interfaces.Coach;

public class TrackCoach implements Coach {
	@Override
	public String getDailyWorkout(){
		return "Spend 1hr running.";
	}

	@Override
	public String getTrainingService() {
		return null;
	}
}
