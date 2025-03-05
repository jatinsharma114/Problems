package com.example.autowire.LeetCodeString;

import java.util.Arrays;

public class Test6 {
    /**
     * 1. Two Sum
     * @param args
     */

    public static void main(String[] args) {

        int[] num = {2,7,11,15};
        int target = 9;
        int[] ints = twoSum(num, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] adding = new int[2];

        for(int i =0 ; i < nums.length-1; i++) {
            for(int j = 1+i ; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    adding[0] = i;
                    adding[1] = j;
                    i = nums.length + 1; // breaking for next iteration!
                    break;
                }
            }
        }

        return adding;
    }
}
