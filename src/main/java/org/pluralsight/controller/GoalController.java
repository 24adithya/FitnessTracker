package org.pluralsight.controller;

import javax.validation.Valid;

import org.pluralsight.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("goal")
public class GoalController {
	
	@RequestMapping(value = "/addGoal", method = RequestMethod.GET)
	public String addGoal(Model model)
	{
		Goal goal = new Goal();
		goal.setMinutes(24);
		
		model.addAttribute("goal", goal);
//		System.out.println("Goal : " + new Goal());
		return "addGoal";
	}
	
	@RequestMapping(value = "/addGoal", method = RequestMethod.POST)
	public String setGoal(@Valid @ModelAttribute ("goal") Goal goal, BindingResult bindingResult)
	{
		/*Goal goal = new Goal();
		goal.setMinutes(24);*/
		System.out.println("Result has errors : " +bindingResult.hasErrors());
		
		System.out.println("Set goal in minutes is : " + goal.getMinutes());
		return "redirect:addMinutes.html";
	}
}
