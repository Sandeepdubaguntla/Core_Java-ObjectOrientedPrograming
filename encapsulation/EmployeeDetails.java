package com.encapsulation;

public class EmployeeDetails {
	
	private String empId;
	String name;
	private double salary;
	String designation;
	String companyName;
	
	public EmployeeDetails(String name,String designation,String companyName) {
		
		this.name=name;
		this.designation=designation;
		this.companyName=companyName;
	
	}
	public String getEmpid() {
		return this.empId;
	}
	public void setEmpid(String empId) {
		this.empId=empId;
	}
	public double getSal() {
		return this.salary;
	}
	public void setSal(double salary) {
		this.salary=salary;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
