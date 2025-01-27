package com.gn.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(F/M) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("머리(cm) : ");
		int hair = sc.nextInt();
		
		String result;
		
		if(gender == 'F') {
			if(hair <= 3){
				result = "합격";
			}else {
				result = "불합격";
			}
			System.out.println( result + "입니다");
		}else if(gender == 'M') {
			if(hair <= 3) {
				result = "합격";
			}else {
				result = "불합격";
			}
			System.out.println( result + "입니다");
		}

	}

}
