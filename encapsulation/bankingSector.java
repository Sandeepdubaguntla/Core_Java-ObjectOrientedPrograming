package com.encapsulation;

import java.util.Scanner;

public class bankingSector {
Scanner sc=new Scanner(System.in);
	double mobileNumber;
	int pin;
	
	public double getmoilbleNumber()
	{
		return this.mobileNumber;
	}
	public double setmobileNumber(double mobileNumber)
	{
		return this.mobileNumber=mobileNumber;
	}
	public int getpin()
	{
		return this.pin;
	}
	public double setpin(int pin)
	{
		return this.pin=pin;
	}
	static int balance=1000;
	int chance=0;
	
	public void withdrawalammount() 
	{
		System.out.println("Enter the amount that you need "
				+ "to withdraw from your account");
		double withdraw=sc.nextDouble();
		
		if(balance<withdraw)
		{
			chance++;
			System.err.println("Insufficent amount in your account or entered pin is wrong");
			System.out.println("If you want to re-enter the amount?");
			System.out.println("There is only limited times of withdraw attempts and your have still remaining of "+(3-chance));
			System.out.println("If yes pls enter yes or else No");
							String retryresponse=sc.next();
			if(retryresponse.equalsIgnoreCase("yes"))
			{
				withdrawalammount();
			}//retryresponse
			else
			{
				System.exit(0);
			}//retryresponse
		}//withdraw amount checking
		else
		{
			System.out.println("Amount is withdrawed from your"
					+ " account successfully");
			System.out.println("Do You want to check the balance?");
			System.out.println("If yes pls enter yes or else No");
			
		}//withdraw amount checking
		
	}
	
}
