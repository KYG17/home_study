package com.gn.practice02.controller;

import com.gn.practice02.model.vo.Appliance;
import com.gn.practice02.model.vo.Refrigerator;
import com.gn.practice02.model.vo.WashingMachine;

public class Run {
	public static void main(String[] args) {
		Appliance a = new Appliance();
		a.turnOn();
		WashingMachine m = new WashingMachine();
		m.turnOn();
		Refrigerator r = new Refrigerator();
		r.turnOn();
	}
	

}
