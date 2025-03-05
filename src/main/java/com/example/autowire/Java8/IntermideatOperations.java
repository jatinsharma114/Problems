package com.example.autowire.Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntermideatOperations {
    /**
     * parallelStream ?
     *
     */
    public static void main(String[] args) {


        List<String> list = Arrays.asList("aditi", "zoo", "ram", "ravi", "jatin");

        // 1. Filter - Get names starting with 'r'
        List<String> filteredNames = list.stream()
                .filter(name -> name.startsWith("r"))
                .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames); // [ram, ravi]

        // 2. Map - Convert all names to uppercase
        List<String> upperCaseNames = list.stream()
                .map(z -> z.toUpperCase()) // Intermediate operator
                .collect(Collectors.toList()); // Terminal operator
        System.out.println("Uppercase Names: " + upperCaseNames);

        // 3. Sorted - Sort names in natural order
        List<String> sortedNames = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);

        // 4. Sorted (custom comparator) - Sort by length of name
        List<String> sortedByLength = list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Sorted by Length: " + sortedByLength);

        // 5. forEach - Print each name
        System.out.println("Printing names using forEach:");
        list.forEach(System.out::println);

        // 6. Collect - Join all names into a single string
        String joinedNames = list.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined Names: " + joinedNames);

        // 7. Count - Count names with length greater than 3
        long count = list.stream()
                .filter(name -> name.length() > 3)
                .count();
        System.out.println("Count of Names with Length > 3: " + count);

        // 8. Reduce - Concatenating all names into one
        String concatenatedNames = list.stream()
                .reduce("", (name1, name2) -> name1 + name2);
        System.out.println("Concatenated Names: " + concatenatedNames);

        // 9. Find First - Get the first name after sorting
        Optional<String> firstName = list.stream()
                .sorted()
                .findFirst();
        System.out.println("First Name After Sorting: " + firstName.orElse("No Name"));

        // 10. AnyMatch - Check if any name starts with "a"
        boolean anyMatch = list.stream()
                .anyMatch(name -> name.startsWith("a"));
        System.out.println("Any name starts with 'a': " + anyMatch);

        // 11. Parallel Stream - Process names in parallel
        list.parallelStream().forEach(name -> System.out.println("Parallel: " + name));


        //--------------------------------


        List<Integer> list11 = Arrays.asList(1, 2, 3);
        Optional<Integer> max = list11.stream().max(Comparator.naturalOrder());
        System.out.println("max : " + max.get());

        /**
         * List<List<String>>
         */
        List<List<String>> list1 = Arrays.asList(
                Arrays.asList("ram", "hh"),
                Arrays.asList("titu", "kal")
        );
        System.out.println(list1.get(1));

        // to get in the Single list use flate map...
        List<String> list2 = list1.stream()
                .flatMap(x -> x.stream())
                .map(String::toUpperCase)
                .toList();
        System.out.println(list2); //[RAM, HH, TITU, KAL]

        //---------------------

        List<String> words = Arrays.asList(
                "jatin",
                "kd",
                "pinkesh",
                "harsh"
        );

        List<String> collect = words.stream()
                .flatMap(x -> Arrays.stream(x.split(",")))
                .collect(Collectors.toList());
        System.out.println(collect); // [jatin, kd, pinkesh, harsh]


    }
}
