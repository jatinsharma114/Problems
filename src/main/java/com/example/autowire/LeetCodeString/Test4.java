package com.example.autowire.LeetCodeString;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        /**
         * Palindrome string
         * rev kare toh same string aae.!!
         */
        String s1 = "leel";
        char[] charArray = s1.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i = s1.length()-1; i >= 0 ;i--) {
            sb.append(charArray[i]);
        }

        String string = sb.toString();
        if(string.equalsIgnoreCase(s1)) {
            System.out.println("true ");
        } else {
            System.out.println("false ");
        }


    }
}
