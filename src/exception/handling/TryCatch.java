package exception.handling;

public class TryCatch {

	public static void main(String[] args) {
		
		try{int a=10;
		int b=0;
		int c=a/b;
		
		System.out.println(c);
		} catch	(Exception e) {
			
			int a=20;
			int b=0;
			int c=a/b;
			
			System.out.println(c);
			
		}finally {
			
			System.out.println("this is final error");
		}
		
		
		
		

	}

}
