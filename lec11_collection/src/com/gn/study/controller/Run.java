package com.gn.study.controller;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		List<String>meal = new ArrayList<String>();
		meal.add("점심");
		meal.add("저녁");
		meal.add("야식");
		System.out.println(meal);
		meal.add(1,"아침");
		System.out.println(meal);
	
	
	List<String>doing = new ArrayList<String>();
	if(doing.isEmpty()) {
		System.out.println("비어있는데용?");
		}
	doing.add("운동하기");
	doing.add("책 읽기");
	if(doing.contains("코딩하기")) {
		System.out.println("없는데용?");
	}else {
		System.out.println("만들어드리죠");
		doing.add("코딩하기");
	}
	
	System.out.println(doing.indexOf("코딩하기"));
	if(doing.indexOf("영화보기")== -1) {
		doing.add("영화보기");
	}
	System.out.println(doing);

	
	}


}
