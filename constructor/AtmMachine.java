package constructor;

import java.util.Scanner;

public class AtmMachine {
	static Scanner sc=new Scanner(System.in);
	private long mobileNum;
	private int pin;
	private double amount;
	double withdralamount;
	
	public AtmMachine(double withdralamount) {
		super();
		this.withdralamount = withdralamount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void depositAmount() {
		System.out.println("Enter the amount to deposit");
		amount=sc.nextInt();
		setAmount(amount);
		
	}
	public void withdrawal(int withdrawalAmount,int pin) {
		System.out.println("Enter the amount to be withdrawal");
//		withdrawalAmount=sc.nextInt();
		System.out.println("Enter the atm pin");
		int exppin=sc.nextInt();
		
		
	}
}
