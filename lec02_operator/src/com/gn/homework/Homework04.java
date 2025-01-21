package com.gn.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int a = sc.nextInt();
		System.out.print("수학 : ");
		int b = sc.nextInt();
		System.out.print("영어 : ");
		int c = sc.nextInt();
		int sum = a+b+c;
		int avg = (a+b+c)/3;
		
		System.out.println("합계 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		
		if(a >= 60 && b>=60 && c>=60 ) {
			if(avg >= 90) {
				System.out.println("휴대폰을 바꿀 수 있습니다");
			}else {
				System.out.println("평균 미달로 휴대폰을 바꿀 수 없습니다");
			}
		}else {
			System.out.println("휴대폰을 바꿀 수 없습니다");
		}

	}

}
