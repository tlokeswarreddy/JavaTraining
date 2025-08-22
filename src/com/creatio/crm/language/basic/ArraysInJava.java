package com.creatio.crm.language.basic;

public class ArraysInJava {

	public static void main(String[] args) {

		// 1. One Dimensional Array

		String[] names = { "loki", "Roja", "Aadvika" };

		System.out.println(names[0] + "\n" + names[1] + "\n" + names[2] + "\n");

		String[] dob = new String[3];

		dob[0] = "06";
		dob[1] = "05";
		dob[2] = "03";

		System.out.println(dob[0] + "\n" + dob[1] + "\n" + dob[2] + "\n");

		// 2. two Dimensional Array

		String[][] names1 = { { "loki", "Roja", "Aadvika" }, { "06", "05", "03" } };

		System.out.println(names1[0][0] + "\n" + names1[1][1] + "\n" + names1[0][2] + "\n");

		String[][] dob1 = new String[2][3];

		dob1[0][0] = "loki";
		dob1[0][1] = "Roja";
		dob1[0][2] = "Aadvika";
		dob1[1][0] = "06";
		dob1[1][1] = "05";
		dob1[1][2] = "03";

		System.out.println(dob1[0][1] + "\n" + dob1[1][0] + "\n" + dob1[1][2] + "\n");

		// Three DImensional Array

		String[][][] names2 = { 
				{ 
					{ "loki", "Roja", "Aadvika" }, 
					{ "06", "05", "03" } 
					},
				{ 
						{ "loki1", "Roja1", "Aadvika1" }, 
						{ "06n", "05n", "03n" } 
						} 
					};
		
		

		System.out.println(names2[1][0][1] + "\n" + names2[0][0][2] + "\n" + names2[1][0][2] + "\n");
		
		
		String[][][] dob2 = new String[2][3][2];


	}

}
