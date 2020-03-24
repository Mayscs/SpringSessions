package com.springprojects.annotations.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springprojects.annotations.interfaces.Coach;
import com.springprojects.annotations.interfaces.Training;

@Component
public class TableTennisCoach implements Coach {
private Training additionalTraining;

//Constructor Injection
@Autowired
public TableTennisCoach(Training newTraining) {
	this.additionalTraining = newTraining;
}

	@Override
	public String getDailyRoutine() {
		return "Practice regressive fast body movement for 15 minutes. Practice forehand with racket down at 45 degree.";
	}

	@Override
	public String getTrainingService() {
		return additionalTraining.getTrainingService();
	}


}
