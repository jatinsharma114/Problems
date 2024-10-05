package com.example.autowire.StringQuestions;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {

        String s1 = "cba";
        char[] charArray = s1.toCharArray();

        for (int i =0; i< s1.length(); i++) {

            for (int j = i+1; j < s1.length(); j++) {
                int c1 = (char) charArray[i]; // b = 98
                int c2 = (char) charArray[j]; // a = 97
                if(c1 > c2) { //Swap
                    char temp;
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(charArray));





    }
}
