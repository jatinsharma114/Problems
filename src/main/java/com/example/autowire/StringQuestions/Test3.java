package com.example.autowire.StringQuestions;

public class Test3 {

    /**
     * Remove dupalicate
     * @param args
     */
    public static void main(String[] args) {
        // indexOf = -1 if no char is present in the given string
        // If present it will retunr the first occurance of the Index value!!!
        String s1 = "happy";

        char[] charArray = s1.toCharArray();

        String store = "";

        for (char ch : charArray) {
            if(store.indexOf(ch) == -1) {
                store = store + ch;
            }
        }
        System.out.println(store);


    }
}
