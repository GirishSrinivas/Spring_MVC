package com.girish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.girish.model.Event;

@Controller
public class EventController {
	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public String displayEvents(Model model) {
		Event event = new Event();
		event.setName("Java User Group");
		model.addAttribute("event", event);
		
		return "event";
	}
}
