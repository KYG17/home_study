package src.com.gn.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();
		
		char first = word.charAt(0);
		char second = word.charAt(1);
		char third = word.charAt(2);
		
		System.out.print(first);
		System.out.print(second);
		System.out.print(third);

	}

}
