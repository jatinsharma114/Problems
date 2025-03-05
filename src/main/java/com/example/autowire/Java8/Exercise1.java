package com.example.autowire.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Arrays.asList --> Unmodified List !! // UnsupportedOperationException
 *
 */
public class Exercise1 {
    public static void main(String[] args) {
        /**
         * sorted
         * distinct
         * limit
         * o/p : [a, b, c, p, q, z]
         */
        List<String> list = Arrays.asList("c", "a", "b", "p", "z", "q", "q", "q"); // cant modify : UnsupportedOperationException
//        List<String> collect = list.stream()
//                                    .sorted()
//                                    .distinct()
//                                    .limit(2)
//                                    .collect(Collectors.toList());
//        System.out.println(collect);
//
////        list.add("r");
//        System.out.println(list);




















    }
}
