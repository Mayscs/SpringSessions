package com.springprojects.XMLConfigurations.DependencyInjection;

import com.springprojects.XMLConfigurations.interfaces.Training;

public class SeniorMentorTraining implements Training {

	@Override
	public String getTrainingService() {
		return "Hurray!! You are selected for advanced training with senior mentors.";
	}
}
