package com.example.autowire.pattern;

public class Test1 {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) { //5 times
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("-----------");

        for (int i = 1; i <=5; i++) { //5 times

            //            5 -4 3 2  > 1 2 3 4 5
            for (int j = 4; j >= i; j--) { // 4times
                System.out.print("   "); //space print
            }

            for (int k = 1; k <= i; k++) { //1 time
                System.out.print(" * ");
            }

            System.out.println();
        }

        System.out.println("-----------");



        for (int i = 1; i <=5; i++) { //5 times

            //            5 -4 3 2  > 1 2 3 4 5
            for (int j = 4; j >= i; j--) { // 4times
                System.out.print(" "); //space print
            }

            for (int k = 1; k <= i; k++) { //1 time
                System.out.print(" *");
            }

            System.out.println();
        }

        System.out.println("--------------");




    }
}
