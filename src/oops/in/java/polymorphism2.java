package oops.in.java;

public class polymorphism2 extends polymorphism1 {
	
 public void Helper(int a,int b) {
		
		int c=a+b-1;
		System.out.println(c);
		
		
		
	}

	public static void main(String[] args) {
		polymorphism2 obj=new polymorphism2();
		
		obj.Helper(1, 2);

	}

}
