package com.example.autowire.StringQuestions;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {

        String s1 = "cba";
        char[] charArray = s1.toCharArray();

        for (int i =0; i< s1.length(); i++) {

            for (int j = i+1; j < s1.length(); j++) {
                int c1 = (char) charArray[i]; // b = 98
                int c2 = (char) charArray[j]; // a = 97
                if(c1 > c2) { //Swap
                    char temp;
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(charArray));




        String name = "DeepaK"; // 6 - index 5 tK --> length - 1 => 5
        String save = "";
        // 5 4 3 2 1
        // 4

        /**
         * Upto Go Zeroth Index::
         * 5 > 0
         * 4 > 0
         *
         *
         */
        for (int i = name.length()-1;  i >= 0  ; i--) {
            save = save + name.charAt(i);
        }
        System.out.println("save : " + save);





    }
}
