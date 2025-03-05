package com.example.autowire.LeetCodeString;

import java.util.HashMap;

public class Test8 {
    /**
     * 387. First Unique Character in a String
     * @param args
     */
    public static void main(String[] args) {
        String s = "leetcode";
        int index = firstUniqChar(s);

        System.out.println("First unique character index: " + index);
    }
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Step 1: Count the frequency of each character
        for (char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;  // Return the index of the first unique character
            }
        }
        return -1; // If no unique character found
    }
}
