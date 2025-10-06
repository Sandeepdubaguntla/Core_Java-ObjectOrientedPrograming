package com.methodoverriding;

import java.util.Random;

public class AdvancedAtmPinLogic extends BasicAtmPinLogic {
	
	@Override
	public void atmPin() throws InterruptedException {
		System.out.println("Insert your Card...");
		Thread.sleep(5000);
		System.out.println("Do not remove the card...  Card is under processing");
		Thread.sleep(5000);
		System.out.println("Enter 4 digit Pin Number");
		int pinNumber=sc.nextInt();
		if(BasicAtmPinLogic.pinNumber==pinNumber) {
			int otp =new Random().nextInt(10000);
			System.out.println("OTP:"+otp+" Shared from atm KPHB 5th phase");
			Thread.sleep(3000);
			System.out.println("Please enter the received otp");
			if(otp==sc.nextInt()) {
				System.out.println("Enter Amount in multiples of 100");
				double amount=sc.nextDouble();
				if(amount % 100 == 0) {
				if(totalBalance>=amount) {
					totalBalance=totalBalance-amount;
					System.out.println("Transaction Sucessfull...");
					System.out.println("Remaining Balance :"+totalBalance);
				}
				else
				System.out.println("Insufficient Funds");
				}
				else {
					System.out.println("The Amount you entered is not in multiples of 100, Please try again...");
				}
			}
			else {
				System.out.println("Invalid otp... please enter valid otp");
			}
		}
		else {
			System.out.println("You have entered wrong Pin Number... please conform if it is you, while entering the given code number, which is received on your registered mobile number");
			int codeNumber= new Random().nextInt(100);
			System.out.println("CODE NUMBER: "+codeNumber);
			System.out.println("Enter the received code number");
			if(codeNumber==sc.nextInt()) {
				System.out.println("Thanks for Conforming...");
			}else {
				System.out.println("User this message is from the ATM from KPHB 5th Phase ,someone is trying to access your Card please give police complaint");
			}
		}
	}

}
