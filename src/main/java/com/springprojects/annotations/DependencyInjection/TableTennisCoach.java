package com.springprojects.annotations.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springprojects.annotations.interfaces.Coach;
import com.springprojects.annotations.interfaces.Training;
import com.springprojects.utilities.Sports;

@Component
public class TableTennisCoach implements Coach {
private Training trainingService;

//Constructor Injection
@Autowired
public TableTennisCoach(@Qualifier("advancedTraining") Training ttTraining) {
	System.out.println("Performed by Constructor Injection.");
	this.trainingService = ttTraining;
}

	@Override
	public String getDailyRoutine() {
		return "Practice regressive fast body movement for 15 minutes. Practice forehand with racket down at 45 degree.";
	}

	@Override
	public String getTrainingService() {
		//System.out.println("Performed by Constructor Injection.");
		return String.format(trainingService.getTrainingService(), Sports.TABLETENNIS);
	}


}
