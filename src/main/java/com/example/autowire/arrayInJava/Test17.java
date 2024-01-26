package com.example.autowire.arrayInJava;

import java.util.ArrayList;

public class Test17 {

    // Target value for array which can give the paris of Two value = 6

    /**
     * 35. Write a Java program to find the sum of the two elements of a given array equal to a given integer.
     * Sample array: [1,2,4,5,6]
     * Target value: 6
     */

    public static void main(String[] args) {

        int[] ar = {1,2,4,5,6};
        int target = 6;

        for (int i =0; i < ar.length; i++) {

            for ( int j = i+1; j < ar.length; j++) {

                if((ar[i] + ar[j]) == 6) {
                    System.out.println(ar[i] + " + " + ar[j] + " = " + (ar[i] + ar[j]) );
                }
            }
        }


    }
}
