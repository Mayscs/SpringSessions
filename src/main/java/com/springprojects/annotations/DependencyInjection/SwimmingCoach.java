package com.springprojects.annotations.DependencyInjection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.springprojects.annotations.interfaces.Coach;
import com.springprojects.annotations.interfaces.Training;
import com.springprojects.utilities.Sports;

@Component("mySwimmingCoach")
@Scope("prototype")
public class SwimmingCoach implements Coach {

	private Training trainingService;
	//Field Injection
	@Autowired
	@Qualifier("superTraining")
	private Training newTrainingService;

	//public SwimmingCoach(){ }    - Not mandatory.

	//Setter Injection
	@Autowired
	@Qualifier("superTraining")
	public void setTrainingService(Training swimTraining) {
		System.out.println("Performed by Setter Injection.");
		this.trainingService = swimTraining;
	}

	//Method Injection
	@Autowired
	@Qualifier("advancedTraining")
	public void doTrainingService(Training seaSwimTraining) {
		System.out.println("Performed by Method Injection.");
		this.trainingService = seaSwimTraining;
	}

	@Override
	public String getDailyRoutine() {
		return "Practice breathing exercise for 10 minutes for 8 days. Breathe from mouth and release from nose.";
	}

	@Override
	public String getTrainingService() {
		return String.format(trainingService.getTrainingService(), Sports.SWIMMING);
	}

	public String getNewTrainingService() {
		return String.format(newTrainingService.getTrainingService(), "Field Swimming".toUpperCase());
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
