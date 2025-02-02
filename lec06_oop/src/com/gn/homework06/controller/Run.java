package com.gn.homework06.controller;

import com.gn.homework06.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.printInfo();
		
		Rectangle r2 = new Rectangle(5,3);
		r2.printInfo();

	}

}
