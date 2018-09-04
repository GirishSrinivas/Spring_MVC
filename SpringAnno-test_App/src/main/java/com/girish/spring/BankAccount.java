package com.girish.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("savings")
public class BankAccount implements Account{
	
	@Value("50000")
	private double balance;
	
	@Value("acc001")
	private String AccNo;

	public BankAccount() {
		super();
	}
	
	public BankAccount(double balance, String accNo) {
		super();
		this.balance = balance;
		AccNo = accNo;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccNo() {
		return AccNo;
	}

	public void setAccNo(String accNo) {
		AccNo = accNo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AccNo == null) ? 0 : AccNo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", AccNo=" + AccNo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (AccNo == null) {
			if (other.AccNo != null)
				return false;
		} else if (!AccNo.equals(other.AccNo))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}

	@Override
	public void withDraw(double amount) {
		if(amount > balance - 2000) {
			System.out.println("Insufficient funds in account, cannot withdraw!...");
			return;
		}
		else {
			balance = balance - amount;
			System.out.println("Balance after withDraw is: " +balance);
		}
	}

	@Override
	public void debit(double amount) {
		balance = balance + amount;
		System.out.println("Balance after debit is: "+balance);
	}

	@Override
	public double checkBalance() {
		return balance;
	}

}
