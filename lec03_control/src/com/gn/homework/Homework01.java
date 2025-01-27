package com.gn.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===놀이동산 입장료 계산하기===");
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 3) {
			result = "무료";
		}else if(age  >= 3 && age <= 12) {
			result = "10000원";
		}else if(age >= 13 && age <=18) {
			result = "20000원";
		}else if(age >=19 && age <=64) {
			result = "30000원";
		}else {
			result = "무료";
		}
		System.out.println("당신의 놀이동산 요금은 " + result + " 입니다" );

	}

}
