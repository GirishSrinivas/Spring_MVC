package com.girish.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("credit")
public class CreditCardAccount implements Account {

	@Value("100000")
	private double creditBalance;
	
	@Value("credit001")
	private String creditAccNo;

	public CreditCardAccount() {
		super();
	}
	
	public CreditCardAccount(double creditBalance, String creditAccNo) {
		super();
		this.creditBalance = creditBalance;
		this.creditAccNo = creditAccNo;
	}
	
	public double getBalance() {
		return creditBalance;
	}

	public void setBalance(double creditBalance) {
		this.creditBalance = creditBalance;
	}

	public String getAccNo() {
		return creditAccNo;
	}

	public void setAccNo(String creditAccNo) {
		this.creditAccNo = creditAccNo;
	}
	
	@Override
	public String toString() {
		return "CreditCardAccount [creditBalance=" + creditBalance + ", creditAccNo=" + creditAccNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creditAccNo == null) ? 0 : creditAccNo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(creditBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CreditCardAccount other = (CreditCardAccount) obj;
		if (creditAccNo == null) {
			if (other.creditAccNo != null)
				return false;
		} else if (!creditAccNo.equals(other.creditAccNo))
			return false;
		if (Double.doubleToLongBits(creditBalance) != Double.doubleToLongBits(other.creditBalance))
			return false;
		return true;
	}

	@Override
	public void withDraw(double amount) {
		if(amount > creditBalance - 2000) {
			System.out.println("Insufficient funds in credit account, cannot withdraw!...");
			return;
		}
		else {
			creditBalance = creditBalance - amount;
			System.out.println("creditBalance after withDraw is: " +creditBalance);
		}
	}

	@Override
	public void debit(double amount) {
		creditBalance = creditBalance + amount;
		System.out.println("creditBalance after debit is: "+creditBalance);
	}

	@Override
	public double checkBalance() {
		return creditBalance;
	}

}
