package com.creatio.crm.language.basic;

import java.util.LinkedHashSet;
import java.util.Set;

public class LoopStatements {

	public static void main(String[] args) {
		//for loop
		//while loop
		//foreachloop
		//dowhile
		
		//for loop
		
		String name="lokeswara reddy";
		
		for(int i=0; i<10; i++) {
			
			
			System.out.println(i+"-"+name);
		}
		
		
		//while loop
		int i=0;
		
		while(i<10) {
			
			if(i==7){
			
			System.out.println(i);
			
			}
			
			i++;
			
		}
		//foreachloop
		
Set<String> empNames3 = new LinkedHashSet<String>();
		

		empNames3.add("Lokeswara reddy");
		empNames3.add("Roja");
		empNames3.add("Aadvika");
		
		empNames3.add(null);
		
		for(String emp:empNames3) {
			
			
			System.out.println(emp);
		}
		
		//do while loop
				int a=0;
				
				do {
					
					
					
					System.out.println("this is dowhile loop - "+a);
					
					
					
					a++;
					
				}
				while(a>10);
		

	}

}
