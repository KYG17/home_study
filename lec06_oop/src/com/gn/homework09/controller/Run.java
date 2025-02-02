package com.gn.homework09.controller;

import com.gn.homework09.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("김철수");
		s.setClassRoom('A');
		
		System.out.println(s.getStudentNo()+s.getName() + " " + s.getClassRoom());
		
		Student s1 = new Student();
		
		s1.setName("홍길동");
		s1.setClassRoom('F');
		
		System.out.println(s.getStudentNo()+s1.getName() + " " + s1.getClassRoom());

	}

}
