package com.gn.practice;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		boolean name1 = name.equals("Chulsu");
		System.out.println("(1) 영어 이름이 일치한가요 ? " + name1);
		
		boolean age1 = 20 <= age && age < 30 ;
		System.out.println("(2) 20대 인가요 ? " + age1);
		
		boolean both = name1 && age1;
		System.out.println("(3) 영어 이름이 일치하면서 동시에 20대인가요 ? " + both);
		

	}

}
