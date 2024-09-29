package list;

import java.util.ArrayList;
import java.util.List;

public class CheckOnlyOddNumbers {

    /**
     * Main method of the class for the following question:
     *   How do you check if a list of integers contains only odd numbers in Java?
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter number for length of list: ");
        int length = scanner.nextInt();

        System.out.print("Enter elements of list: ");
        for (int i = 0; i < length; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("only odd numbers in list: " + onlyOddNumbers(list));
        System.out.println("is only odd numbers in list: " + isOnlyOddNumbers(list));
    }

    // Brute Force:
    private static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list)
            if (i % 2 == 0)
                return false;

        return true;
    }

    // Optimized Method:
    private static boolean isOnlyOddNumbers(List<Integer> list) {
        return list.parallelStream().allMatch(e -> e % 2 != 0);
    }
}
