package com.practice.dailybasis;

import java.util.Arrays;

public class practice3 {

	public static void main(String[] args) {
		int[] array = { 305, 1, 205, 300, 12, 34,6000, 100, 1000, 900, 150, 160, 11, 36, 87, 99, 93, 200, 9, 201, 210, 250,
				5000, 4000 };
		
		
		
		for(int i=0; i<array.length; i++) {
			
			for(int j=i+1; j<array.length;j++) {
				
				if(array[i]<array[j]) {
					
					
					array[i]=array[i]+array[j];//305+6000=6305
					array[j]=array[i]-array[j];//6305-6000=305
					array[i]=array[i]-array[j];//6305-305=6000
				}
				
				
				
				
				
			}
			
			
			
			
		}
		System.out.println(Arrays.toString(array));
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
		
		

	}

}
