package com.girish.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.girish.business.Goal;

@Controller
@SessionAttributes("goal")
public class GoalController {
	
	@RequestMapping(value = "/addGoal", method = RequestMethod.GET)
	public String addGoal(Model model) {
		model.addAttribute("goal", new Goal());
		return "addGoal";
	}
	
	@RequestMapping(value = "/updateGoal", method = RequestMethod.POST)
	public String updateGoal(@ModelAttribute("goal") @Valid Goal goal, BindingResult result) {
		if(result.hasErrors()) {
			return "addGoal";
		}
		return "redirect:addMinutes";
	}
}
