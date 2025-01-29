package com.gn.study.method.model.vo;

public class VendingMachine {
	
	//void
	public void sayHi() {
		System.out.println("안녕하세요");
	}
	
	//기본 자료형
	public int getBalance() {
		return 500;
	}
	
	public String[] sodaList() {
		return new String [] {"콜라","사이다","오렌지주스"};
	}
	
	public Soda selectedSsoda() {
		return new Soda();
	}
	
	

}
