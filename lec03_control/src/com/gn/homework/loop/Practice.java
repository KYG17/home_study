package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	
	
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("숫자(0을 입력하면 종료): ");
			int a = sc.nextInt();
			if(a < 0) {
				continue;
			}
			if(a>0) {
					num += a;
			}
			if(a == 0) {
				System.out.println("양수의 합계 : " + num);
				break;
			}
		}
		
	}
	
	
	
	
	
	public void practice04() {
		Scanner sc = new Scanner(System.in);
		String a = "";
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			a = sc.nextLine();
		}while(a.equals("yes"));
		System.out.println("게임을 종료합니다!");
	}
		
	
	
	
	
	public void practice01() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("정수(1~50) : ");
		int a = sc.nextInt();
		if(a < 0 || a > 50) {
			System.out.println("1~50 사이의 정수를 입력하세요");
		}
		int result = 0;
		for(int i = 0 ; i <= a ; i++) {
			if(i % 2 == 0) {
				result += i;
			}
		}
		System.out.println("합계 : " + result); break;
	
		
		}
		
		
	}
	
	
	
	
	
	
	public void practice02() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			int a = sc.nextInt();
			if(a >= 10) {
				System.out.println("9 이하의 숫자만 입력해주세요"); continue;
			}else if(a < 0){
				System.out.println("양수만 입력해주세요"); continue;
			}else if(a == 0) {
				System.out.println("프로그램 종료!"); 
				break;
			}else {
				for(int i = a ; i <= a ; i++) {
					System.out.println("===" + a + "단===");
					for(int j = 1 ; j <= 9 ; j++){
						System.out.println(a + "*" + j + "=" + a*j);
					}
				}
				break;
			}
		}		
	}
	
	public void practice03() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력 : ");
			String a = sc.nextLine();
			System.out.println(a); 
			if(a.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	
	
	

	public void practice07() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("정수 : ");
			int a = sc.nextInt();
			if(a <= 0) {
				System.out.println("양수가 아닙니다"); continue;
			}
			for(int i = 0 ; i < a ; i++) {
				if(i % 2 == 0) {
					System.out.print("박");
				}else {
					System.out.print("수");
				}
			}
			break;
		}
			
	}
	
	
	
	
	

}
