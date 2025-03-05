package com.example.autowire.LeetCodeString;

public class Test13 {
    /**
     * Reverse Only Letters (LeetCode 917)
     */
    public static void main(String[] args) {
        String s1 = "ab-dc--!";
        char[] charArray = s1.toCharArray();
        // Pointer Start and End
        int i = 0;
        int j = s1.length()-1;

        while (i < j) { // until it come in Mid 2 < 2
            if(!Character.isLetter(charArray[i])) { // Start --->
                i++; // Shifting the pointer
            } else if(!Character.isLetter(charArray[j])) { // <--- backward
                j--; // Shifting the pointer
            } else {
                //swap : If both sides has a char
                char temp = charArray[i]; // a
                charArray[i++] = charArray[j]; //  [i++] get it first then increase it by +1
                charArray[j--] = temp; //      //  [j++] get it first then increase it by +1
            }
        }

        System.out.println(new String(charArray));





    }
}
