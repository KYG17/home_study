package com.gn.homework.dimensional;

import java.util.Scanner;

public class Practice {

		public void practice01() {
			int [] arr = {152, 180, 165, 158, 171};
			for(int i = 0 ; i < arr.length-1 ; i++) {
				for(int j = i+1 ; j < arr.length ; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.println(arr[i]);
			}
	}
		
		public void practice02() {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 : ");
			int a = sc.nextInt();
			
			//입력받은 길이의 정수형 배열 선언
			int [] arr = new int [a];
			
			//입력받은 배열의 길이만큼 정수값을 입력 받아 순서대로 인덱스에 값 초기화
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.print("배열" +i+"번째 인덱스에 넣을 값 : ");
				arr[i] = sc.nextInt();
			}
			//인덱스 값 출력
			for(int i = 0 ; i < arr.length ; i ++) {
				System.out.println(arr[i]);
			}
			
			//인덱스 총합
			int num = 0;
			for(int i = 0 ; i < arr.length ; i++) {
				num += arr[i];
			}
			System.out.println("총합 : " + num);
			
		}
		
		

}
