package com.girish.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloJPAImpl implements HelloJPA {

	@Override
	public String findOne() {
		String[] quotes = {"We should not give up and we should not allow the problem to defeat us.",
							"If you want to shine like a sun, first burn like a sun.", 
							"You see, God helps only people who work hard. That principle is very clear.",
							"Small aim is a crime; have great aim.",
							"Man needs his difficulties because they are necessary to enjoy success.",
							"I was willing to accept what I couldn't change."};
		String quote = null;
		
		quote = quotes[(int) (Math.random() * quotes.length)];
		
		return quote;
	}

}
