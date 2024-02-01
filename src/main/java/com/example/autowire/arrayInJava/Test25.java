package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test25 {
    /**
     * Extra question ::
     */

    public static void main(String[] args) {

        int[] ar = {11,22,33,44,55,19}; // Length = 6

        int[] store = new int[ar.length+1];

        int targetIndex = 4; //At 55 = 2
        int InsertValue = 90;

        int storeValue = 0;
        for (int i = 0; i < ar.length; i++) {

            //At index 4
            if(targetIndex == i) {
                store[targetIndex] =  InsertValue;
                storeValue++;
                // Index 4 To down to Increase
                i--; //Down Kia
                targetIndex = 0; //Update SO it will not come again
                continue;
            }

            store[storeValue] = ar[i];
            storeValue++;
        }
        System.out.println(Arrays.toString(store));


    }
}
