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

//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (char ch : str1.toCharArray()) {
//            if(map.containsKey(ch)) {
//                map.put(ch, map.get(ch) +1);
//            } else {
//                map.put(ch, 1);
//            }
//        }
//        System.out.println(map);
//
//        int firstHigestValue = 0;
//
//
//        int maxvalue = 0;
//        for (Map.Entry<Character, Integer> entries : map.entrySet()) {
//            Integer value = entries.getValue();
//            if(value > maxvalue) {
//                maxvalue = value;//update the max value
//            }
//        }
//
//

//        String s2 = "successes";
//        String s1 = s2.trim();
//        char[] charArray = s1.toCharArray();
        /**
         * s u c c e s s e s
         * 0 1 2 3 4 5 6 7 8 = length= 9
         * s = 4
         *
         * 9 <= 9 --> INDEX 9 iS NOT PRESENT nAH!!!
         * 9 < 9 -> FALSE
         */

//        HashMap<Character, Integer> map = new HashMap<>();
//        int count = 0;
//        char saveChar;
//
//        for (int i = 0; i < charArray.length; i++) {
//            if(!map.containsKey(charArray[i])) {
//                // s
//                saveChar = charArray[i];
//                for (int j = i; j <= charArray.length-1; j++) {
//
//                    if(saveChar == charArray[j]) {
//                        count++;
//                    }
//                }
//
//                map.put(saveChar, count);
//                count = 0;
//            }
//        }
//
//        System.out.println(map);
//
//        int maxValue = 0;
//        char maxCharOccurance = ' ';
//        for (Map.Entry<Character, Integer> values : map.entrySet()) {
//            Integer value = values.getValue();
//            // 4 > 0
//            if(value > maxValue) {
//                maxValue = value;
//                maxCharOccurance = values.getKey();
//            }
//        }
//        System.out.println("key : " + maxCharOccurance + " Value : " + maxValue);
//



        String s1 = "success";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);









































    }
}
