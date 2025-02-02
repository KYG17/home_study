package com.gn.homework07.controller;

import com.gn.homework07.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpNo(100);
		System.out.println("사번 : " + e.getEmpNo());
		e.setDept("영업부");
		System.out.println("부서 : " + e.getDept());
		e.setJob("과장");
		System.out.println("직급 : " + e.getJob());
		e.setAge(25);
		System.out.println("나이 : " + e.getAge());
		e.setSalary(3000000);
		System.out.println("월급 : " + e.getSalary());
		e.setPhone("010-2025-6584");
		System.out.println("전화번호 : " + e.getPhone());
		e.setAddress("서울시 강남구");
		System.out.println("주소 : " + e.getAddress());
		
		
		
		
		
		
		
	}
	



}
