package com.gn.homework03.model.vo;

public class Method {
	
	public String practice01(String a , String b) {
		return a+b;
	}
	
	public int practice02(int a , int b) {
		if(a<b) {
			System.out.println("계산할 수 없습니다");
			return 0;
		}
		return a*b;
	
	}
	
	public String practice03(String a, String b) {
		if(a.equals(b)) {
			return "true";
		}else {
			return "False";
		}
	}

}
