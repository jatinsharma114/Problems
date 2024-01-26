package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test21 {
    /**
     *
     * 40. Write a Java program to find the two elements in a given array
     * of positive and negative numbers such
     * that their sum is close to zero.
     * 
     */

    public static void main(String[] args) {

        int[] ar = {-8, -66, -60};
        int[] store = new int[ar.length];
        int inserVAlue = 0;

        for(int i =0; i < ar.length-1; i++) {
            for (int j = i+1; j < ar.length; j++) {

                 int insert = ((ar[i]) + (ar[j]));
                 store[inserVAlue] = insert;
                 inserVAlue++;

            }
        }
        System.out.println(Arrays.toString(store));

        //SWAP :

        int temp =0;
        for (int i =0; i < store.length; i++) {

            for (int j = i+1; j < store.length;j++) {

                //       10 <  5 => SWAP kro
                if(store[i] < store[j]) {
                    temp = store[i];
                    store[i] = store[j]; // 5
                    store[j] = temp; // 10
                }

            }
        }
        System.out.println("------------------");
        System.out.println(Arrays.toString(store));

        //Closed to Zero :
        System.out.println("Closed to Zero :  " + store[0]);



    }
}
