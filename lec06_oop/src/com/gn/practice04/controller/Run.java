package com.gn.practice04.controller;

import com.gn.practice04.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		Car c = new  Car();
		
		c.StartEngine();
		c.setSpeed(80);
		
		int s = c.checkSpeed();
		System.out.println("기본 자동차 속도(" + s +")");
		String result = c.setDestination("서울");
		System.out.println(result);
				

	}

}
