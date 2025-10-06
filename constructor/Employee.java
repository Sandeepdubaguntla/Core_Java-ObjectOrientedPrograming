package constructor;

import java.util.Scanner;

public class Employee {
	String name,eid,role,companyName;
	double salary;
	int exp;
	
	public Employee(String name,String eid,double salary,String role) {
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		this.role=role;
		
	}
	public Employee(String name,String eid,double salary,String role,int exp) {
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		this.role=role;
		this.exp=exp;
	}
	public Employee(String name,String eid,double salary,String role,int exp,String companyName) {
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		this.role=role;
		this.exp=exp;
		this.companyName=companyName;
	}
	public void employeeDetails() {
		if(name!=null && eid!=null && salary!=0.0 && role!=null && exp!=0 && companyName!=null){
			System.out.println("Name = "+name);
			System.out.println("Eid = "+eid);
			System.out.println("Salary = "+salary);
			System.out.println("Role = "+role);
			System.out.println("Experience = "+exp);
			System.out.println("Company Name = "+companyName);
		}
		else if(name!=null && eid!=null && salary!=0.0 && role!=null && exp!=0) {
			System.out.println("Name = "+name);
			System.out.println("Eid = "+eid);
			System.out.println("Salary = "+salary);
			System.out.println("Role = "+role);
			System.out.println("Experience = "+exp);
		}
		else{
			System.out.println("Name = "+name);
			System.out.println("Eid = "+eid);
			System.out.println("Salary = "+salary);
			System.out.println("Role = "+role);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name =sc.next();
		System.out.println("Enter the EmployeeId : ");
		String eid=sc.next();	
		System.out.println("Enter you Salary : ");
		double salary=sc.nextDouble();
		System.out.println("Enter you Role in the Company : ");
		String role=sc.next();
	
		System.out.println("Do you have Experience please mention 'yes' or 'no'....");
		String expStatus=sc.next();
		int exp = 0;
		if(expStatus.equalsIgnoreCase("yes")) {
			System.out.println("Enter you Experience : ");
			exp=sc.nextInt();
		}
	
		System.out.println("Can you Disclose you Company Name please mention 'yes' or 'no'....");
		String comStatus=sc.next();
		String companyName = "null";
		if(comStatus.equalsIgnoreCase("yes")) {
			System.out.println("Enter your Company Name : ");
			companyName=sc.next();
		}
		if(name!=null && eid!=null && salary!=0 && role!=null && exp!=0 && companyName!=null){
			Employee e2 = new Employee(name, eid, salary, role,exp,companyName);
			e2.employeeDetails();
		}	
		else if(name!=null && eid!=null && salary!=0 && role!=null && exp!=0 ) {
			Employee e1 = new Employee(name,eid,salary,role,exp);
			e1.employeeDetails();
		}
		else {
			Employee e = new Employee(name,eid,salary,role);
			e.employeeDetails();
		}
		sc.close();
		
	}
}
