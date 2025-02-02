package com.gn.study.controller;

import com.gn.study.model.vo.Juice;
import com.gn.study.model.vo.Pizza;

public class Run {

	public static void main(String[] args) {
//		Dog d = new Dog();	
//		d.bark();
//		d.eat();
//		d.walk();
//		
//		Cat c = new Cat();
//		c.meow();
//		c.eat();
//		c.walk();
//		
//		Child c1 = new Child(1);
		
		Juice j = new Juice("트로피칼",500,"애플");
		j.juiceInfo();
		
		
		Pizza p = new Pizza();
		p.printInfo();

	}

}
