package com.example.helloworld;

public class Test {

    public static int maxarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int iMax = 0;
        for (int num : nums) {
            iMax = iMax + num;
            System.out.println("imax " + iMax + " ||num " + num);
            if (iMax < num) {
                iMax = num;
            }
            max = Math.max(max, iMax);
            System.out.println("imax " + iMax);
        }
        return max;
    }

    static int recursion(int n) {
        int x = n;
        if (n == 1) {
            System.out.println("End of list");
            return 1;
        }
        int res = recursion(n - 1);
        System.out.println(res);
        System.out.println(x);
        return 123;
    }

    static void printMatrix1(int[][] matrix) {
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {

    }

    public static void main(String[] args) {

        System.out.println(4 & 8);

    }
}

//        0 1 2 3 16
//        4 5 6 7 17
//        8 9 10 11 18
//        12 13 14 15 19
//        20 21 22 23 24
//
//
//        20 12 8 4 0
//        21 13 9 5 1
//        22 14 10 6 2
//        23 15 11 7 3
//        24 19 18 17 16