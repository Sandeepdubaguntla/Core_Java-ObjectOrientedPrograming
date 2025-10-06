package com.encapsulation;

public class studentmainclass {
	public static void main(String[]args)
	{
		student s1=new student("Shayam",963258741L);
		s1.setId("JSP123");
		s1.setmarks(67.65);
		System.out.println(s1.name);
		System.out.println(s1.mobileNumber);
		System.out.println(s1.getId());
		System.out.println(s1.getmarks());
	}
}
