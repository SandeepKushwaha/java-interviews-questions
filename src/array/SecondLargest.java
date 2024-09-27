package array;

import java.util.Arrays;

public class SecondLargest {
    /**
     * Main method of the class for the following question:
     *   Find the Second-Largest element in the integer array.
     * */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 43, 23, 5, 53, 53, 99, 9, 54};
        int[] arr1 = {1};
        int[] arr2 = {2, 1};
        int[] arr3 = new int[0];

        System.out.println(secondLargest(arr));
        // Brute Force solution:
        System.out.println(secondLargestBruteForce(arr));
        // Optimized Solution:
        System.out.println(secondLargestOptimized(arr));
        
        System.out.println(secondLargest(arr1));
        System.out.println(secondLargest(arr2));

        System.out.println(secondLargest(arr3));
    }

    public static int secondLargest(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Array is empty");
        }

        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array have 0 length");
        }

        int[] sorted = Arrays.stream(arr).sorted().toArray();

        if (sorted.length > 1) {
            return sorted[sorted.length - 2];
        } else {
            return sorted[0];
        }
    }

    // Brute Force Method
    public static int secondLargestBruteForce(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Ensure we are not comparing the same element
                if (i != j) {
                    if (arr[j] > largest) {
                        secondLargest = largest; // Update second largest
                        largest = arr[j]; // Update largest
                    } else if (arr[j] > secondLargest && arr[j] != largest) {
                        secondLargest = arr[j]; // Update second largest if condition met
                    }
                }
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element.");
        }

        return secondLargest;
    }

    // Optimized Method
    public static int secondLargestOptimized(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element.");
        }

        return secondLargest;
    }
}
