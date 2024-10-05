package com.example.autowire.arrayInJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test1 {
    /**
     * Write a Java program to sort a numeric array
     * int[] ar = {10,5,2,14};
     * @param args
     */

    public static void main(String[] args) {

        int[] ar = {10,5,2,14};

        for (int i = 0; i < ar.length; i++) {

            for (int j = i+1; j < ar.length; j++) {
                //condition
                /**
                 * if first value pick i > j
                 */
                // swap logic.
                int temp;
                if(ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
//

//
//
//        for (int i = 0; i < ar.length; i++) {
//
//            for(int j = i + 1; j < ar.length ; j++){
//
//                int temp;
//                if(ar[i] > ar[j]) {
//
//                    temp = ar[i]; // 10
//                    ar[i] = ar[j]; // 1
//                    ar[j] =  temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(ar));


        /**
         * *Remove depalicate char from String
         *     String s1 =  "happy" , result : "hapy"
         */
//
//        String s1 =  "happy";
//        char[] charArray = s1.toCharArray();
//
////        String save = "";
//        StringBuffer sb = new StringBuffer();
////        for (int i =0; i < charArray.length; i++) {
//
//        for (char ch : s1.toCharArray()) {
//            if(sb.indexOf(String.valueOf(ch)) == -1) {
//                sb.append(ch);
//            }
//        }
//
//        System.out.println(sb.toString());
//




    }
}
