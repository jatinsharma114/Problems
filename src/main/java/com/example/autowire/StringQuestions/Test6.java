package com.example.autowire.StringQuestions;

public class Test6 {

    /**
     * Remove the duplicate char in the given string!!
     * @param args
     */
    public static void main(String[] args) {

        String s1 = "aabcd";
//        char[] charArray = s1.toCharArray();
//
//        boolean[] store = new boolean[26]; // bucket of 26 char adds True if value present
//        // by default, they are false.
//
//        for (int i = 0; i < s1.length(); i++) {
//            if(store[i] != true) {
//                int ch = (int ) charArray[i]; //a
//                int indexValue = 25 - (122 - ch); // Index value 25 - (0) => (122 - 97 => 25)...{25 - (25)} = 0
//                store[indexValue] = true;
//            }
//        }
//
//        int value = 97;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < store.length; i++) {
//            //If value is true
//            if (store[i]) {
//                char t = (char) value;
//                sb.append(t);
//            }
//            value++;
//        }
//        System.out.println(sb.toString());


        /**
         * StringBuilder sb = new StringBuilder("Hello World");
         *     sb.indexOf("World"));  // Output: 6 Index !!!
         *     sb.indexOf("J"));   // Output: -1 (Not found)
         */

        String s2 = "aabb";
        StringBuilder sb = new StringBuilder();

        for (char atChar : s2.toCharArray()) {
            String s = String.valueOf(atChar);
            if(sb.indexOf(s) == -1) {
                sb.append(atChar);
            }
        }
        System.out.println(sb.toString());



        /** when we need to add ???
         * Jab : availble nhi ho
         */





    }
}
