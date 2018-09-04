package com.girish.spring;

public interface Account {
	public void withDraw(double amount);
	public void debit(double amount);
	public double checkBalance();
	public String toString();
	public int hashCode();
	public boolean equals(Object obj);
}
