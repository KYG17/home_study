package com.gn.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("친구의 수 : ");
		int a = sc.nextInt();
		System.out.println("사탕의 수 : ");
		int b = sc.nextInt();
		
		int each = b/a;
		int left = b%a;
		
		System.out.println("1인당 사탕 개수 : " + each + "개");
		System.out.println("남은 사탕 개수 : " + left + "개");
	}

}
