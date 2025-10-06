package constructor;

//import java.util.Scanner;

public class ThisKeyWord {
	
	String name,gender;
	ThisKeyWord(String name,String gender){
		this.name=name;
		this.gender=gender;
	}
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		ThisKeyWord s = new ThisKeyWord("Sai", "male");
		System.out.println("Name : " +s.name);
		System.out.println("Gender: "+s.gender);
	}

}
