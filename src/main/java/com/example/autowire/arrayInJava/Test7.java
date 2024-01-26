package com.example.autowire.arrayInJava;

import java.util.*;

public class Test7 {

    /**
     * Between Two Arrays : Common element!!
     */

    public static void main(String[] args) {

        int[] ar1 = {1,2,3};
        int[] ar2 = {11,22,3};

        HashSet<Integer> list = new HashSet<>();
        for (int i =0 ; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length ; j++) {
                if(ar1[i] == ar2[j]) {
                    list.add(ar1[i]);
                    break;
                }
            }
        }
        System.out.println(list);

        //-------------------------
        System.out.println("-------------------------");

        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        HashSet<String> hashSet = new HashSet<>();

        for (int i =0; i < array1.length; i++) {
            for (int j =0; j < array2.length; j++) {
                if(array1[i].equals(array2[j])) {
                    hashSet.add(array1[i]);
                }
            }
        }

        System.out.println(hashSet);






    }
}
