package com.example.helloworld;

class SolutionRD {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }

        }
        return i + 1;

    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 1, 1, 1, 1, 2, 2};
        SolutionRD solutionRD = new SolutionRD();
        int len = solutionRD.removeDuplicates(nums);
        System.out.println(len);
    }
}
