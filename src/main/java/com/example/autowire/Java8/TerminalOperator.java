package com.example.autowire.Java8;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperator {
    public static void main(String[] args) {
        /**
         * .collect(Collectors.
         */
        /**
         * Sorting                       Order	                Lambda Expression
         * Alphabetical              (A → Z)	                .sorted((s1, s2) -> s1.compareTo(s2))
         * Reverse Alphabetical      (Z → A)	                .sorted((s1, s2) -> s2.compareTo(s1))
         * By Length              (Short → Long)             .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
         * By Length            (Long → Short)	            .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
         */
        //------------------
        /**
         * Arrays.asList() Returns a Fixed-Size List
         */
        List<Integer> list = Arrays.asList(3, 2, 1);
//        list.add(33);
        Long collect = list.stream().collect(Collectors.counting());
        System.out.println(collect);
        /**
         * Collectors.toList() Creates a New ArrayList
         */
        List<Integer> modified = list.stream().collect(Collectors.toList());
        modified.add(22);
        System.out.println(modified);

        /**
         * there is unmodified also
         * Collectors.toUnmodifiableList()
         */
        List<Integer> unModified = list.stream().collect(Collectors.toUnmodifiableList());
//        unModified.add(44);
//        System.out.println(unModified); // Exception in thread "main" java.lang.UnsupportedOperationException


        //--------------------
        /**
         * 2. forEach
         */
        list.forEach(z -> System.out.println(z)); // terminal operation

        //--------------------

        /**
         * 3.
         */
        List<String> names = Arrays.asList("John", "Aliwwwwwwwwwce", "Bob", "aharlie", "David");
        List<String> collect1 = names.stream()
                .filter(x -> x.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(collect1);

        /**
         * Sorting by Length of Name
         * s2 -> s1
         * s1 -> s2
         *--------------
         */
        List<String> namesList = Arrays.asList("John", "Aliwwwwwwwwwce", "pi");
        List<String> sortedByLength = namesList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .collect(Collectors.toList());
        System.out.println("Sorted by Length (Short → Long): " + sortedByLength);



        List<String> namesList2 = Arrays.asList("John", "Aliwwwwwwwwwce", "pi");
        List<String> list1 = namesList.stream()
                .sorted() // Alphabetical order.
                .collect(Collectors.toList());
        System.out.println("compareTo : " + list1);

        List<String> list2 = Arrays.asList("naresh", "lakshya", "jhaniv", "shubhoddddd");
        Optional<String> reduce = list2.stream().reduce((x, y) -> x + y);
        System.out.println(reduce.get()); // nareshlakshyajhanivshubhoddddd


        //--------------------------
        /**
         * 4. count
         */

        System.out.println("=====================");
        // anyMacth --> Or condition
        List<Integer> list3 = Arrays.asList(2, 4, 5, 6, 8);
        boolean anyMacth = list3.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(anyMacth);

        boolean allSatisfiedtheCondition = list3.stream().allMatch(x -> x % 2 == 0);
        System.out.println(allSatisfiedtheCondition);

        boolean b = list3.stream().noneMatch(x -> x % 2 == 0);
        System.out.println(b);

        // findFirst

        //------------

        /**
         * Find the element length is greater than > 3
         */
        List<String> namesGreaterThan3 = Arrays.asList("Jo", "Aliwwwwwwwwwce", "piiiiii");

        List<String> collect2 = namesGreaterThan3.stream()
                .filter(x -> x.length() > 3)
                .collect(Collectors.toList());
        System.out.println(collect2);


        // Accending order
        List<Integer> list4 = Arrays.asList(2, 3, 4, 5);
        List<Integer> collect3 = list4.stream().map(x -> x * 2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect3);

        // Decending order.
            List<Integer> list5 = Arrays.asList(2, 3, 4, 5);
        List<Integer> collect4 = list4.stream().map(x -> x * 2)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(collect4);

        Optional<Integer> reduce1 = list5.stream().reduce((x, y) -> x + y);
        System.out.println(reduce1.get());
        //--------------------


        String s1 = "Hello";
        IntStream chars = s1.chars();
        // Creating the stream of Integer -->
        long count = chars.filter(x -> x == 'l').count();
        System.out.println(count);

        List<String> list6 = Arrays.asList("ram", "shaym");
        Stream<String> stringStream = list6.stream().filter(
                x -> {
                    System.out.println("printing : " + x);
                    return x.length() > 3;
                }
        );
        System.out.println("Before terminal operations.....");

        List<String> collect5 = stringStream.collect(Collectors.toList());
        System.out.println(collect5);


    }
}
