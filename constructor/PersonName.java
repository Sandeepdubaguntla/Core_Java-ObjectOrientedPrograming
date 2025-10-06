package constructor;

import java.util.Scanner;

public class PersonName {
	// Constructor Overloading......
	
	String firstName,middleName , lastName;
	PersonName(String arg){
		
		firstName=arg;
	}
	PersonName(String arg,String arg1) {
		firstName=arg;
		lastName=arg1;
		
	}
	PersonName(String arg, String arg1,String arg2){
		firstName=arg;
		middleName=arg1;
		lastName=arg2;
	}
	void displayPersonName() {
		if(firstName!=null && middleName!=null && lastName != null) {
			System.out.println("Name = "+firstName+" "+middleName+" "+lastName);
		}
		else if(firstName!=null && lastName != null) {
			System.out.println("Name = "+firstName+" "+lastName);
		}
		else {
			System.out.println("Name = "+firstName);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your FirstName...");
		String firstName=sc.nextLine();
		//PersonName name=new PersonName(firstName);
		System.out.println("Do you have a Middle Name, please specify yes or no.");
		String middleNameStatus = sc.next();
		String middleName=null;
		if("yes".equalsIgnoreCase(middleNameStatus)) {
			System.out.println("Enter your Middle Name...");
			middleName=sc.nextLine();
		}
		System.out.println("Do you have a Last Name, please specify yes or no.");
		String lastNameStatus = sc.next();
		String lastName=null;
		if("yes".equalsIgnoreCase(lastNameStatus)) {
			System.out.println("Enter your Last Name...");
			sc.nextLine();
			lastName=sc.nextLine();
		}
		
		if(firstName!=null && middleName!=null && lastName != null) {
			PersonName fullname = new PersonName(firstName,middleName, lastName);
			fullname.displayPersonName();
		}
		else if(firstName!=null && lastName != null) {
			PersonName name = new PersonName(firstName, lastName);
			name.displayPersonName();
		}
		else {
			PersonName name = new PersonName(firstName);
			name.displayPersonName();
		}
		sc.close();
		
	}

}
