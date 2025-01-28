package com.gn.study;

import java.util.Scanner;

public class LoopPr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
			System.out.print("문자열 : ");
			String a = sc.nextLine();
			System.out.println("문자 : ");
			char b = sc.nextLine().charAt(0);
			
			int count = 0;
			for(int i = 0 ; i < a.length(); i++) {
				System.out.println(a.charAt(i));
				if(a.charAt(i) == b) {
					count++;
				}
			}
			System.out.println("포함된 개수 : " + count);
		
	}

}
