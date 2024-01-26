package com.example.autowire.arrayInJava;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Test6 {

    public static void main(String[] args) {

        int[] dup = {11,2,33, 33,33,11};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : dup) {

            if(map.containsKey(value)) {
                map.put(value, (map.get(value) +  1));
            } else {
                map.put(value, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entrySet: map.entrySet()) {
            if(entrySet.getValue() > 0) {
                System.out.println("Came " + entrySet.getKey() + " : " + entrySet.getValue() + " times...");
            }
        }




    }
}
