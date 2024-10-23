package array;

import java.util.Arrays;

public class MergeSort {
    /**
     * Main method of the class for the following question:
     *     Merge Sort Algorithm to sort an array
     * */
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 10, 1, 9, 7, 8, 6};
        int[] sorted = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
        return arr;
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        /* Old method
         for (int l = 0; l < temp.length; l++) {
             arr[start + l] = temp[l];
         }
        */
        System.arraycopy(temp, 0, arr, start, temp.length);
    }
}