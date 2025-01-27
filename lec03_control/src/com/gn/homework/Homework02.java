package com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===일기예보===");
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temp = sc.nextInt();
		
		if(month >= 1 && month <= 2 || month == 12 ) {
			if(temp <= -12 && temp >= -14) {
				System.out.println("한파 주의보");
			}else {
				if(temp <= - 15) {
					System.out.println("한파 경보");
				}
			}
		}else if(month >= 6 && month <= 8){
			if(temp >= 33 && temp <= 34) {
				System.out.println("폭염주의보");
			}else {
				if(temp >= 35) {
					System.out.println("폭염 경보");
				}
			}
		}else if(month >= 3 && month <= 5) {
			System.out.println("봄봄봄 봄이 왔어요");
		}else if(month >= 9 && month <=11) {
			System.out.println("가을이네요~!");
		}else {
			System.out.println("잘못된 번호를 눌렀어요");
		}
		

	}

}
