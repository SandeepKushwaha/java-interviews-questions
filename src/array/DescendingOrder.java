package array;

import java.util.Arrays;

public class DescendingOrder {

    /**
     * Main method of the class for the following question:
     *   Write a Java program to sort an array in descending order.
     * */
    public static void main(String[] args) {

        int[] arr = {0, 2, 6, 10, 9, 8, 7, 1, 3, 4, 5};
        /*
         Test cases to sort array in descending order::
         int[] arr = {2, 2, 2, 2};
         int[] arr = {0, 2};
         int[] arr = {4};
        */
        sortDescendingOrder(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortDescendingOrder(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}