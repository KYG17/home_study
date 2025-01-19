package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수 : ");
		int a = sc.nextInt();
		String b;
		if(a%2 == 0) {
			b ="짝수 ";
		}else {
			b ="홀수 ";
		}
        System.out.println("구슬의 개수는 "+ b + "입니다");
	}

}
