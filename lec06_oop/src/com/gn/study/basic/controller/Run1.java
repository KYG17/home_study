package com.gn.study.basic.controller;

import com.gn.study.method.model.vo.SmartPhone;

public class Run1 {

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		
		s.openApp();
		
		
		System.out.println("현재 배터리 잔량 : " + s.checkBatteryLevel());
		
		s.setVolume(15);
		
		String reuslt = s.sendMsg("자니?");
		System.out.println(reuslt);

	}

}
