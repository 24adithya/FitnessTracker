package org.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.pluralsight.model.Activity;
import org.pluralsight.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise)
	{
		System.out.println("Minutes exercised : " + exercise.getMinutes());
		System.out.println("Activity : " + exercise.getActivity());
		return "addMinutes";
	}
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities()
	{
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
	
	/**
	 * Code to 'forward' and 're-direct'
	 */
	
	/*@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise)
	{
		System.out.println("Minutes exercised : " + exercise.getMinutes());
		return "forward:addMoreMinutes.html";
	}
	
	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise)
	{
		System.out.println("More Minutes exercised : " + exercise.getMinutes());
		return "addMinutes";
	}*/
}
