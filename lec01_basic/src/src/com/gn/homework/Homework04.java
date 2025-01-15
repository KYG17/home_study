package src.com.gn.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char one = sc.nextLine().charAt(0);
		
		int test = one;
		
		
		System.out.println("A의 유니코드 : " + test);

	}

}
