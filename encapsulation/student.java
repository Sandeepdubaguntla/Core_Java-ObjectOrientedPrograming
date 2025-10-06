package com.encapsulation;

public class student {
	String name;
	private String id;
	private double marks;
	long mobileNumber;
	
	public student(String name,long moblieNumber)
	{
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
	public String getId()
	{
		return this.id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public  double getmarks()
	{
		return this.marks;
	}
	
	public void setmarks(double d) {
		
		this.marks=marks;
	}
	
}
