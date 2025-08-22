package access.modifiers1;

public class AccessModifiers1 {
	
	public String name="Lokeswara Reddy";
	
	public void getname() {
		
		System.out.println("AAdvika Reddy");
		
	}
	
	public String names() {
		
		return name;
		
		
	}
	
public String replacename(String newname) {
		
		return name=newname;
		
		
	}
	

	public static void main(String[] args) {
		
		AccessModifiers1 obj=new AccessModifiers1();
		
		obj.getname();
		System.out.println(obj.name);
		
		

	}

}
