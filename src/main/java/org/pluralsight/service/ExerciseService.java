package org.pluralsight.service;

import java.util.List;

import org.pluralsight.model.Activity;

public interface ExerciseService {

	List<Activity> findAllActivities();

}