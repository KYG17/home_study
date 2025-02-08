package com.gn.homework01.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {};
	
	public Student(int grade,int classroom, String name , int kor ,int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
//	public void information() {
//		int result = this.kor + this.eng + this.math;
//		System.out.println("==="+this.grade+"학년 "+this.classroom+"반 " + this.name );
//		System.out.println("국어 : " + this.kor);
//		System.out.println("영어 : " + this.eng);
//		System.out.println("수학 : " + this.math);
//		System.out.println("평균 : " + result / 3);
//	}
	
	public String informaiton() {
		int avg = (kor + eng + math) / 3;
		return "국어 : " + this.kor + "점\n" +
			   "영어 : " + this.eng + "점\n" +
			   "수학 : " + this.math + "점\n" +
			   "평군 : " + avg +"점";
			   
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
