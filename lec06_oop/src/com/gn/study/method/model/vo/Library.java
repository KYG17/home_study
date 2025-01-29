package com.gn.study.method.model.vo;

public class Library {
	
	public void borrowBooks(int lateFee,String...books) {
		System.out.println("===대출할 책 목록===");
		System.out.println("총 연제료 : " +lateFee+" 원");
		for(String book : books) {
			System.out.println("-" + book);
		}
	}

}
