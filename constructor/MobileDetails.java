package constructor;

import java.util.Scanner;

public class MobileDetails {
	String brand,colour;
	long mobnumber;
	public MobileDetails(String brand,String colour,long mobnumber) {
		this.brand=brand;
		this.colour=colour;
		this.mobnumber=mobnumber;
	}
	public void display(){
        System.out.println("Mobile details are :");
        System.out.println("Brand: "+brand);
        System.out.println("colour : "+colour);
        System.out.println("mobile Number : "+mobnumber);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Mobile Brand :");
        String brand= sc.nextLine();
        System.out.println("Enter your Mobile Colour :");
        String color= sc.next();
        System.out.println("Enter your Mobile Number");
        long mobNumber= sc.nextLong();
        MobileDetails m=new MobileDetails(brand,color,mobNumber);
        m.display();
        sc.close();

    }
}
