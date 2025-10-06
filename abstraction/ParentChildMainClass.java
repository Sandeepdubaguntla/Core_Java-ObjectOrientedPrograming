package com.abstraction;

public class ParentChildMainClass {
	public static void main(String[] args) {
		
	
	Parent p = new Child(10,20);
	p.test();
	System.out.println(p.a);
	}
}
