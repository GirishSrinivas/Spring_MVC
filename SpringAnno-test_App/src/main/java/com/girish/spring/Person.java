package com.girish.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("Girish")
	private String name;
	
	@Value("27")
	private int age;
	
	@Autowired
	private Address address;

	@Autowired
	List<Account> accounts;
//	private Account account;
	
	public Person() {
		super();
		System.out.println("Inside no-args constructor of Person()...");
	}
	
	public Person(String name, int age, Address address, List<Account> accounts) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.accounts = accounts;
		System.out.println("Inside parameterized constructor of Person()...");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("Inside setName in Person...");
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		System.out.println("Inside setAge in Person...");
		this.age = age;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", accounts=" + accounts + "]";
	}

//	public Account getAccount() {
//		return account;
//	}
//
//	@Autowired
//	@Qualifier("credit")
//	public void setAccount(Account account) {
//		this.account = account;
//		System.out.println("Setter injection for Account...");
//	}

	
	
}
