package com.springprojects.annotations.DependencyInjection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.springprojects.annotations.interfaces.Coach;
import com.springprojects.annotations.interfaces.Training;

@Component(value = "hockeyCoach")
@Scope(value = "singleton")
public class FieldHockeyCoach implements Coach {

	private Training trainingService;

	@Autowired
	@Qualifier(value = "randomTraining")
	public void setTrainingService(Training hockeyTraining) {
		System.out.println("Field Hockey Setter Injection.");
		this.trainingService = hockeyTraining;
	}

	@Override
	public String getDailyRoutine() {
		return "Practice running for 30 minutes daily. Dribble ball between the stoppers with your stick.";
	}

	@Override
	public String getTrainingService() {
		return trainingService.getTrainingService();
	}

	@PostConstruct
	public void doInitialiation(){
		System.out.println("Initialization with bean.");
	}

	@PreDestroy
	public void doCleanUp(){
		System.out.println("Destroy used objects.");
	}
}
