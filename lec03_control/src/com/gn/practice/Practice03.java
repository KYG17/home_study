package com.gn.practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적 입력 : ");
		int grade = sc.nextInt();
		
		if(grade > 90) {
			System.out.println("당신의 학점은 A입니다");
		}else if(grade > 80 && grade <=90) {
			System.out.println("당신의 학점은 B입니다");
		}else if(grade > 70 && grade <= 80) {
			System.out.println("당신의 학점은 C입니다");
		}else if(grade > 60 && grade <= 70) {
			System.out.println("당신의 학점은 D입니다");
		}else {
			System.out.println("F");
		}
		
	}

}
