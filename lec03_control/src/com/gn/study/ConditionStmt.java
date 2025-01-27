package com.gn.study;

public class ConditionStmt {

	public static void main(String[] args) {
//		int su = 5;
//		if(su > 3) {
//			int num =2;
//			System.out.println(su);
//			System.out.println(num);
//		}
		
//		int a = 50;
//		if(a >= 9) {
//			// 9보다 크거나 같은 수
//			System.out.println("9이상");
//		} else if(a >= 6) {
//			// 9보다 작은 수 중에서 6보다 크거나 같은 수
//			System.out.println("6,7,8");
//		} else if(a >= 3) {
//			// 9보다 작고, 6보다 작은 수 중에서
//			// 3보다 크거나 같은 수
//			System.out.println("3,4,5");
//		} else {
//			// 9보다 작고, 6보다 작고, 3보다 작은 수
//			System.out.println("3미만");
//		}
		
		int target = 3;
		if(target > 0) {
			System.out.println("양수입니다.");
			if(target % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
				if(target % 3 == 0) {
					System.out.println("3의 배수");
				}
			}	
		} else if(target < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		int x = 5;
		int y = 10;
		int z = 3;
		int large = (x < y) ? (x < z ? x : z) : (y < z ? y : z);
		System.out.println(large);
	}
	

}
