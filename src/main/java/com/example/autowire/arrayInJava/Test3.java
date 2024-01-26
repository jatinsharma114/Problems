package com.example.autowire.arrayInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Test3 {

    /**
     * Remove the specific element from an array.!!
     */
    public static void main(String[] args) {

        int[] my_array = {25,32, 12,43,11, 4, 9};
        int remove = 11;

        int[] newArray = new int[my_array.length -1];
        int i =0;
        for (int element : my_array) {
            if (element ==  remove) {
                continue;
            }
            newArray[i] = element;
            i++;
        }
        System.out.println(Arrays.toString(newArray));








    }
}
