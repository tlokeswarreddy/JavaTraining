package abstractnon.access.modifiers;

public class Abstractnonaccessmodifiers2 extends Abstractnonaccessmodifiers1 {

	public static void main(String[] args) {
		
		Abstractnonaccessmodifiers1 obj=new Abstractnonaccessmodifiers2();
		
		obj.printempDetails("loki", 1234);
		
	}

	@Override
	public void printempDetails(String name, int id) {
		// TODO Auto-generated method stub
		
	}
	

}
