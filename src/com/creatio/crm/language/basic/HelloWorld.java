package com.creatio.crm.language.basic;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print the next line
		System.out.println("Hello World!");
		System.out.println(234442222+999788990);
		
		//Print the statements in the same line
		System.out.print("Hello World!");
		
		// Print the statements with addition of two values
		System.out.print(234442222+999788990);
		
		//Print the statements with the specific format
		System.out.printf(" My Name is %s Reddy and My Age is %d %n","Lokeswara",32);
		
		// Print the Statements with the decimal values
		System.out.format("pi values is %.1f %n", 3.14 );
		
		//Print the logs with time stamp
		
		Logger.getLogger("Mylogs").info("this is my first programming languages");
		Logger.getLogger("Mylogs").warning("this is my second programming languages");
		
		// Print the Error messages
		
		System.err.println("This is my first Error message");

	}

}
