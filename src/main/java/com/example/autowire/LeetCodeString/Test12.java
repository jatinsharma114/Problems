package com.example.autowire.LeetCodeString;

public class Test12 {
    /**
     * Is Subsequence
     * @param args
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ahbgdc";
        /**
         * Pointers
         */
        int i = 0;
        int j = 0;

        while (i < s1.length() && j < s2.length()) {
            if(s1.charAt(i) ==  s2.charAt(j)) { // Both Pointer at the Same Location!!
                i++; // a==a : 1  /
                j++; // a==a : 1  /
            } else {
                j++;  //
            }
        }
        // End :
        if (s1.length() == i) {
            System.out.println("TRUE : " + i);
        }






    }
}
