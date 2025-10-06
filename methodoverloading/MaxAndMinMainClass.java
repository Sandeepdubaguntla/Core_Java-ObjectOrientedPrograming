package methodoverloading;

public class MaxAndMinMainClass {
	public static void main(String[] args) {
		MaxAndMin m=new MaxAndMin();
		
		System.out.println(m.max(9, 5.0, 2));
		System.out.println(m.min(2, 9.0, 5));
	}
}
