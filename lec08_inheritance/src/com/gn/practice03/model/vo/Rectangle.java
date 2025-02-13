package com.gn.practice03.model.vo;

public class Rectangle extends Point {
		private int width;
		private int height;
		
		public Rectangle() {
			super();
		};
		
		public Rectangle(int x, int y , int width, int height) {
			super(x,y);
			this.width = width;
			this.height = height;
		}
		@Override
		public void draw() {
			super.draw();
			System.out.println("면적 : " + height*width);
			System.out.println("둘레 : " + 2*(height+width));
		}
}
