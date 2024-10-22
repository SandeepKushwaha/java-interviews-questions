package array;

import java.util.Arrays;

public class SortElements {

    /**
     * Main method of the class for the following question:
     *   Program to sort the elements in array.
     * */
    public static void main(String[] args) {
        int[] arr1 = {2, 6, 10, 9, 8, 7, 1, 3, 4, 5};
        int[] arr2 = {2, 6, 10, 9, 8, 7, 1, 3, 4, 5};
        sort(arr1);
        sortBruteForce(arr2);
        System.out.println("Sort array using Library Method: " + Arrays.toString(arr1));
        System.out.println("Sort array using Brute Force Method: " + Arrays.toString(arr2));
    }

    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void sortBruteForce(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}