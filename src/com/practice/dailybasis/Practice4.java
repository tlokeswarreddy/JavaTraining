package com.practice.dailybasis;

public class Practice4 {

	public static void main(String[] args) {
		int[] prices = {1,12,5,3,6,14};
		
		int maxProfit=0;
		int buyDay=0;
		int sellDay=0;
		
		for(int i=0; i<prices.length-1;i++){
			
			for(int j=i+1; j<prices.length; j++) {
				int profit=prices[j]-prices[i];
				
				if(maxProfit<profit) {
					maxProfit=profit;
					buyDay=i+1;
					sellDay=j+1;
					
					
				}
				
				
			}
			
			
			
			
		}
		System.out.println(maxProfit);
		System.out.println(buyDay);
		System.out.println(sellDay);

	}

}
