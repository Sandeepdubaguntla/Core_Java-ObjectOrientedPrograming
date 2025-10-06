package relationshipsIsAHasA;

public class Father {

	Name name; // Has-A Relationship (Composition)
	int age;
	
	public Father(Name name, int age) {
		this.name=name;
		this.age=age;
	}
}
