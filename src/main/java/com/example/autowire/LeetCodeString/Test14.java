package com.example.autowire.LeetCodeString;

import javax.swing.*;

public class Test14 {
    /**
     * https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/
     * 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
     * @param args
     */
    public static void main(String[] args) {

        String s1 = "hellohello hellohellohello";
        String trim = s1.trim();
        String prefix = "ell";
        String[] split = s1.split(" ");
        int atIndex = -1;
        for (int i = 0; i < split.length; i++) {
            // For prefix of word;
            if(split[i].startsWith(prefix)) {
                atIndex = i+1;
                break;
            }
//            if(!(split[i].indexOf(prefix) == -1)) {  // It is not for prifix logic. - contains
//                atIndex = i+1;
//                break;
//            }
        }
        System.out.println("atIndex : " + atIndex);


    }
}
