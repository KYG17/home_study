package com.gn.practice05.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {}
	
	public Book(String title,String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String title,String author,String publisher,int price,double discountRate) {
		this.title = title;
		this.author= author;
		this.publisher = publisher;
		this.price = price;
		this.discountRate=discountRate;
	}
	
	public void information() {
		System.out.println("==="+this.title+"===");
		System.out.println("저자 : " + this.author );
		System.out.println("출판사 : " + this.publisher);
		System.out.println("가격 : " + this.price);
		System.out.println("할인울 : " + this.discountRate);
	}
	
	
	

}
