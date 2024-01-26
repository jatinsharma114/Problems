package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test23 {
    /**
     * 49. Write a Java program to arrange the elements of an array of integers so that
     * all positive integers appear before all negative integers.
     * @param args
     */

    public static void main(String[] args) {


        int[] ar = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
//
//        int[] ar = {5,-1,2};
        int temp = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {

                if(ar[i] > ar[j]) {
                    temp  = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(ar));





    }
}
