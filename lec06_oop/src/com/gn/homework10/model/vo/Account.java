package com.gn.homework10.model.vo;

public class Account {
	private String accountNumber;
	private int balance;
	
	public Account() {};
	
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		System.out.println(balance + amount);
	}
	
	public void withdraw(int amount) {
		System.out.println(balance - amount);
	}

}
