package com.example.autowire.arrayInJava;

public class Test20 {

    /**
     * 39. Write a Java program to print all the LEADERS in the array.
     * Note: An element is leader if it is greater than all the elements to its right side.
     * @param args
     */

    public static void main(String[] args) {

        int[] ar = {97, 7, 12, 9, 8, 3};

        int max = ar[ar.length-1];
        System.out.println("+++ " + max);

        // Index -------------- ZERO = 0
        for (int i = ar.length-2; i >=0 ; i--) {

            if(ar[i] > max) {
                System.out.print(" " + ar[i]);
                max = ar[i];
            }

        }


    }
}
