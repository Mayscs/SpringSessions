package com.springprojects.XMLConfigurations.SpringAppRunner;

import com.springprojects.XMLConfigurations.InversionOfControl.BaseBallCoach;
import com.springprojects.XMLConfigurations.interfaces.Coach;
import com.springprojects.XMLConfigurations.InversionOfControl.TrackCoach;


public class MainApp {
	public static void main(String[] args) {
		Coach coach = new BaseBallCoach();
		Coach newCoach = new TrackCoach();
		System.out.println("Daily WorkOut:" + coach.getDailyWorkout());
	}
}
