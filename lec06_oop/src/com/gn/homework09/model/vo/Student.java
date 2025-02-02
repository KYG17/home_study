package com.gn.homework09.model.vo;

public class Student {
	private static int studentNo = 0; ;
	private String name;
	private char classRoom;
	
	public Student () {
		studentNo++; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
	public char getClassRoom() {
		return classRoom;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
}
