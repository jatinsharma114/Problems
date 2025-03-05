package com.example.autowire.LeetCodeString;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        /**
         * Reverse words in a string
         */
        String s = "jatin sharma";
        // change to String[] array
        String[] split = s.split(" ");
        System.out.println(Arrays.asList(split));

        StringBuilder sb = new StringBuilder();

        // 1 0 --> Two times.!
        for (int i = split.length - 1 ; i >= 0 ; i--) {
            sb.append(split[i]); // sharma
            sb.append(" ");
        }

        System.out.println(sb.toString());

    }
}
