package com.gn.homework.loop;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Practice a = new Practice();
		
		System.out.println("2.구구단 무한반복");
		System.out.println("3.탈출합시다");
		System.out.println("6.트리 만들기");
		System.out.println("7.박수박수박");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("선택 : ");
		int a1 = sc.nextInt();
		switch(a1) {
		case 2 : a.practice02(); break;
		case 3 : a.practice03(); break;
		}
		

	}

}
