package com.springprojects.annotations.DependencyInjection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.springprojects.annotations.interfaces.Training;

@Component
public class RandomTraining implements Training {
	private List<String> trainingData;

	@Override
	public String getTrainingService() {
		readDataFromFile();
		Random random = new Random();
		return trainingData.get(random.nextInt(trainingData.size()));
	}

	private void readDataFromFile() {
		trainingData = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new File("/Users/mayank.gupta/SpringSessions/src/main/resources/TrainingTechnology.txt"));
			while(scanner.hasNextLine()) {
				trainingData.add(scanner.nextLine());
			}
			scanner.close();
		} catch(FileNotFoundException e) {
			System.out.println("No File present at the specified location" + e.getMessage());
		}
	}
}
