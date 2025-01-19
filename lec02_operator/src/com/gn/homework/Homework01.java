package com.gn.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("말해보세요 : ");
		String say = sc.nextLine();
		
		boolean say1 = say.equals("간다");
		if(say1) {
			System.out.println("앵무새 : 온다");
		}else {
			System.out.println("앵무새 : 간다");
		}
		
		
		
//		System.out.println("말해보세요 : ");
//		String say = sc.nextLine();
//		
//		String b = "간다";
//		String c = "";
//		
//		if(say.equals(b)) {
//			c = "온다";
//		}else {
//			c = "간다";
//		}
//		
//		System.out.println("앵무새 : " + c);
//		
	
	
	
	
	}

}
