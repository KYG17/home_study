package com.gn.homework06.model.vo;

public class Rectangle {
	private int width = 1 ;
	private int height = 1;
	
	public Rectangle() {};
	
	public Rectangle(int width , int height){
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		return (width*2) + (height*2);
	}
	
	public int calcualteArea() {
		return width * height;
	}
	
	public void printInfo() {
		System.out.println(calculateRound());
		System.out.println(calcualteArea());
	}
	

}
