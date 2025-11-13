package access.modifiers2;

import access.modifiers1.AccessModifiers1;

public class AccessModifiers3 extends AccessModifiers1 {

	public static void main(String[] args) {
	AccessModifiers3 obj=new AccessModifiers3();
		
		System.out.println(obj.names());
		//System.out.println(obj.name);
		
		System.out.println(obj.replacename("Roja"));
		
		System.out.println(System.getProperty("user.dir"));

	}

}
