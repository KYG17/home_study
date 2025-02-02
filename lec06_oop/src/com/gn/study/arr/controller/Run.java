package com.gn.study.arr.controller;

import com.gn.study.arr.Academy;

public class Run {

	public static void main(String[] args) {
		
		Academy [] arr1;
		arr1 = new Academy[2];
		Academy a = new Academy("규리학원","010-2025-6584");
		arr1[0] = a ;
		arr1[1] = new Academy("용규학원","010-1234-5678");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		
		Academy [] arr = new Academy[4];
		Academy [] arr2 = {
				new Academy("규리학원","010-2025-6584"),
				new Academy("용규학원","010-1234-5678")
		};
		
		for(int i = 0 ; i <arr2.length ; i++) {
			System.out.println(i + ":" + arr2[i].getname());
		}
	
		

	}

}
