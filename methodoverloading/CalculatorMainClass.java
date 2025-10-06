package methodoverloading;

import java.util.Scanner;

public class CalculatorMainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Calculator");
		System.out.println("*********************************************");
		System.out.println("Includes Following services choose accordingly...");
		System.out.println("1. Addition \n2. Substraction \n3. Multiplication \n4. Division \n5. Modulus");
		System.out.println("Select any one Operator...");
		int n=sc.nextInt();
		sc.nextLine();
		switch(n) 
		{
			case 1:{
						System.out.println("Addition is selected");
						System.out.println("Enter the values...");
						String numbers=sc.nextLine();
						String str[]=numbers.split(" ");
						int arguments[]=new int[str.length];
						
						for(int i=0;i<str.length;i++) {
							arguments[i] = Integer.parseInt(str[i]);
						}
						System.out.println(CalculatorProgram.add(arguments));
			        }
			        	break;
			        
			case 2:{
				        System.out.println("Substraction is selected");
						System.out.println("Enter the values...");
						String numbers=sc.nextLine();
						String str[]=numbers.split(" ");
						int arguments[]=new int[str.length];
						
						for(int i=0;i<str.length;i++) {
							arguments[i] = Integer.parseInt(str[i]);
						}
						System.out.println(CalculatorProgram.sub(arguments));
					}
		        		break;
			case 3:{
						System.out.println("Multiplication is selected");
						System.out.println("Enter the values...");
						String numbers=sc.nextLine();
						String str[]=numbers.split(" ");
						int arguments[]=new int[str.length];
						
						for(int i=0;i<str.length;i++) {
							arguments[i] = Integer.parseInt(str[i]);
						}
						System.out.println(CalculatorProgram.mul(arguments));
					}
			        	break;
			case 4:{
						System.out.println("Division is selected");
						System.out.println("Enter the values...");
						String numbers=sc.nextLine();
						String str[]=numbers.split(" ");
						int arguments[]=new int[str.length];
						
						for(int i=0;i<str.length;i++) {
							arguments[i] = Integer.parseInt(str[i]);
						}
						System.out.println(CalculatorProgram.div(arguments));
					}
			        	break;
			case 5:{
						System.out.println("Modulus is selected");
						System.out.println("Enter the values...");
						String numbers=sc.nextLine();
						String str[]=numbers.split(" ");
						int arguments[]=new int[str.length];
						
						for(int i=0;i<str.length;i++) {
							arguments[i] = Integer.parseInt(str[i]);
						}
						System.out.println(CalculatorProgram.mod(arguments));
					}
						break;
			        
			default:{
						System.out.println("Sorry sir you have entered an Invalid Input...");
			         }
		 }
		
		sc.close();
		
	}
}

