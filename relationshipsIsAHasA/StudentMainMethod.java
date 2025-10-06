package relationshipsIsAHasA;

public class StudentMainMethod {

	public static void main(String[] args) {
		Name name1=new Name("Prasad ","","Dubaguntla");
		Name name2=new Name("Lakshmi ","Nagamani","Dubaguntla");
		Name name3=new Name("Sandeep ","","Dubaguntla");
		
		Father f=new Father(name1,41);
		
		Mother m =new Mother(name2,37);
		
//		Parents p=new Parents(f,m);
		
		Subject sub=new Subject("English","Telugu","Maths","Science","Social");
		
		Student student=new Student(name3,"2100030897",sub,f,m);
		
		student.studentDeteils();
		
		
		
	}
}
