package com.gn.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===3개의 정수 비교하기");
		System.out.print("첫 번쨰 정수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int c = sc.nextInt();
		
		int small = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
		
		System.out.println("세 수 중에서 가장 작은 수는 " + small 
				+ "입니다");
	
	}

}
