package com.gn.study.basic.controller;

import com.gn.study.basic.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		Car c1 = new Car();
		
		c1.name = "소방차";
		System.out.println(c1.name);
		
		Car c2 = new Car();
		Car c3 = new Car();
		
	
		
		System.out.println(c1.brand);
		System.out.println(c2.brand);
		System.out.println(c3.brand);

	}

}
