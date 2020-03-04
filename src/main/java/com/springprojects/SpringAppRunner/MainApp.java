package com.springprojects.SpringAppRunner;

import com.springprojects.InversionOfControl.BaseBallCoach;
import com.springprojects.InversionOfControl.Coach;
import com.springprojects.InversionOfControl.TrackCoach;

public class MainApp {
	public static void main(String[] args) {
		Coach coach = new BaseBallCoach();
		Coach newCoach = new TrackCoach();
		System.out.println("Daily WorkOut:" + coach.getDailyWorkout());
	}
}
