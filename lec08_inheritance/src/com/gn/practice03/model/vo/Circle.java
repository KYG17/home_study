package com.gn.practice03.model.vo;

public class Circle extends Point {
	private int radius;
	private final double pi = 3.14;
	
	public Circle() {
		super();
	}
	
	public Circle(int x , int y , int radius) {
		super(x,y);
		this.radius = radius;
	}
	@Override
	public void draw() {
		super.draw();
		double result = pi*radius*radius;
		
		System.out.printf("면적 : %.2f\n " , result);
		System.out.printf("둘레 : %.2f\n" , pi*radius*2);
	}

}
