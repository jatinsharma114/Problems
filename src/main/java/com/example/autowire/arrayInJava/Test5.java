package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test5 {

    public static void main(String[] args) {

        int[] rev = {1,2,3};

        //Fixed size of array!
        int[] store = new int[rev.length];

        // 2 < 0 ?
        int insertIndex = 0;
        for(int i = (rev.length-1); i > 0; i--) {
            System.out.println("Print ...");
            store[insertIndex] = rev[i];
            insertIndex++;
        }
        System.out.println(Arrays.toString(store));








    }
}
