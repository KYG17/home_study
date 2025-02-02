package com.gn.homework08.controller;

import com.gn.homework08.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.name = "윤규리";
		p.age = 28;
		System.out.println(p.name +"는" + p.age + "입니다");
		
		p.setName("권용규");
		p.setAge(30);
		
		System.out.println(p.getName() + "는" + p.getAge() + "입니다");
	}

}
