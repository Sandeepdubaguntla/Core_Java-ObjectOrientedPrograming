package com.polymorphism;

public class AmazonMainClass {
	
	public static void main(String[] args) {
		PhonePe pe=new PhonePe();
		GooglePay gpay=new GooglePay();
		AmazonPay apay=new AmazonPay();
		System.out.println(new Bank().name+" Welcome to UPI Payments");
		System.out.println("PhonePe--> enter 1");
		System.out.println("GooglePay--> enter 2");
		System.out.println("AmazonPay--> enter 3");
		System.out.println("Enter payment UPI mode number");
		int payOption=pe.sc.nextInt();
		UPI upi=new UPI();
		switch(payOption) {
		case 1: upi.paymentMode(pe);
				break;
		case 2: upi.paymentMode(gpay);
				break;
		case 3: upi.paymentMode(apay);
				break;
		}
	}
}
