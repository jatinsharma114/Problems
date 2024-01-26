package com.example.autowire.arrayInJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test19 {

    /**
     * Majority elemets!!
     *38. Write a Java program to get the majority element from an array of integers containing duplicates.
     *
     * Majority element: A majority element is an element that appears more than n/2 times where n is the array size.
     */

    public static void main(String[] args) {

        int[] ar = { 1, 7, 7,7,7,7,7,7,8,8,2,2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : ar) {
            if(map.containsKey(i)) {
                map.put(i, (map.get(i) +1));
            } else {
                map.put(i, 1);
            }
        }

        int save = 0; // 1
        for (Map.Entry<Integer, Integer> come : map.entrySet()) {
            Integer value = come.getValue(); // 1

            if(save < value) {
                save = value;
            }
        }

        for (Map.Entry<Integer, Integer> come : map.entrySet()) {
           if(save == come.getValue()) {
               System.out.println(come.getKey() + " is Majority element and came for " + come.getValue() + " times.");
           }
        }





    }
}
