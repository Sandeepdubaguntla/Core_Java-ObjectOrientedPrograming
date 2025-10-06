package constructor;

import java.util.Scanner;

public class StudentGrade {
	String name;
	int rollno;
	int m1,m2,m3;
	public StudentGrade(String arg1,int arg2,int mk1,int mk2,int mk3) {
		name=arg1;
		rollno=arg2;
		m1=mk1;
		m2=mk2;
		m3=mk3;
	}
	
	public void average(int m1,int m2,int m3) {
		int sum=m1+m2+m3;
		int avg=sum/300 *100;
		if(avg>=85)
			System.out.println("Grade A");
		else if(avg>=75)
			System.out.println("Grade B");
		else if(avg>=65)
			System.out.println("Grade C");
		else if(avg>=55)
			System.out.println("Grade D");
		else
			System.out.println("Fail");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.nextLine();
		System.out.println("Enter your Roll no");
		int rollno=sc.nextInt();
		System.out.println("Enter your Marks of 3 subjects.. : ");
		int m1=sc.nextInt(),m2=sc.nextInt(),m3=sc.nextInt();
		StudentGrade sg=new StudentGrade(name, rollno,m1,m2,m3);
		sg.average(m1,m2,m3);
		sc.close();
		
	}
}
