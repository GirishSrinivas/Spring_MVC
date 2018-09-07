package com.girish.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.girish.business.Activity;
import com.girish.business.Exercise;
import com.girish.service.FitTrackerService;

@Controller
public class MinutesController {
	
	@Autowired
	FitTrackerService service;
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		
		System.out.println("Exercise for today: " +exercise);
		
		// explaining view chaining...
		// return "forward:addMoreMinutes";
		// return "redirect:addMoreMinutes";
		return "addMinutes";
	}
	
	@RequestMapping(value = "/activity", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<>();
		
		activities = service.findAllActivities();
		
		return activities;
	}

	// Demo showing view chaining with forward and redirect
//	@RequestMapping(value = "/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
//		
//		System.out.println("Exercising more for today: " +exercise);
//		
//		return "addMinutes";
//	}
	
}
