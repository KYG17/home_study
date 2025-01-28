package com.gn.homework02.controller;

import com.gn.homework02.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.phone = "01012345678";
		p.height = 190.5;
		p.weight = 100.2;
		
		Person p1 = new Person();
		
		p1.phone = "01020256584";
		p1.height = 175.4;
		p1.weight = 65.6;
		
		System.out.println(p.phone + " " + p.height + " " + p.weight);
		System.out.println(p1.phone + " " + p1.height + " " + p1.weight);

	}

}
