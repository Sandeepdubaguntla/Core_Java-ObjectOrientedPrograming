package methodoverloading;

import java.util.Scanner;

public class CalculatorProgram {
	Scanner sc=new Scanner(System.in);

	static int add(int... numbers) 
	{
		int sum=0;
		for(int n:numbers) {
			sum=sum+n;
		}
		return sum;
	}
	static int sub(int... numbers) {
	    if (numbers.length == 0) {
	        return 0; 
	    }
	    int diff = numbers[0];
	    for (int i = 1; i < numbers.length; i++) {
	        diff -= numbers[i];
	    }
	    return diff;
	}

	static int mul(int... numbers) {
	    if (numbers.length == 0) {
	        return 1;
	    }
	    int pro = 1;
	    for (int n : numbers) {
	        pro *= n;
	    }
	    return pro;
	}
	static int div(int... numbers)
	{
		int div = numbers[0];
	    for (int i = 1; i < numbers.length; i++) {
	        div /= numbers[i];
	    }
	    return div;
	}
	static int mod(int... numbers)
	{
		int mod = numbers[0];
	    for (int i = 1; i < numbers.length; i++) {
	        mod %= numbers[i];
	    }
	    return mod;
	}

}
