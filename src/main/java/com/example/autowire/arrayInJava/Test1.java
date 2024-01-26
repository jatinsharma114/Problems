package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test1 {
    /**
     * Write a Java program to sort a numeric array
     * @param args
     */

    public static void main(String[] args) {

        int[] ar = {10,5,2,14};

        for (int i = 0; i < ar.length; i++) {

            for(int j = i + 1; j < ar.length ; j++){
                int temp = 0;
                if(ar[i] > ar[j]) {
                    temp = ar[i]; // 10
                    ar[i] = ar[j]; // 1
                    ar[j] =  temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));


    }
}
