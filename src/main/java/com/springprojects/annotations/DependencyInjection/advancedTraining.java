package com.springprojects.annotations.DependencyInjection;

import org.springframework.stereotype.Component;

import com.springprojects.annotations.interfaces.Training;

@Component
public class advancedTraining implements Training {
	@Override
	public String getTrainingService() {
		return "Get trained with the ellite level players of  %s";
	}
}




