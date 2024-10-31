package com.example.autowire.arrayInJava;

import java.util.HashSet;

public class test8 {

    public static void main(String[] args) {

        //Write a Java program to remove duplicate elements from an array.

        int[] values = {1,22,3,22};
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i :values) {
            hashSet.add(i);
        }
        System.out.println(hashSet);








    }
}
