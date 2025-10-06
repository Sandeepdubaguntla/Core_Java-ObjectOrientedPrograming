package com.methodoverriding;

public class AtmMainClass {
	public static void main(String[] args) throws InterruptedException {
//		BasicAtmPinLogic batm=new BasicAtmPinLogic();
//		batm.atmPin();
		
		AdvancedAtmPinLogic aAtm=new AdvancedAtmPinLogic();
		aAtm.atmPin();

	}
}
