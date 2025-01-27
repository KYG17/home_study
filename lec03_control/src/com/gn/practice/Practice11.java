package com.gn.practice;

public class Practice11 {

	public static void main(String[] args) {
		int a = 1;
		while (a <= 5) {
			System.out.println("반복 횟수 : " + a);
			a++;
		}
		System.out.println("반복 종료!!");
		
		int count2 = 10;
		while(count2 > 0 && count2 < 10) {
			System.out.println("출력2");
			count2--;
		}
		
		int count1 = 10;
		do {
			System.out.print("출력1");
			count1--;
		}while(count1 > 0 && count1 < 10);

	}

}
