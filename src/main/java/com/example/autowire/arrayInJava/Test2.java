package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test2 {
    /**
     * Write a Java program to sum values of an array.
     */

    public static void main(String[] args) {

//        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int i = 0;
//
//        for (int take : my_array) {
//            i += take;
//        }
//        System.out.println(i);

        //Index position of Array
        int[] position = {2,34,45};
        int index = 34;

        for ( int i = 0 ; i < position.length; i++) {
            if(index == position[i]) {
                System.out.println("found at : " + i);
            }
        }


    }
}
