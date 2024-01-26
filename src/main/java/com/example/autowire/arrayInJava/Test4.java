package com.example.autowire.arrayInJava;

import java.util.Arrays;

public class Test4 {
    /**
     * MAX and Min value
     * @param args
     */

    public static void main(String[] args) {

        int[] values = {10, 5 ,17};

        // 10 < 5  => TRUE

        for (int i =0; i < values.length; i++) {
            for ( int j = i + i; j < values.length; j++) {
                if(values[i] > values[j]) { // 10 > 5 True
                    int temp = 0;
                    temp = values[i]; // 10 -> temp = 10
                    values[i] = values[j]; // index 0 -> 5 small Value
                    values[j] = temp;  // index J = Swap huwa hai
                }
            }
        }
        System.out.println(Arrays.toString(values));

        int max = values[0];
        int min = values[values.length - 1];
        System.out.println(min);

    }
}
