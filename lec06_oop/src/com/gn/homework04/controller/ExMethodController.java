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
	
	public void practice04(String a , char b) {
		int count = 0;
		for(int i = 0 ; i < a.length() ; i++) {
			if(a.charAt(i) == b ) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void practice05(int a) {
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(a + "*"+ i + "=" +a*i);
		}
	}
	
	public String practice06(String a) {
		int count = 0;
		for(int i = 0 ; i < a.length() ; i++) {
			if(a.charAt(i) >= 'a' &&  a.charAt(i) <='z') {
				count++;
			}else if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' ) {
				count++;
			}
		}
		return count > 0 ? "영문자가 포함" : "포함되지 않았습니다";
	}
}
