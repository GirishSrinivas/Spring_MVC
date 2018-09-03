package com.girish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/greeting")
	public String greeting(Model model) {
		model.addAttribute("greeting", "Hello, Girish!...");
		return "hello";
	}
}
