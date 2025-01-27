package com.gn.study;

import java.util.Scanner;

public class LoopStmt {

	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//		    System.out.println(i);
//		}
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1 ; i  <= num ; i++) {
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		int count1 = 10;
//		do {
//			System.out.print("출력1");
//			count1--;
//		}while(count1 > 0 && count1 < 10);

		// while문 사용한 경우
		int count2 = 10;
		while(count2 > 0 && count2 < 10) {
			System.out.print("출력2");
			count2--;
		}
		
		
		for (int i = 1; i <= 10; i++) {
		    if (i % 2 == 0) {
		        break; // 짝수를 만나면 전체 반복문 중지
		    }
		    System.out.println(i);
		}
		
		// continue문 사용 예시
		for (int i = 1; i <= 10; i++) {
		    if (i % 2 == 0) {
		        continue; // 짝수일 때는 반복 중지하고 다음 반복으로 넘어감
		    }
		    System.out.println(i);
		}
	}

}
