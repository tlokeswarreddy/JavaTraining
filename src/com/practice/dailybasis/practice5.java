package com.practice.dailybasis;

public class practice5 {
	  /*
     * Example 1: Input: x = 2.00000, n = 10 Output: 1024.00000
     * Example 2: Input: x = 2.10000, n = 3 Output: 9.26100
     * Example 3: Input: x = 2.00000, n = -2 Output: 0.25000 Explanation: 2^(-2) = 1/2^2 = 1/4 = 0.25
     */

    public static void main(String[] args) {
        double input = 2.00000;
        int power = -2;

        double output;
        if (power >= 0) {
            output = calculatePower(input, power);
        } else {
            output = 1 / calculatePower(input, -power);
        }

        System.out.println(output);
    }

    // Common method for calculating power (only for positive exponents)
    public static double calculatePower(double base, int exponent) {
        double result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}