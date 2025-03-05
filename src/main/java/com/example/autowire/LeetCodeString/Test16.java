package com.example.autowire.LeetCodeString;

public class Test16 {
    public static void main(String[] args) {
        /**
         * https://leetcode.com/problems/merge-strings-alternately/description/
         * 1768. Merge Strings Alternately
         */
        String word1 = "ab", word2 = "pqrs";
        String s = mergeAlternately(word1, word2);
        System.out.println(s);
    }

    public static String mergeAlternately(String v11, String v22) {
        int max = Math.max(v11.length(), v22.length());
        StringBuilder sb = new StringBuilder();

        int v1 = 0;
        int v2 = 0;

        for (int i =0; i < max; i++) {
            char[] charArray = v11.toCharArray(); // [a,b]
            char[] charArray1 = v22.toCharArray(); // [p,q,r,s]

            if(v1 < charArray.length) { // 0 < 2 (T)| 1 < 2 (T)| 2 < 2 (F)
                sb.append(charArray[i]);
                v1++;
            }
            if(v2 < charArray1.length) { //
                sb.append(charArray1[i]);
                v2++;
            }
        }
        return sb.toString();

    }
}
