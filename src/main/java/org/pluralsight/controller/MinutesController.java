package org.pluralsight.controller;

import java.util.List;

import org.pluralsight.model.Activity;
import org.pluralsight.model.Exercise;
import org.pluralsight.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;
	
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
		return exerciseService.findAllActivities();
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
