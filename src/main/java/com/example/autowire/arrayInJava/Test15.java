package com.example.autowire.arrayInJava;

import java.util.HashSet;

public class Test15 {
    /**
     *
     * Longest Consecutive... 1-2-3-4-5  Longest
     * @param args
     */
    public static void main(String[] args) {


        int[] values = {1,2,3,4,8,9,18};

        HashSet<Integer> hashSet = new HashSet<>();
        for (int va : values) {
            hashSet.add(va);
        }
        int longNumber = 0;
        for (int i =0 ; i < values.length; i++) {
            // 2-1 = 1 True -> false Toh meko chlana he nhi hai
            // piche wali - aage wali ciz dekho !
            if (!hashSet.contains(values[i] -1)) {

                int no = values[i];//8

                //Ye loop Chlta rega !!!!
                while (hashSet.contains(no)) {
                    no++; // 1-2-3-4 final = 4
                }
                //0 < 3
                // 4 - 1 IndexValue = 2
                // 11 - 9 IndexValue = 2
                if(longNumber < no - values[i]) {
                    longNumber = no - values[i];
                }
            }
        }
        System.out.println("LL : " + longNumber);



















    }
}
