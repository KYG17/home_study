package com.gn.study.capsule.controller;

import com.gn.study.capsule.Account2;

public class Run {

	public static void main(String[] args) {
		Account2 a = new Account2("김철수",2000);
		int total = a.getBalance()-5000;
		System.out.println(a.getBalance());
		
		System.out.println(total);
		a.setBalance(total);
		System.out.println(a.getBalance());

	}

}
