package com.example.autowire.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JAva8CPFS {
    public static void main(String[] args) {
//        MyIntreface ref = new BMW();
//        ref.show(); // can call the  override Method.!

//        new MyIntreface() {
//            @Override
//            public void show() -> {
//                System.out.println("bmi running ...");
//            }
//        };
        /**
         * FunctionaliInterface - One single abstract method.
         * with deafult method and staticc method as well.
         */
        MyIntreface ref1 = () -> System.out.println("bmi running ...");
        ref1.show();
        ref1.callPrivateMethod();
        MyIntreface.staticMethod();
        //---------------------------------------

        CAlCulator cAlCulator = (x, y) ->  x+2;
        int index = cAlCulator.calculateIt(2, 2);
        System.out.println(index);

        CAlCulator sub = (x,y) -> x-y;
        System.out.println(sub.calculateIt(2,2));

        //---------------------------------------

        /**
         *
         */
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println("printing value by consumer..." + n);
            }
        };

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.forEach(con);
//        list.forEach(integer -> System.out.println(integer));


        /**
         * Pridicate : Operations Even Number etc:..
         */
//        Predicate<Integer> integerPredicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                return n > 10;
//            }
//        };
        Predicate<Integer> integerPredicate = n -> n > 10;
        boolean value = integerPredicate.test(12);
        System.out.println("value : " + value);

        //------- Two Predicate :: with condition and() and or() :-
        Predicate<String> pr1 = x -> x.toLowerCase().startsWith("s");
        Predicate<String> pr2 = x -> x.toLowerCase().endsWith("a");

        // && and || Or condition here. :- and()  and  or()
        Predicate<String> and = pr1.and(pr2); // combine result.!
        boolean nameTF = and.test("sharma");
        System.out.println(nameTF);

        Predicate<String> or = pr1.or(pr2);
        System.out.println(or.test("sharm"));

        //---------------------------------------
        /**
         * Functions
         */
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n+20;
            }
        };
        Integer apply = function.apply(2);
        System.out.println(apply);

        Function<Integer, String> fn1 = x -> {
            if(x>2) {
               return  "success";
            } else {
                return "unsuccess";
            }
        };
        String apply1 = fn1.apply(10);
        System.out.println("fu1 : " + apply1);

        Function<Integer, Integer> f1 = x -> x*2;
        Function<Integer, Integer> f2 = x -> x*3;
        /**
         * f1.andThen(f2);
         *  2x2 = 4
         *  | Now : x = 4 | :)
         *          x x 3 -->
         *  andThen 4 x 3 --> 12 Result
         */
        Function<Integer, Integer> function1 = f1.andThen(f2);
        Integer apply2 = function1.apply(2);
        System.out.println(apply2);


        Function<Integer, Integer> identity = Function.identity();
        Integer apply3 = identity.apply(5);
        System.out.println(apply3);

        //--------------------------------
        /**
         * Supplier :
         */
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 20000;
            }
        };
        Integer integer = supplier.get();
        System.out.println("from :: " + integer);

        Supplier<String> sp = () -> "getting value diretly..!!";
        System.out.println(sp.get());






    }
}
