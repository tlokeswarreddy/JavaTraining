package com.practice.dailybasis;

public class practiceforloops {

	public static void main(String[] args) {
		// Print Even and odd numbers upto 100 using for loop

		for (int i = 0; i <= 100; i++) {

			if (i % 2 == 0) {

				System.out.println("Evennumber - " + i);

			} else {

				System.out.println("Oddnumber - " + i);
			}

		}
		
		//print positive and negative numbers using for loop from given array
		
		int[] numbers= {1,2,4,5,-9,-7,10,-11,-12};
		
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i]>0) {
				
				System.out.println("Postive number - " + numbers[i]);
			}
			
			else{
				System.out.println("Negative number - " + numbers[i]);
				
			}
			
			
			
			
			
		}
		
		
		
		

	}

}
