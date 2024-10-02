package list;

import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter number for length of list: ");
        int length = scanner.nextInt();
        System.out.print("Enter elements of list: ");
        for (int i = 0; i < length; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Reversed list: " + reverseBruteForce(list));
        System.out.println("Reversed list: " + reverse(list));
    }

    private static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        list.descendingIterator().forEachRemaining(reversedList::add);
        return reversedList;
    }

    private static LinkedList<Integer> reverseBruteForce(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}