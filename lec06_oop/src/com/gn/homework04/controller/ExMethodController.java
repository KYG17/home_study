package com.gn.homework04.controller;

public class ExMethodController {
	
	public void practice01(String a , String b) {
		System.out.println(a + b);
	}
	
	public int practice02() {
		int result = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			result += i;
		}
		return result;
	}
	
	public int practice03(int a) {
		if(a % 2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	
}
