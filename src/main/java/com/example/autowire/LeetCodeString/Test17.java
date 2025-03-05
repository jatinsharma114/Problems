package com.example.autowire.LeetCodeString;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test17 {
    /**
     * https://leetcode.com/problems/find-words-containing-character/description/
     * 2942. Find Words Containing Character
     * @param args
     */
    public static void main(String[] args) {
        String []word = {"leet","cod", "code"};
        char x = 'e';
        List<Integer> wordsContaining = findWordsContaining(word, x);
        System.out.println(wordsContaining);

    }

    public static List<Integer> findWordsContaining(String[] wordsList, char x) {
        List<Integer> list = new LinkedList<>();
        if(wordsList.length == 0) {
            return list;
        }
        for (int i=0; i < wordsList.length; i++) {
            if(wordsList[i].indexOf(x) != -1) {
                list.add(i);
            }
        }
        return list;
    }
}
