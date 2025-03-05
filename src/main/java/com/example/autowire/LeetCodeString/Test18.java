package com.example.autowire.LeetCodeString;

import java.util.Stack;
public class Test18 {
    public static void main(String[] args) {
        /**
         * Valid Parentheses
         */
        String s1 = "[{()[}()]";
        String s2 = "()";
        boolean valid = isValid(s2);
        System.out.println("valid : " + valid);

    }

    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char ch : charArray) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
