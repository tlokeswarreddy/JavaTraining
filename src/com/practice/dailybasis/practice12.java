package com.practice.dailybasis;

public class practice12 {



//Reverse a string
    public static void main(String[] args) {

    //find the  vowels in a string
        String str = "Hello World";

        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
           }
}
