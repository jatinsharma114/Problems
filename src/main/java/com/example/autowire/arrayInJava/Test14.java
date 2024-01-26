package com.example.autowire.arrayInJava;

public class Test14 {

    public static void main(String[] args) {

        int[] ar = {10, 77, 10, 54, -11, 10};
        int value = 30;
        int totalCheck = 0;
        for (int y : ar) {
            if(y == 10) {
                totalCheck+=10;
            }
        }
        System.out.println(value == totalCheck);






    }
}
