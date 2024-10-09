package  array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CompareTwoArray {

    /**
     * Main method of the class for the following question:
     *     Checks if two arrays contain the same elements.
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter length of array 1: ");
        int length = scanner.nextInt();
        Integer[] arr1 = new Integer[length];

        System.out.println("Enter elements of array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter length of array 2: ");
        int length2 = scanner.nextInt();
        Integer[] arr2 = new Integer[length2];

        System.out.println("Enter elements of array 1: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        System.out.println("Are two arrays same: " + isSameElements(arr1, arr2));
    }

    private static boolean isSameElements(Object[] arr1, Object[] arr2) {
        Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(arr1));
        Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(arr2));

        if (uniqueElements1.size() != uniqueElements2.size()) {
            return false;
        }

        for (Object obj : uniqueElements1) {
            if (!uniqueElements2.contains(obj)) {
                return false;
            }
        }

        return true;
    }
}