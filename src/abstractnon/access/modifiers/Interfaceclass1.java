package abstractnon.access.modifiers;

public interface Interfaceclass1 {
	
public void printempDetails(String name, int id);

public void printempDetails1(String name, int id);

public default void getdata1() {
	
	System.out.println("Getdata1");
	getdata3();
	getdata2();
	
	
}

public static void getdata2() {
	
	System.out.println("Getdata2");
	getdata3();
	
	
	
}

private static void getdata3() {
	
	System.out.println("Getdata3");
	
	
}

	
	

}
