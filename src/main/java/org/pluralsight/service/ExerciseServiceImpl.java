package org.pluralsight.service;

import java.util.ArrayList;
import java.util.List;

import org.pluralsight.model.Activity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class ExerciseServiceImpl implements ExerciseService {

	/* (non-Javadoc)
	 * @see org.pluralsight.service.ExerciseService#findAllActivities()
	 */
	public @ResponseBody List<Activity> findAllActivities()
	{
		System.out.println("Inside exercise service impl..");
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}
}
