package com.example.autowire.arrayInJava;

import java.util.HashMap;

public class Test28 {

    public static void main(String[] args) {

        String str = "aabbbb";

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        int maxCount = 0;
        char maxChar = ' ';

        // Step 1: Count occurrences of each character
        for (char ch : str.toCharArray()) {

            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);

            // Step 2: Track max occurring character
            if (charCountMap.get(ch) > maxCount) {
                maxCount = charCountMap.get(ch);
                maxChar = ch;
            }
        }
        System.out.println(maxChar);
        /**
         * charCountMap.getOrDefault(ch, 0)
         * If ch not found then return 0
         * otherwise return the Value of that ch - KEY
         *
         */










    }
}
