package com.gn.homework04.run;

import com.gn.homework04.controller.ExMethodController;

public class Run {

	public static void main(String[] args) {
		ExMethodController exm = new ExMethodController();
		
		exm.practice01("규리야", "사랑해");
		
		System.out.println("====================");
		ExMethodController exm1 = new ExMethodController();
		System.out.println(exm1.practice02());
		System.out.println("====================");
		ExMethodController exm2 = new ExMethodController();
		int pra3 = exm2.practice03(2);
		System.out.println(pra3);
		System.out.println("====================");
		ExMethodController exm3 = new ExMethodController();
		exm3.practice04("iloveyou", 'o');
		System.out.println("====================");
		
		
		ExMethodController exm4 = new ExMethodController();
		exm4.practice05(8);
		System.out.println("====================");

		ExMethodController exm5 = new ExMethodController();
		String reuslt = exm5.practice06("규리");
		System.out.println(reuslt);
	}

}
