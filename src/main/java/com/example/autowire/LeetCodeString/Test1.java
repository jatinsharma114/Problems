package com.example.autowire.LeetCodeString;

public class Test1 {
    public static void main(String[] args) {

        String s1 = "Hello world";
        System.out.println(s1.length());
        String trimString = s1.trim();
        char[] charArray = trimString.toCharArray();
        System.out.println(charArray[0]); // H
        System.out.println(charArray.length);

        int count = 0 ;
        for(int i = trimString.length() -1;  i > 0 ; i--) {
            if(charArray[i] == ' ') {
                System.out.println("break---------");
                break;
            }
            count++;
        }

        System.out.println("count : " + count);




    }
}
