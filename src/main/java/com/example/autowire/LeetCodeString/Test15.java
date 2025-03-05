package com.example.autowire.LeetCodeString;
public class Test15 {
    public static void main(String[] args) {
        /**
         * https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/
         * 2586. Count the Number of Vowel Strings in Range
         * O/P : 2
         */
        String[] words = {"are","amy","u"}; //Expected : 1
        int lef = 0;
        int right = 2;
        int index = vowelStrings(words, lef, right);
        System.out.println(index);

    }
    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String box = "aeiou";
        for(int i=left; i <= right; i++) {
            char c =  words[i].charAt(0); // a
            char c1 = words[i].charAt(words[i].length() - 1);
            if(box.indexOf(c) != -1 && box.indexOf(c1) != -1) {
                    count++;
            }
        }
        return count;
    }
}
