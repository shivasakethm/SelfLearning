package com.example.helloworld;

import java.util.*;

class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> arrayLists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> list = new ArrayList<>();
                int findElement = -(nums[i] + nums[j]);
                if (map.containsKey(findElement) && map.get(findElement) != j && map.get(findElement) != i) {
                    list.clear();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(findElement);
                    Collections.sort(list);
                    System.out.println("list == " + list);
                    System.out.println("arrayList  " + arrayLists);
                    if (arrayLists.contains(list)) {
                    } else {
                        arrayLists.add(list);
                    }
                }
            }

        }
        return arrayLists;
    }

    public List<List<Integer>> bruteForce(int[] nums) {
        HashSet<List<Integer>> hashSet = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < k; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    List<Integer> list = new ArrayList<>();
//                    if (nums[i] + nums[j] + nums[k] == 0){
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
//                        arrayLists.add(list);
//                    }
//                }
            int firstPointer = i + 1;
            int secondPointer = nums.length - 1;
            while (firstPointer < secondPointer) {
                List<Integer> list = new ArrayList<>();
                if (nums[i] + nums[firstPointer] + nums[secondPointer] == 0) {
                    list.add(nums[i]);
                    list.add(nums[firstPointer]);
                    list.add(nums[secondPointer]);
                    hashSet.add(list);
                    firstPointer++;
                    secondPointer--;
                } else if (nums[i] + nums[firstPointer] + nums[secondPointer] > 0) {
                    secondPointer--;
                } else {
                    firstPointer++;
                }
            }
        }
//        }
        return new ArrayList<>(hashSet);
    }
}

public class ThreeSum {
    public static void main(String[] args) {

        int[] nums = new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        ThreeSumSolution solution = new ThreeSumSolution();
//        solution.threeSum(nums);
//        System.out.println(solution.threeSum(nums));
        System.out.println(solution.bruteForce(nums));
    }
}
