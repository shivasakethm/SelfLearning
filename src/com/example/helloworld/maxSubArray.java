package com.example.helloworld;


import java.util.Arrays;

public class maxSubArray {

    public static int maxsubarray(int[] nums) {

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int result = nums[0];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {
                int[] n = Arrays.copyOfRange(nums, i, j + 1);
                int rsum = 0;
                for (int value : n
                ) {
                    rsum = rsum + value;
                }
                if (rsum > result)
                    result = rsum;

            }
        }


        return result;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Arrays.copyOfRange(nums, 0, 2));
        System.out.println(maxsubarray(nums));


    }
}
