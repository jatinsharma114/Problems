package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test101 {

    public static void main(String[] args) {

        int[] ar = {45, 20, 100, 23, -5, 2, -6};
        Arrays.sort(ar);

        for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }

        System.out.println(Arrays.toString(ar));






    }
}
