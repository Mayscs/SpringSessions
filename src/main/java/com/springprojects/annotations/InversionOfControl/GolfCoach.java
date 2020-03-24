package com.springprojects.annotations.InversionOfControl;

import org.springframework.stereotype.Component;

import com.springprojects.annotations.interfaces.Coach;

@Component
public class GolfCoach implements Coach {
	@Override
	public String getDailyRoutine() {
		return "Practice burdy for half an hour.";
	}

	@Override
	public String getTrainingService() {
		return null;
	}
}
