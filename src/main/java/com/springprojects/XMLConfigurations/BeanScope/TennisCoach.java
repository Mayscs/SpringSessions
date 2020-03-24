package com.springprojects.XMLConfigurations.BeanScope;

import com.springprojects.XMLConfigurations.interfaces.Coach;
import com.springprojects.utilities.ConsoleColors;

public class TennisCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return null;
	}

	@Override
	public String getTrainingService() {
		return null;
	}

	public void doInitializeTask() {
		if (true == true) {
			System.out.println(ConsoleColors.GREEN.toString() + "\nI am laying foundation for your sports, let me initialize few things for you, Thank You Champion!!\n" + ConsoleColors.RESET);
		}
	}

	public void doClosingTask() {
		if (true == true) {
			System.out.println(ConsoleColors.GREEN.toString() + "\nI am grateful to this sports, you turned true champion. Let me destroy un-required things for you, Thank You Champion!!" + ConsoleColors.RESET);
		}
	}
}
