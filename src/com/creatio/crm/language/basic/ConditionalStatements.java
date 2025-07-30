package com.creatio.crm.language.basic;

public class ConditionalStatements {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if (a==b) {
			
			System.out.println("Yes both are equal");
		}
		
		else if (a>b) {
			
			System.out.println("Yes a  is greater than b ");
		}
		else if (a<=b) {
			
			System.out.println("Yes a  is less than b");
		}
		else {
			
			System.out.println("Yes both are not equal");
		}
		

	}

}
