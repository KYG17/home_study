package com.gn.practice04.model.vo;

public class Car {
	
	public void StartEngine() {
		System.out.println("자동차 시동이 켜졌습니다");
	}
	
	public int checkSpeed() {
		return 50;
	}
	
	public void setSpeed(int x) {
		System.out.println("속도가" + x + "km/h 로 설정되었습니다");
	}
	
	public String setDestination(String des) {
		return "목적지가 설정되었습니다 : " + des;
	}

}
