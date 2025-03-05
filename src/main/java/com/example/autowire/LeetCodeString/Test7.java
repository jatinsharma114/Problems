package com.example.autowire.LeetCodeString;

import java.util.Arrays;

public class Test7 {
    /**
     * Anagram Program
     */
    public static void main(String[] args) {

        String s1 = "keep";
        String s2 = "peek";

        char[] charArrayS1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArrayS1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArrayS1, charArray2)) {
            System.out.println("true ...");
        } else {
            System.out.println("false...");
        }



    }
}
