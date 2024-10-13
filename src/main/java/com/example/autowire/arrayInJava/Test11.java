package com.example.autowire.arrayInJava;

public class Test11 {

    //Write a Java program to test two arrays' equality.

    public static void main(String[] args) {

        int[] ar1 = {1,2,3};
        int[] ar2 = {1,7,3};
        int indexValue = 0;
        boolean value = false;

        for(int i : ar1) {

            if (i != ar2[indexValue]) {
                value = true;
            }
            indexValue++;
        }
        if(value) {
            System.out.println("Not equal");
        } else {
            System.out.println("Equal!!");
        }





    }
}
