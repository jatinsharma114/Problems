package com.example.autowire.TestingStreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        System.out.println(list1);




    }
}
