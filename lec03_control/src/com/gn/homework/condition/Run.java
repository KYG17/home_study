package com.gn.homework.condition;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Practice a = new Practice();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("실행할 기능을 선택하세요!");
			System.out.println("1. 놀이동산 입장료 계산기");
			System.out.println("2. 일기예보");
			System.out.println("3. 세개의 정수 비교하기");
			System.out.println("4. 철수네 공장");
			System.out.println("5. 헬스 마니아 철수");
			System.out.println("6. 합격인가 불합격인가");
			System.out.print("선택 : ");
			int a1 = sc.nextInt();
			
			switch(a1) {
				case 1: a.playGround(); return;	
				case 2: a.weatherReport(); return;
				case 3: a.smallNum(); return;
				case 4: a.practice04(); return;
				case 5: a.practice05(); return;
				case 6: a.practice06(); return;
			}
		}
		

	}

}
