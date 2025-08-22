package oops.in.java;

public class Keywordclasses2 extends Keywordclasses1 {
	
	String name="Lokeswar Reddy";
	
	
	public void getName(String name) {
		
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(this.name);
		
		
		
	}

	public static void main(String[] args) {
		Keywordclasses2 obj=new Keywordclasses2();
		
		obj.getName("Roja reddy");

	}

}
