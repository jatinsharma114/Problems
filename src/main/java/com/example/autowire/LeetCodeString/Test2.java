package com.example.autowire.LeetCodeString;

public class Test2 {

    public static void main(String[] args) {

        String s1 = "leetcode";
        String toFind = "leet";

        int index = s1.indexOf(toFind);
        System.out.println(index);

        if(index == 0) {
            System.out.println("Present...");
        } else {
            System.out.println("not present...");
        }




    }
}
