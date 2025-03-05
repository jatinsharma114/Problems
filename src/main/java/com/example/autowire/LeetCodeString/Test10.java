package com.example.autowire.LeetCodeString;

public class Test10 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";

        int total = 0; // 300
        for (int i =0 ; i < s1.length(); i++) {
            total = total +  s1.charAt(i); //  0 + 12 --- 12 + 39 --- 67 + ..... = 300
        }

        for (int i =0 ; i < s2.length(); i++) {
            total = total -  s2.charAt(i); // 300 - 280 = 20  = 20 == (char) 20 --> e
        }
        System.out.println((char) total);

    }
}
