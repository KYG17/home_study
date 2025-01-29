package com.gn.practice05.run;

import com.gn.practice05.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b = new Book();
		
		b.information();
		
		Book b1 = new Book("홍길동전","허균",5000);
		b1.information();
		
		Book b2 = new Book("채소 과일 레시피","박경희","터치아트",193000,01);
		b2.information();
		

	}

}
