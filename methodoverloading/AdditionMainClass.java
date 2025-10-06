package methodoverloading;

import java.util.Scanner;

public class AdditionMainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many variables do you want to Enter:");
		int n=sc.nextInt();
		
		if(n==2) {
			System.out.println("Enter the "+n+" values: ");
			int a=sc.nextInt(),b=sc.nextInt();
			System.out.println("Sum of "+a+" "+b+"is : "+Addition.addition(a, b));
		}
		else if(n==3) {
			System.out.println("Enter the "+n+" values: ");
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			System.out.println(Addition.addition(a,b,c));
		}
		else if(n==4) {
			System.out.println("Enter the "+n+" values: ");
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
			System.out.println(Addition.addition(a,b,c,d));
		}
		else
			System.out.println("Sorry sir our calc is not capable for that......");
			System.exit(0);
		
		sc.close();
		
	}
}
