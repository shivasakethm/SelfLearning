package Algorithms;

import java.util.Arrays;

public class QuickSort {

    static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int index = partition(arr, low, high);
            sort(arr, low, index - 1);
            sort(arr, index + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 10, 4, 90, 7, 213, 1, 0};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
