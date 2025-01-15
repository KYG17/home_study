package src.com.gn.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		System.out.print("영어 : ");
		int b = sc.nextInt();
		System.out.print("수학 : ");
		int c = sc.nextInt();
		int sum = a+b+c;
		System.out.println("총점 : " + sum);
		int avg = (a+b+c) / 3;
		System.out.println("평균  " + avg );

	}

}
