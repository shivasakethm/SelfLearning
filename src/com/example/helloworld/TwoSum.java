package com.example.helloworld;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length; i++) {
            int findElement = target - nums[i];
            if (map.containsKey(findElement)) {
                return new int[]{map.get(findElement), i};
            }
            map.put(nums[i], i);

        }
        return new int[]{1, 2};
    }
}

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 3};
        int target = 6;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
