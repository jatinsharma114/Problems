package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test24 {
    /**
     * 50. Write a Java program to sort an array of positive integers from an array.
     * In the sorted array the value of the first element should be maximum,
     * the second value should be a minimum, third should be the second maximum,
     * the fourth should be the second minimum and so on.
     *
     */

    public static void main(String[] args) {

        int ar[] = {1,2,9,10};
        int[] temp = new int[ar.length];

        boolean button = true;
        int aageSay = 0;
        int picheSay = ar.length -1;


        for(int i =0 ; i < ar.length; i++) {

            if(button) {
                temp[i] = ar[picheSay--]; //Pipeline  Piche Say
            } else {
                temp[i] = ar[aageSay++]; //Pipeline  aage say
            }
            // ON OFF Button for Pipeline
            button = !button;

        }
        System.out.println(Arrays.toString(temp));






    }



}
