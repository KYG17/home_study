package com.gn.homework.loop;

import java.util.Scanner;

public class Practice {
	
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
		
	}

}
