package com.springprojects.XMLConfigurations.InversionOfControl;

import com.springprojects.XMLConfigurations.interfaces.Coach;

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
