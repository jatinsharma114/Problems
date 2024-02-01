package com.example.autowire.StringQuestions;

public class Test4 {
    public static void main(String[] args) {

        String str1 = "aabbceeff";

        for (int i = 0; i < str1.length(); i++) {

            boolean OneTime = true;//Fir say when loop start !!

            for (int j = 0; j < str1.length(); j++) {
                // Check if the characters at positions 'i' and 'j' are the same but not at the same index.
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    // If found, set unique to false and break the loop.
                    OneTime = false;
                    break;
                }
            }

            if (OneTime) {
                System.out.println(str1.charAt(i));
                break; //niklooo
            }
        }


        System.out.println("------");

        String str = "The quick brown fox jumps over the lazy dog.";
// ---------------------------10             -26
        String new_str = str.substring(10, 26);

        System.out.println("old = " + str);
        System.out.println("new = " + new_str);

    }
}
