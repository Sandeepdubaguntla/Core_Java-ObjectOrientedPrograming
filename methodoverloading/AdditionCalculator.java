package methodoverloading;

import java.util.Scanner;

public class AdditionCalculator {
	//... -> varArgs to accept number of arguments
	static int add(int... numbers) // int numbers[]
	{
		int sum=0;
		for(int n:numbers) {
			sum=sum+n;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values to perform Addition with  space :");
		String numbers=sc.nextLine();
		String str[]=numbers.split(" ");
		int arguments[]=new int[str.length];
		
		for(int i=0;i<str.length;i++) {
			arguments[i] = Integer.parseInt(str[i]);
		}
		System.out.println(add(arguments));
		sc.close();
	}

}
