package com.girish.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.girish.business.UserBean;
import com.girish.service.HelloService;

@Controller
public class HelloController {
	
	@Autowired
	HelloService service;
	
	@RequestMapping(value="/greeting")
	public String greeting(Model model) {
		model.addAttribute("greeting", "Hello, Human!...");
		return "hello";
	}
	
	@RequestMapping(value="/openInputView")
	public String inputView(Model model) {
		model.addAttribute("user", new UserBean());
		return "input";
	}
	
	@RequestMapping(value="/welcome")
	public String welcome(@ModelAttribute("user") @Valid UserBean user, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "input";
		}
		else {
			String quote = service.getQuoteOfTheDay();
			model.addAttribute("quote", quote);
			return "welcome";
		}
		
		
	}
}
