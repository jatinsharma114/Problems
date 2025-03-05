package com.example.autowire.LeetCodeString;

import java.util.HashSet;
import java.util.Set;

public class Test5 {
    /**
     * Leetcode | 2506. Count Pairs Of Similar Strings |
     */
    public static void main(String[] args) {

        String []words =  {"abca", "cba", "xxx", "cab"}; // Index L-1 = 4-1 => 3 ok!
        int count = 0; // 1 -
        for (int i =0; i < words.length-1 ; i++) { //  // Index (L-1)
            for(int j = i+1; j < words.length ; j++) { // +1 --> (L)

                char[] charArray = words[i].toCharArray();
                char[] charArray1 = words[j].toCharArray();

                boolean similarValue = similarWord(charArray, charArray1);
                if(similarValue) {
                    count++;
                }
            }
        }
        System.out.println("similar count : " + count);
    }

    private static boolean similarWord( char[] charArray, char[] charArray1) {
        Set<Character> set1 = new HashSet<>();
        for(char ch : charArray) {
            set1.add(ch);
        }
        Set<Character> set2 = new HashSet<>();
        for(char ch : charArray1) {
            set2.add(ch);
        }
        if(set1.equals(set2)) {
            return true;
        }
        return false;
    }


}
