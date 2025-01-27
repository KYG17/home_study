package com.gn.practice;

public class Practice06 {

	public static void main(String[] args) {
		System.out.println("===7단===");
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println("7 * " + i + " = " + 7 * i );
		}
//		
//		int i = 1; // 초기식 생략
//		for (; i <= 5; i++) {
//		    System.out.println(i);
//		}
		
		for (int i = 1; ; i++) { // 조건식 생략
			System.out.println(i);
			if(i >= 10){
				break;
			}
		}
	}

}
