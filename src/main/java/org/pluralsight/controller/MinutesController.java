package org.pluralsight.controller;

import org.pluralsight.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise)
	{
		System.out.println("Minutes exercised : " + exercise.getMinutes());
		return "addMinutes";
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
