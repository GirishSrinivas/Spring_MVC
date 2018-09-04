package com.girish.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		System.out.println("main() -> Starting Spring Contaner...");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("main() -> Started Spring Contaner...");
		
		// default id chosen is class name with lower case
		Person p1 = (Person) context.getBean("person");
		
		System.out.println(p1);

	}

}
