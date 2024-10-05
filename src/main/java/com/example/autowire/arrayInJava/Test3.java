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
//        int remove = 101;

        //wrong What if value is not presnt like in place of the 11 there is 101
        //correcting :

        int count = 0;
        for(int i : my_array) {
            if(remove != i) {
                count++;
            }
        }

//      int[] newArray = new int[my_array.length -1];

        int[] newArray = new int[count];

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
