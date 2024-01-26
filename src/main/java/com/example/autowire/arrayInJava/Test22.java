package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test22 {

    /**
     * 45. Write a Java program to cyclically rotate a given array clockwise by one.
     *
     */

    public static void main(String[] args) {

//        int[] ar = {1,2,3};

        int[] ar = {10, 20, 30, 40, 50, 60};
        int lastIndexValue = ar[ar.length-1];//last index value
        int[] store = new int[ar.length];

        //    /  1  /  2

        for (int i = 0; i < ar.length-1; i++){ //2 Times !
            store[i+1] = ar[i];//1 2
        }
        store[0] = lastIndexValue; //Save at first index!

        System.out.println(Arrays.toString(store));



    }
}
