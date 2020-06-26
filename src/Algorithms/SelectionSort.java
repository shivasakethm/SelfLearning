package Algorithms;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] ints) {
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < ints.length; i++) {
            int minimumindex = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[minimumindex] > ints[j]) {
                    minimumindex = j;
                }
            }
            int temp = ints[i];
            ints[i] = ints[minimumindex];
            ints[minimumindex] = temp;
            System.out.println(Arrays.toString(ints));
        }
        System.out.println(Arrays.toString(ints));

    }

    public static void main(String[] args) {

        int[] ints = new int[]{5, 4, 3, 2, 1, 0};
        selectionSort(ints);

    }
}
