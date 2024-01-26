package com.example.autowire.arrayInJava;

public class Test10 {
    /**
     * Write a Java program to find all pairs of elements in an array
     * whose sum is equal to a specified number.
     */

    public static void main(String[] args) {

        int[] inputArray = {2, 7, 4, -5, 11, 5, 20};
        int inputNumber = 15;

        for (int i =0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {

                if(inputArray[i] + inputArray[j] == inputNumber) {
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " = " +  inputNumber);
                }
            }
        }


    }
}
