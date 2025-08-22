package finalnon.access.modifier;

public class FinalClass2 extends FinalClass1 {
	
public void Updatename(String names) {
		
		name="hyderabad";
		
	}

	public static void main(String[] args) {
		
		
		FinalClass2 obj= new FinalClass2();
		
		System.out.println(obj.name);
		obj.Updatename("Papa");
		System.out.println(obj.name);

	}

}
