package com.gn.homework01.controller;

import java.util.Scanner;

import com.gn.homework01.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student [] arr = new Student[10];
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("학년 : ");
			int a = sc.nextInt();
			System.out.print("반 : ");
			int b = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String c = sc.nextLine();
			System.out.print("국어점수 : ");
			int d = sc.nextInt();
			System.out.print("영어점수 : ");
			int e = sc.nextInt();
			System.out.print("수학 점수: ");
			int f = sc.nextInt();
			sc.nextLine();
			
			arr[count++] = new Student(a,b,c,d,e,f);
			
			System.out.print("계속 추가하시겠습니까?");
			String str = sc.nextLine();
			if("n".equals(str)||"N".equals(str)) {
				break;
			}
			
		}
		
		for(int i = 0 ; i < count ; i++) {
			arr[i].information();
		}
		

	}
}

