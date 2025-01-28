package com.gn.practice;

public class Practice03 {

	public static void main(String[] args) {
		int[] attend = {1,1,1,1,1,0,1,0,0,1};
		
		int a = 0 ;
		int b = 0 ;
		
		for(int i = 0 ; i < attend.length ; i ++) {
			if(attend[i] == 1) {
				a++;
			}else {
				b++;
			}
		}
		System.out.println("출석한 학생 수 : " + a);
		System.out.println("결석한 학생 수 : " + b);

	}

}
