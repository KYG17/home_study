package src.com.gn.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게 : ");
		double kg = sc.nextDouble();
		System.out.print("키(m) : ");
		double m = sc. nextDouble();
		
		
		double result = kg / (m * m) ;
		
		System.out.printf("BMI 지수 : %.1f " , result);
	}

}
