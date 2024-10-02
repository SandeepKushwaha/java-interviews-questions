package array;

import java.util.Arrays;

public class SumOfArray {

    /**
     * Main method of the class for the following question:
     *   Find the sum of all the elements of a given array.
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter length of array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Sum of array: " + sum(arr));
        System.out.println("Sum of array: " + sumOfArray(arr));
    }

    private static int sum(int[] arr) {
        return arr.length == 0 ? 0 : Arrays.stream(arr).sum();
    }

    private static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}