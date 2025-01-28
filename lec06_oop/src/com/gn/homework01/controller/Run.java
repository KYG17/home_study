package com.gn.homework01.controller;

import com.gn.homework01.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name = "김철수";
		emp.team ="교육운영지원팀";
		System.out.println(emp.name + " " +emp.team);
		Employee emp1 = new Employee();
		
		emp1.name = "이영희";
		emp1.team = "경영지원팀";
		
		System.out.println(emp1.name + " " +emp1.team);

	}

}
