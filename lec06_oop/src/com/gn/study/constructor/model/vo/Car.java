package com.gn.study.constructor.model.vo;

public class Car {
	private String brand;
	private String color;
	private int year;
	
	public Car() {};
	
	
	public Car(String brand,String color, int year) {
		this.brand = brand;
		this.color = color;
		this.year = year;
	}
}
