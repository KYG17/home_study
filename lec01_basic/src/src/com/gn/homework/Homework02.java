package src.com.gn.homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		double a = width * height ;
		double b = (width + height) * 2;
		
		System.out.printf("면적 : %.2f\n" , a );
		System.out.printf("둘레 : %.1f" , b);

	}

}
