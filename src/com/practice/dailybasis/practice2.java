package com.practice.dailybasis;

public class practice2 {

	public static void main(String[] args) {
		int[] num = { 305, 1, 205, 300, 12, 34, 100, 1000, 900, 150, 160, 11, 36, 87, 99, 93, 200, 9, 201, 210, 250,
				5000, 4000 };

		int highestnumber = 0;
		int secondhighestnumber = 0;
		int thirdhighestnumber = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > highestnumber) {
				thirdhighestnumber = secondhighestnumber;
				secondhighestnumber = highestnumber;
				highestnumber = num[i];
			} else if (num[i] > secondhighestnumber && num[i] != highestnumber) {
				thirdhighestnumber = secondhighestnumber;
				secondhighestnumber = num[i];

			} else if (num[i] > thirdhighestnumber && num[i] != secondhighestnumber && num[i] != highestnumber) {

				thirdhighestnumber = num[i];
			}

		}
		System.out.println(highestnumber);
		System.out.println(secondhighestnumber);
		System.out.println(thirdhighestnumber);

	}

}
