package com.gn.homework03.controller;

import com.gn.homework03.model.vo.Method;

public class Run {

	public static void main(String[] args) {
		Method m = new Method();
		String result = m.practice01("규리야", "사랑해");
		System.out.println(result);
		System.out.println(m.practice01("규리야", "좋아해"));
		
		System.out.println("=============");
		Method m1 = new Method();
		int multi = m1.practice02( 3 , 6);
		System.out.println(multi);
		System.out.println("=============");
		Method m3 = new Method();
		String bool = m3.practice03("규리", "규리");
		System.out.println(bool);
	}

}
