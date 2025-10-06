package com.polymorphism;

public class GooglePay extends Amazon{
	Bank bank;
	int pinNumber=3456;
	double orderedAmount;
	
	@Override
	public void payment(double amount) {
		orderedAmount=amount;
		if(amount<=Bank.totalBalance) {
			System.out.println("Its been redirecting to the GooglePay");
			do {
				System.out.println("Enter you pin");
				int userPinNumber=sc.nextInt();
				if(userPinNumber==pinNumber) {
					bank.totalBalance=bank.totalBalance-amount;
					paymentMessage();
					break;
				}else {
					System.err.println("invalid pin number");
				}
			}while(true);
		}else {
			System.out.println("Insufficient balance");
		}
	}
	@Override
	public void paymentMessage() {
		System.out.println("Your order has been placed successful "+orderedAmount+" DEBITED from account number: "+bank.accountNumber+" remaining balance is "+bank.totalBalance);
		
	}

}
