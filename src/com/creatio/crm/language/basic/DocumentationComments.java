package com.creatio.crm.language.basic;

public class DocumentationComments {

	public static void main(String[] args) {
		
		System.out.println(CalculateInterest(1000000,9,24));
	
	}
	
	/**
	 * @author lokeswara.reddy
	 * This method returns the interest amount of given amount & interestrate & months
	 * 
	 * @param amount 
	 * @param interestrate
	 * @param months
	 * @return
	 */
	
	public static int CalculateInterest(int amount, int interestrate, int months ) {
		
		
		int Intrest=(amount * interestrate * months/100)/12;
		return Intrest; 
		
		
		
		
	}

}
