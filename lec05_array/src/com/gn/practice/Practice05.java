package com.gn.practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("길동이 : ");
		int a = sc.nextInt();
		
		int[] scores = {54,23};
		int[] finalScore = new int[scores.length+1];
		
		for(int i = 0 ; i < scores.length ; i ++) {
		
			finalScore[i] = scores[i];
		}
		
		for(int i = 0 ; i < finalScore.length ; i++) {
			finalScore[2]= a;
			System.out.println(finalScore[i]);
		}
		
		
		int sum = 0;
		int avg = 0;
		for (int i = 0 ; i < finalScore.length ; i++) {
			sum += finalScore[i];
			avg = sum/finalScore.length;
		}
		System.out.println("합 :" + sum);
		System.out.println("평군 : " + avg);

	}

}
