package relationshipsIsAHasA;

public class Student extends Parents{

	Name name; // Has-A Relationship
	String id;
	Subject s; // Has-A Relationship
	
	public Student(Name name,String id,Subject s,Father f,Mother m) {
		super(f,m);
		this.name=name;
		this.id=id;
		this.s=s;

	}
	
	public void studentDeteils() {
		System.out.println("Student Details");
		System.out.println("*******************************************");
		System.out.println("Name : "+name.firstName+""+name.middleName+""+name.lastName);
		System.out.println("ID : "+id);
		System.out.println("---------------------------");
		System.out.println("Parents Details:");
		System.out.println("Father Name: "+f.name.firstName+""+f.name.middleName+""+f.name.lastName+ " Father Age: "+f.age);
		System.out.println(" Mother Name: "+m.name.firstName+""+f.name.middleName+""+f.name.lastName+ " Mother Age: "+m.age);
		System.out.println("---------------------------");
		System.out.println("Subjects: ");
		System.out.println("Subject1:"+s.subject1+" Subject2:"+s.subject2+" Subject3: "+s.subject3+" Subject4: "+s.subject4+" Subject5: "+s.subject5);

	}
}
