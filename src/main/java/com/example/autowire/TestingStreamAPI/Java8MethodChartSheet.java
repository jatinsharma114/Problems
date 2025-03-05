package com.example.autowire.TestingStreamAPI;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8MethodChartSheet {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeDataBase.getAllEmployees();
//        employees.forEach(x -> System.out.println(x));

        // filter employe based on Male
        List<Employee> collect = employees.stream().filter(x -> x.getGender() == "Male").collect(Collectors.toList());
//        System.out.println(collect);

//        Map<String, Double> development = employees.stream()
//                .filter(e -> e.getDept().equals("Development") && e.getSalary() > 80000)
//                .collect(Collectors.toMap(Employee::getDept, Employee::getSalary));
//        System.out.println(development); // Duplicate key Development (attempted merging values 85000.0 and 88000.0)

        // Filter + toMap With {Id, Name}
        Map<Integer, String> developmentEmployees = employees.stream()
                .filter(e -> e.getDept().equals("Development") && e.getSalary() > 80000)
                .collect(Collectors.toMap(Employee::getId, Employee::getName));

//        System.out.println(developmentEmployees);

        //
        List<String> list = employees.stream()
                .map(x -> x.getDept())
                .distinct()
                .toList();
//        System.out.println(list);

//        List<Stream<String>> projectNames = employees.stream()
//                .map(e -> e.getProjects()
//                        .stream().map(p -> p.getName())).collect(Collectors.toList());
//
//        System.out.println(projectNames);

        /**
         * In order to get the Project Name which is
         * One to Many mapping we need to use the FlateMap here.
         */
        List<String> list1 = employees.stream()
                .flatMap(x -> x.getProjects().stream())
                .map(y -> y.getName())
                .distinct()
                .toList();
//        System.out.println(list1);


        Map<String, Double> collect1 = employees.stream()
                .sorted(
                        Collections.reverseOrder(
                                Comparator.comparing(x -> x.getSalary())
                        )
                )
                .limit(2)
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
//        System.out.println(collect1);

        Map<String, Double> collect2 = employees.stream()
                .sorted(
                        Comparator.comparing(x -> x.getSalary())
                )
                .filter(y -> y.getSalary() > 80000)
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
//        System.out.println(collect2);


        // small--> high
        // 1. Find the Top 3 Highest Paid Employees
        List<String> list2 = employees.stream()
                .sorted(
                        Collections.reverseOrder(
                                Comparator.comparing(x -> x.getSalary())
                        )
                )
                .limit(3)
                .map(x -> x.getName())
                .toList();
//        System.out.println(list2);

        // 2. Find All Employees with Salaries Above 75,000 and Sort by Name
        List<String> list3 = employees.stream()
                .filter(x -> x.getSalary() > 75000)
                .sorted(
                        Comparator.comparing(Employee::getName)
                ).map(x -> x.getName())
                .toList();
//        System.out.println(list3);

        // 3. Find Employees Who Work in 'Development' and Sort by Salary
        List<String> list4 = employees.stream()
                .filter(x -> x.getDept() == "Development")
                .sorted(Comparator.comparing(Employee::getSalary))
                .map(x -> x.getName())
                .toList();
//        System.out.println(list4);

        // 4. Sort Employees by Gender First, then by Salary in Descending Order
        List<String> list5 = employees.stream()
                .filter(x -> x.getGender() == "Male")
                .sorted(
                        Collections.reverseOrder(
                                Comparator.comparing(Employee::getSalary))
                ).limit(3)
                .skip(1) // 2nd higest!
                .map(x -> x.getName())
                .toList();
//        System.out.println(list5);


        List<String> list6 = employees.stream()
                .filter(x -> x.getProjects().size() > 1)
                .sorted(
                        Comparator.comparing(Employee::getSalary)
                ).map(x -> x.getName())
                .toList();
        System.out.println(list6);

    }
}
