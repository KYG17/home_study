package com.gn.homework.condition;

import java.util.Scanner;

public class Practice {
		
	public void playGround() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===놀이동산 입장료 계산하기===");
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 3) {
			result = "무료";
		}else if(age  >= 3 && age <= 12) {
			result = "10000원";
		}else if(age >= 13 && age <=18) {
			result = "20000원";
		}else if(age >=19 && age <=64) {
			result = "30000원";
		}else {
			result = "무료";
		}
		System.out.println("당신의 놀이동산 요금은 " + result + " 입니다" );

	}
	
	
	public void weatherReport() {
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
	
	public void smallNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===3개의 정수 비교하기");
		System.out.print("첫 번쨰 정수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int c = sc.nextInt();
		
		int small = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
		
		System.out.println("세 수 중에서 가장 작은 수는 " + small 
				+ "입니다");
	}
	
	public void practice04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===철수네 공장===");
		System.out.print("수집된 코드 : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 400 : System.out.println("잘못된 요청입니다");; break;
		case 404 : System.out.println("요청하신 서비스를 찾을 수 없습니다"); break;
		case 500 : System.out.println("처리 방법을 알 수 없는 문제가 발생하였습니다"); break;
		case 503 : System.out.println("일시적인 서버 오류가 발생하였습니다"); break;
		default : System.out.println("알수없는 오류가 발생하였습니다"); break;
		
		}
	}
	
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.스쿼트");
		System.out.println("2.데드리프트");
		System.out.println("3.벤치 프레스");
		System.out.println("4.풀업");
		System.out.println("5.종료");
		System.out.print("번호 : ");
		int a = sc.nextInt();
		String b = "";
		if(a == 1) {
			b = "스쿼트";
			System.out.println(b + "운동 시간 입니다");	
		}else if(a == 2) {
			b = "데드리프트";
			System.out.println(b + "운동 시간 입니다");	
		}else if (a == 3) {
			b = "벤치프레스";
			System.out.println(b + "운동 시간 입니다");	
		}else if (a == 4) {
			b = "플업";
			System.out.println(b + "운동 시간 입니다");	
		}else if (a == 5) {
			System.out.println("종료하겠습니다");
		}else if (a < 0 || a == 0) {
			System.out.println("양수만 입력해주세요");
		}else {
			if(a > 5) {
				System.out.println("목록에 있는 숫자만 입력해주세요");
			}
		}
		
	}
	
	public void practice06() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===합격인가? 불합격인가?===");
		System.out.println("각 과목의 점수를 입력하세요");
		
		System.out.print("소프트웨어설계 점수: ");
		int a = sc.nextInt();
		System.out.print("소프트웨어개발 점수: ");
		int b = sc.nextInt();
		System.out.print("데이터베이스구축 점수: ");
		int c = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수: ");
		int d = sc.nextInt();
		System.out.print("정보시스템구축관리 점수: ");
		int e = sc.nextInt();
		
		int avg = (a+b+c+d+e) / 5 ;
		
		if(avg <= 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다");
		}else if(a <= 40 ) {
			System.out.println("소프트웨어설계 과락 불합");
		}else if(b <= 40) {
			System.out.println("소프트웨어개발 과락 불합");
		}else if(c <= 40) {
			System.out.println("데이터베이스 과락 불합");	
		}else if(d <= 40) {
			System.out.println("프로그래밍언어활용 과락 불합");
		}else if(e <= 40) {
			System.out.println("정보시스템구축관리 과락 불합");
		}else {
			System.out.println("합격을 축하합니다!");
		}

	}
	
	
	
	
	
	
}
