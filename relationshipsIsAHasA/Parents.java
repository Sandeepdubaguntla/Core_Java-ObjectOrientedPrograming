package relationshipsIsAHasA;

public class Parents {
	Father f; // Has-A Relationship (Composition)
	Mother m;  // Has-A Relationship (Composition)
	
	public Parents(Father f,Mother m) {
		this.f=f;
		this.m=m;
	}
}
