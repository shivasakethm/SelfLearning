package Algorithms;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] ints) {
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = 0; j < ints.length; j++) {
//                if(ints[i] < ints[j]){
//                    int temp = ints[i];
//                    ints[i] = ints[j];
//                    ints[j] = temp;
//                }
//            }
//            System.out.println(Arrays.toString(ints));
//        }
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(ints));
        }
    }

    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int[] ints = new int[]{3, 2, 4, 1, 0};
        int[] ints1 = new int[]{3, 2, 4, 1, 0};
//        bubbleSort(ints);
        sort(ints1);
    }
}
