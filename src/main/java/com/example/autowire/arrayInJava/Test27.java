package com.example.autowire.arrayInJava;

import java.util.Arrays;

/**
 *  find the maximum product of two integers in a given array of integers.
 */
public class Test27 {
    public static void main(String[] args) {


        int[] ar = {2, 3, 5, 7, -7, 5, 8, -5};

        int temp = 0;
        for (int i = 0 ; i < ar.length; i++) {

            for (int j = i+1; j < ar.length; j++) {

                if(ar[j] < ar[i]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp; //swaping
                }
            }
        }
        System.out.println(Arrays.toString(ar));

        System.out.println( "maximum product :  " + (ar[ar.length-1] * ar[ar.length-2]));




    }
}
