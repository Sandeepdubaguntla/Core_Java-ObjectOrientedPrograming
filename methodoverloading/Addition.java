package methodoverloading;

public class Addition {
	
	public static int addition(int a,int b) {
		return a+b;
	}
	public static double addition(int a,int b,int c) {
		return a+b+c;
	}
	public static int addition(int a,int b,int c, int d) {
		return a+b+c+d;
	}
}
