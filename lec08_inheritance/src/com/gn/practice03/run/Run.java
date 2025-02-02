package com.gn.practice03.run;

import com.gn.practice03.model.vo.Circle;
import com.gn.practice03.model.vo.Rectangle;

public class Run {
	public static void main(String[] args) {
//		Point p = new Point(2,3);
//		p.draw();
		
//		Circle c = new Circle(3,3,4);
//		c.draw();
//		Rectangle r = new Rectangle(-1,-2,5,2);
//		r.draw();
		
		
//		
		
		Circle[]arr = new Circle[2];
		arr[0] = new Circle(1,2,3);
		arr[1] = new Circle(3,3,4);
		for(Circle a : arr) {
			a.draw();
		}
		
	}

}
