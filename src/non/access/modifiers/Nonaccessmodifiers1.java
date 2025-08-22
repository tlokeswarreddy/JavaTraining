package non.access.modifiers;

public class Nonaccessmodifiers1 {
	
	
		static String name="Lokeswara Reddy";
		
		public static String getname(String names) {
			
			return names;
			
			
		}
	

	public static void main(String[] args) {
		
		System.out.println(getname("Roja"));
		
		System.out.println(name);
		
		
	
	}

}
