package com.springprojects.InversionOfControl;

public class MainApp {
	public static void main(String[] args) {
		Coach coach = new BaseBallCoach();
		Coach newCoach = new TrackCoach();
		System.out.println("Daily WorkOut:" + coach.getDailyWorkout());
	}
}
