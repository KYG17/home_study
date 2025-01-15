package src.com.gn.practice;

public class Practice01 {

	public static void main(String[] args) {
		boolean isStudent = true;
		System.out.println(isStudent);
		char grade = 'F';
		System.out.println(grade);
		byte candy = 1;
		System.out.println(candy);
		short walk = 10;
		System.out.println(walk);
		int day = 200;
		System.out.println(day);
		long future = 2000000;
		System.out.println(future);
		float height = 182f;
		System.out.println(height);
		double score = 2.03;
		System.out.println(score);
		System.out.println("===================");
		String str1 = new String("감사");
		System.out.println(str1);
		String str2 = "감사";
		System.out.println(str2);
		String str3 = "감사"+"합니다";
		System.out.println(str3);
		String str4 = new String("감사"+"합니다");
		System.out.println(str4);
		String str5 = "감사"+100+"합니다";
		System.out.println(str5);
		String str6 = 100+"감사합니다";
		System.out.println(str6);
		System.out.println("===================");
		
		int num1 = 2;
		int num2 = 2;
		System.out.println("기본형 : "+(num1 == num2));
		String text1 = new String("apple");
		String text2 = new String("apple");
		System.out.println("참조형 : "+(text1 == text2));
		
		String real = "이거진짜찐최종";
		String status = real;
		 real = "이거진짜찐최종";
		System.out.println(status);

	}

}
