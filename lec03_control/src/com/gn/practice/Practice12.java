package com.gn.practice;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		int a = sc.nextInt();
		
		do {
			System.out.println(a);
			a++;
		}while(a > 0 && a <= 10);

	}

}
