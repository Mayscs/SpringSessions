package com.springprojects.XMLConfigurations.DependencyInjection;

import java.util.Random;

import com.springprojects.XMLConfigurations.interfaces.Training;

public class AdvancedTraining implements Training {
	public AdvancedTraining(){
		//Do Nothing - No Args constructor
	}
	@Override
	public String getTrainingService() {
		Random random = new Random();
		int index = random.nextInt(3);
		String[] array = {"Lee Chong", "P. Gopichand", "Lin Dan"};
		return "Hurray!! You have got an expert advance mentor to uplift skill - " + array[index];
	}
}
