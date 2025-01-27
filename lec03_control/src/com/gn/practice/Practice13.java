package com.gn.practice;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("띄어쓰기 문장을 써 줘 : ");
		String word = sc.nextLine();
		
		for(int i = 0 ; i < word.length() ; i++) {
			char ch = word.charAt(i);
			
			if(ch == ' ') {
				continue;
			}
			System.out.print(ch);
		}

	}

}
