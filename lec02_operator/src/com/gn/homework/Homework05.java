package com.gn.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-) : ");
		String a = sc.nextLine();
		
		
		if(a.charAt(7) == '1' || a.charAt(7) == '3' ) {
			System.out.println("입력하신 주민번호는 남성입니다.");
		}else if(a.charAt(7) == '2' || a.charAt(7) == '4' ) {
			System.out.println("입력하신 주민번호는 여성입니다.");
		}else {
			System.out.println("입력하신 주민번호는 잘못된 값입니다.");
		}
		
	

	}

}
