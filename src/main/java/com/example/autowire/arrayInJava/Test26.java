package com.example.autowire.arrayInJava;

import java.util.ArrayList;
import java.util.Arrays;

public class Test26 {
    /**
     * Exercise-53 with Solution
     * Write a Java program to replace every element with the next greatest element
     * (from the right side) in a given array of integers.
     * There is no element next to the last element, therefore replace it with -1.
     * @param args
     */

    public static void main(String[] args) {

        int[] ar = {45, 20, 100, 23, -5, 2, -6};
//        int[] ar = {17, 18, 5, 4, 6, 1}; // - greatestElement = -1; // this can be use here.!
        //                        __ -1

        int[] store = new int[ar.length];
        store[ar.length-1] = -1;

        int down = ar.length - 2;

        int greatestElement = Integer.MIN_VALUE;//It is Use for negative value/min value

        //Piche s aana hai !!
        for (int i = ar.length-1; i > 0; i--) {

            // 1 > -1
            if(ar[i] > greatestElement)  {
                greatestElement = ar[i];
                store[down] = greatestElement;
                down--;
            } else {
                store[down] = greatestElement;
                down--;
            }

        }
        System.out.println("Final :" + Arrays.toString(store));


        System.out.println("Ans. should be :\n[100, 100, 23, 2, 2, -6, -1]");







        





    }
}
