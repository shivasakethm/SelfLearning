package Algorithms;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            int key = ints[i];
            int j = i - 1;
            while (j >= 0) {
                if (ints[j] > key) {
                    ints[j + 1] = ints[j];
                    j = j - 1;
                } else {
                    break;
                }
            }
            ints[j + 1] = key;
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void main(String[] args) {

        int[] ints = new int[]{3, 2, 4, 1, 0};
        insertionSort(ints);
    }
}
