package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {

        int[] ar = {0, 0, 1, 0, 3, 0, 5, 0, 6};
        int[] store = new int[ar.length];

        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        int indexValue = 0;
        for (int i = store.length-1; i > 0; i--) {
            int i1 = ar[i];
            store[indexValue] = i1;
            indexValue++;
        }
        System.out.println(Arrays.toString(store));

    }
}
