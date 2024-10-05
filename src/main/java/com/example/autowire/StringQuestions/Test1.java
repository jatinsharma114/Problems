package com.example.autowire.StringQuestions;

public class Test1 {

    public static void main(String[] args) {


        //32 - 97a - 65A = 32
        String s = 'T' + "".toUpperCase();


        String s1 = "hello jatin";
        char[] charArray = s1.toCharArray();
        boolean makeUpperCase = true; // Start with the first character capitalized

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                makeUpperCase = true; // Capitalize the next character encountered
            } else {
                charArray[i] = makeUpperCase ? Character.toUpperCase(charArray[i]) : charArray[i];
                makeUpperCase = false; // Reset the flag
            }
        }

        System.out.println(new String(charArray));




    }
}
