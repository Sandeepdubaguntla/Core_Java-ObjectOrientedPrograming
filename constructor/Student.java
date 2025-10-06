package constructor;

public class Student {
	String name,gender;
	public Student(String name,String gender) {
		name=name;
		gender=gender;
		//it will print the local variable values
		System.out.println("Name1:" +name);
		System.out.println("Gender1:"+gender);
	}
	public void studentDetails() {
		//will get default values because instance/non-static
		//variable are not get initialized
		System.out.println("Name: " +name);
		System.out.println("Gender: "+gender);
	}
	public static void main(String[] args) {
		Student s= new Student("Sai", "male");
		s.studentDetails();
	}
}

//In the above program instance are non static varibles names and constructor variables names 
//are same. While initinalising local variable initialising itself because of ambiguty. , 
//So to resove this problem we use this keyword.