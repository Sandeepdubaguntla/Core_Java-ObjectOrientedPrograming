package com.methodoverriding;

import java.util.Scanner;

public class BasicAtmPinLogic {
	static Scanner sc=new Scanner(System.in);
	static int pinNumber=3456;
	double totalBalance = 2780;
	public void atmPin() throws InterruptedException {
		System.out.println("Insert your Card...");
		System.out.println("Dont remove the card...  Card is under processing");
		System.out.println("Enter 4 digit Pin Number");
		int pinNumber=sc.nextInt();
		if(BasicAtmPinLogic.pinNumber==pinNumber) {
			System.out.println("Enter Amount");
			double amount=sc.nextDouble();
			if(totalBalance>=amount) {
				totalBalance=totalBalance-amount;
				System.out.println("Remaining Balance :"+totalBalance);
			}
			System.out.println("Insufficient Funds");
		}
		else {
			System.out.println("Incorrect Pin Number");
		}
	}
}
