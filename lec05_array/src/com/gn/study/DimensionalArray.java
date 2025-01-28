package com.gn.study;

public class DimensionalArray {

	public static void main(String[] args) {
//		int[] age = new int[] {1,2,3,4};
//		
//		int[] age1 = {5,6,7,8};
//		
//		for(int i = 0 ; i < age.length ; i++) {
//			System.out.print(age[i]);
//		}
//		
		
		// 문자열 생성
//		String str = "Hello, world!";
//
//		// 문자열을 char 배열로 변환
//		char[] charArray = str.toCharArray();
//
//		// 변환된 배열 출력
//		for(int i = 0 ; i < charArray.length ; i++){
//			System.out.println(i+" : "+charArray[i]);
//		}
		
//		int[] numbers = {1, 2, 3, 4, 5};
////		for (int i = 0; i < numbers.length; i++) {
////		    System.out.println(numbers[i]);
////		}
//		
//		for (int number : numbers) {
//		    System.out.println(number);
//		}
		
//		int[] data = {8,4,1,3};
//		for(int i = 0 ; i < data.length -1 ; i++) {
//			// j를 i+1부터 시작하도록 수정
//			for(int j = i + 1 ; j < data.length ; j++) {
//				// 인접한 두 요소 비교 
//				// 필요에 따라 위치 변경
//				if (data[i] > data[j]) {
//					int temp = data[i];
//					data[i] = data[j];
//					data[j] = temp;
//				}
//			}
//		}
//		// 출력해보기
//		for(int i = 0 ; i < data.length ; i++) {
//			System.out.println(i+" : "+data[i]);
//		}
//		
		
//		
//		int [] friendAge = {36,33,21,22,32};
//		
//		for(int i = 0 ; i < friendAge.length-1 ; i++) {
//			for(int j = i+1 ; j < friendAge.length ; j++) {
//				if(friendAge[i] > friendAge[j]) {
//					int temp = friendAge[i];
//					friendAge[i] = friendAge[j];
//					friendAge[j] = temp;
//				}
//			}
//		}
//		for(int i = 0 ; i < friendAge.length ; i++) {
//		System.out.println(i + " : " + friendAge[i]);
//
//	}
		
//		int[] arr1 = {5,6,7,8};
//		int[] arr2 = arr1;
//		arr2[3] = 123;
//		for(int i = 0 ; i < arr1.length ; i ++) {
//			System.out.println(arr1[i]);
//		}
//		System.out.println("arr1[3] : "+ arr1[3]);
//		System.out.println("arr2[3] : "+ arr2[3]);
		
		
		
//		int[] arr3 = {5,6,7,8};
//		int[] arr4 = new int[arr3.length];
//		
//		arr4[3] = 123;
//		System.out.println("arr3[3] : "+ arr3[3]);
//		System.out.println("arr4[3] : "+ arr4[3]);
//		for(int i = 0 ; i < arr3.length ; i++){
//			arr4[i] = arr3[i];
//			System.out.println(arr4[i]);
//		}
//		System.out.println();
//		for(int i = 0 ; i < arr4.length ; i++) {
//			System.out.print(arr4[i]);
//		}
//		
		
		int[] arr = {32,13,7,30,53,24,27};
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
	}
}
