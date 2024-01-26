package com.example.autowire.arrayInJava;

public class Test13 {

    public static void main(String[] args) {

        //27.
        int[] ar = {5, 7, 2, 4, 9};
        int evenNumber = 0;
        int oldNumber = 0;
        for (int i : ar) {

            //for even number reminder should be zero!!
            if (i%2 == 0){
                evenNumber++;
            } else {
                oldNumber++;
            }
        }
        System.out.println(evenNumber + " : " + oldNumber);

    }
}
