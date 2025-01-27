package com.gn.practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int checkNum;
		
		System.out.print("입력 : ");
		checkNum = sc.nextInt();
		
		System.out.println("숫자 : " + checkNum);
		
		String result = "양수입니다";
		
		if(checkNum > 0) {
			System.out.println(result);
		}

	}

}
