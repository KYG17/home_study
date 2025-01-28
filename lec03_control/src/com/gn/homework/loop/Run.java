package com.gn.homework.loop;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Practice a = new Practice();
		System.out.println("1.1~50까지 짝수 합하기");
		System.out.println("2.구구단 무한반복");
		System.out.println("3.탈출합시다");
		System.out.println("4. 게임 재시작");
		System.out.println("5. 양수만 더하기");
		System.out.println("6.트리 만들기");
		System.out.println("7.박수박수박");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("선택 : ");
		int a1 = sc.nextInt();
		switch(a1) {
		case 1 : a.practice01(); break;
		case 2 : a.practice02(); break;
		case 3 : a.practice03(); break;
		case 4 : a.practice04(); break;
		case 5 : a.practice05(); break;
		case 7 : a.practice07(); break;
		}
		

	}

}
