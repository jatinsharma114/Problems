package com.example.autowire.arrayInJava;

public class Test18 {

    /**
     * 36. Write a Java program to find all the distinct triplets such that the sum of all the three elements [x, y, z (x ≤ y ≤ z)] equal to a specified number.
     * Sample array: [1, -2, 0, 5, -1, -4]
     * Target value: 2.
     * @param args
     */
    public static void main(String[] args) {

        int[] ar = {1, -2, 0, 5, -1, -4};
        int target = 2;

        for (int i =0; i < ar.length; i++) {

            for ( int j = i+1; j < ar.length; j++) {

                for ( int k = j+1; k < ar.length; k++) {

                    if((  (ar[i]) + (ar[j]) + (ar[k])  ) == 2) {
                        System.out.println(ar[i] + " + " + ar[j] + " + " + ar[k] + " = " + (  (ar[i]) + (ar[j]) + (ar[k])  ));
                    }

                }

            }
        }


    }
}
