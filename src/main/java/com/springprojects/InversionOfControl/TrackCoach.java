package com.springprojects.InversionOfControl;

public class TrackCoach implements Coach {
	@Override
	public String getDailyWorkout(){
		return "Spend 1hr running.";
	}
}
