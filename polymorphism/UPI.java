package com.polymorphism;

public class UPI {
	
	public void paymentMode(Amazon amazon) {
		System.out.println("Enter the Amount");
		double amount=Amazon.sc.nextDouble();
		amazon.payment(amount);
	}
}
