package com.abstraction;

public class Child extends Parent {

	int b;
	Child(int a,int b){
		super(a);
		this.b=b;
	}
	
	@Override
	public void test() {
		System.out.println("Implementation of Parent class test method");
	}
	

}
