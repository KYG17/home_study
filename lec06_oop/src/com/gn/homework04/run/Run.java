package com.gn.homework04.run;

import com.gn.homework04.controller.ExMethodController;

public class Run {

	public static void main(String[] args) {
		ExMethodController exm = new ExMethodController();
		
		exm.practice01("규리야", "사랑해");
		
		
		ExMethodController exm1 = new ExMethodController();
		System.out.println(exm1.practice02());
		
		ExMethodController exm2 = new ExMethodController();
		int pra3 = exm2.practice03(2);
		System.out.println(pra3);

	}

}
