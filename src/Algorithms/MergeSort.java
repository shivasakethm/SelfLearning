package Algorithms;

import java.util.Arrays;

class MersgeSorting {

    void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        System.out.println("left -> " + Arrays.toString(l));
        System.out.println("right -> " + Arrays.toString(r));
        System.out.println("Original array 1->" + Arrays.toString(a));
//        System.out.println("mid ->"+mid);
//        System.out.println("n - mid ->"+(n - mid));
        mergeSort(l, mid);
        mergeSort(r, n - mid);
//
        merge(a, l, r, mid, n - mid);
        System.out.println("Original array 2->" + Arrays.toString(a));
    }

    private void merge(int[] a, int[] l, int[] r, int left, int right) {

        System.out.println("Original array 3->" + Arrays.toString(a));
        System.out.println("Left Array -> " + Arrays.toString(l));
        System.out.println("Right Array -> " + Arrays.toString(r));

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
        System.out.println("Array ->" + Arrays.toString(a));
    }
}

public class MergeSort {

    static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 3, 9, 1, 10};
        MersgeSorting mersgeSorting = new MersgeSorting();
//        mersgeSorting.mergeSort(array, array.length);
        sort(array, 0, array.length - 1);

    }
}
