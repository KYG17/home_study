package com.gn.homework.dimensional;

public class Practice {

		public void practice01() {
			int [] arr = {152, 180, 165, 158, 171};
			for(int i = 0 ; i < arr.length-1 ; i++) {
				for(int j = i+1 ; j < arr.length ; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.println(arr[i]);
			}
	}
		
		

}
