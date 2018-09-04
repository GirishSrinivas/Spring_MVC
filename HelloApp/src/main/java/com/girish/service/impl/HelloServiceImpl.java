package com.girish.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girish.repository.HelloJPA;
import com.girish.service.HelloService;

@Service("helloService")
public class HelloServiceImpl implements HelloService {
	
	@Autowired
	HelloJPA repo;

	@Override
	public String getQuoteOfTheDay() {
		String quote = repo.findOne();
		return quote;
	}

}
