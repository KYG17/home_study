package com.gn.homework10.controller;

import com.gn.homework10.model.vo.Account;

public class Run {
	public static void main(String[] args) {
		
	
	Account a = new Account("123-456-789" , 10000);
	a.withdraw(3000);
	
	Account a1 = new Account("987-654-321" , 5000);
	a1.deposit(10000);
	
	
	}
}
