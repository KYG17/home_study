package com.gn.practice;

public class Practice10 {

	public static void main(String[] args) {
		
		int result = 0;
		for(int i = 2 ; i <= 9 ; i++) {
			if(result == 27) {
				System.out.println("27이 나왔어요!");
				break;
			}
		
			for(int j = 1 ; j <= 9 ; j++) {
				result = i * j;
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}


	}

}
