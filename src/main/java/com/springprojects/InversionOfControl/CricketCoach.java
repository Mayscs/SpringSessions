package com.springprojects.InversionOfControl;

public class CricketCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return ("For Batting: Daily 2-3 hours. Keep Instance correct, feet movement important." + "\n" + "For Bowling: Daily 2 hours. Keep wrist position straight while releasing ball and don't drop head while delivering.");
	}

	@Override
	public String getTrainingService() {
		return null;
	}


}
