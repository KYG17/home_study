package com.gn.study.method.model.vo;

public class SmartPhone {
	
	//1.반환형 x 매개변수 x
	public void openApp() {
		System.out.println("앱이 열렸습니다!");
	}
	
	//2.반환형 O 매개변수 x
	public int checkBatteryLevel() {
		int battery = 85;
		return battery;
	}
	
	//3.반환형 X 매개변수 O
	public void setVolume(int x) {
	System.out.println("볼륨이" + x + "로 설정");
	}
	
	//3.반환형 o 매개변수 o
	public String sendMsg(String msg) {
		return "메시지 \""+ msg+"\"가 전송되었습니다";
	}
	
}
