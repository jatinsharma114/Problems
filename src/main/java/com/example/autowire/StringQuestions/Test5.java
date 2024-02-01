package com.example.autowire.StringQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {
    /**
     * Write a Java program to find the First most frequent character in a given string.
     * Write a Java program to find the second most frequent character in a given string.
     */
    public static void main(String[] args) {
        String str1 = "successes";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) +1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);

        int firstHigestValue = 0;


        int maxvalue = 0;
        for (Map.Entry<Character, Integer> entries : map.entrySet()) {
            Integer value = entries.getValue();
            if(value > maxvalue) {
                maxvalue = value;//update the max value
            }
        }






























    }
}
