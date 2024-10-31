package com.example.autowire.arrayInJava;

import java.util.HashSet;

public class Test15 {
    /**
     *
     * Longest Consecutive... 1-2-3-4-5  Longest
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Better to Go with this with single Iteration Coz
         * If we go with the Swap and Sorting approch it wil take Two iteration which make dont give better performance
         * Here we can achieve O(n)
         */

        int[] values = {3,9,1,10,4,20,2,5};

        HashSet<Integer> hashSet = new HashSet<>();

        for(int k :  values) {
            hashSet.add(k);
        }

        int longestLength = 0;
        for (int i=0; i < values.length; i++) {

            // If before 9 Value is not existing. so only then
            // I want to check for the consecutive value NEXT
            if(!hashSet.contains(values[i] - 1)) { // 9
                //
                int valueContain = values[i];

                while (hashSet.contains(valueContain)) {// 9
                    valueContain++;//10 //11
                }

                // 0
                // 2 < 4 - 1
                // 2 < 3
                if(longestLength < valueContain - values[i]) {
                    // longestLength 11 - 9
                    longestLength = valueContain - values[i];
                }
            }

        }

        System.out.println("longestLength :: " + longestLength);

















    }
}
