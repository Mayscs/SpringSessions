package com.springprojects.annotations.DependencyInjection;

import org.springframework.stereotype.Component;

import com.springprojects.annotations.interfaces.Training;

@Component
public class SuperTraining implements Training {
	@Override
	public String getTrainingService() {
		return "Get trained with the world experts. Manika Batra and Sharat Chandra.";
	}
}
