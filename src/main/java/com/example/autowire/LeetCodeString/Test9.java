package com.example.autowire.LeetCodeString;

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        /**
         * Longest Common Prefix |
         */
        /**
         * approch :
         * sort the Array a-- b -c -d -e -f ....
         */
        String[] arr = {"flower","flow","flight"};

        Arrays.sort(arr);
        char[] fist = arr[0].toCharArray();
        char[] last = arr[arr.length-1].toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        // 1 < 4 - t
        for(int i =0; i < fist.length; i++){
            //check --
            if(fist[i] != last[i]){
                break;
            } else {
                stringBuilder.append(fist[i]);
            }
        }

        System.out.println(stringBuilder.toString());






    }
}
