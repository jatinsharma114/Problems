package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test16 {

    public static void main(String[] args) {


        int[] ar = {20, 20, 30, 40, 50, 50, 50};

        int[] temp = new int[ar.length];// j++
        int j = 0;

        for (int i =0; i < ar.length-1; i++) {

            if(ar[i] != ar[i+1]) {
                temp[j] = ar[i];
                j++;
            }
        }
        temp[j] = ar[ar.length-1];
        System.out.println(Arrays.toString(temp));











    }
}
