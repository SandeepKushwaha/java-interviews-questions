package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

    /**
     * Main method of the class for the following question:
     *   Reverse a List in Java
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter number for length of list: ");
        int length = scanner.nextInt();
        System.out.print("Enter elements of list: ");
        for (int i = 0; i < length; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Reversed list: " + reverseListBruteForce(list));
        System.out.println("Reversed list: " + reverse(list));
    }

    private static List<Integer> reverse(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    private static List<Integer> reverseListBruteForce(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}