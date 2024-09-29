package string;

import java.util.Scanner;

public class CheckPalindromeString {

    /**
     * Main method of the class for the following question:
     *   check whether a string is a palindrome in Java?
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        var input = scanner.nextLine();

        System.out.println("Palindrome: " + isPalindrome(input));
        System.out.println("Palindrome: " + isPalindromeString(input));
    }

    // Brute Force:
    private static boolean isPalindrome(String input) {
        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }

        return result;
    }

    // Optimized Method:
    private static boolean isPalindromeString(String input) {
        return new StringBuilder(input).reverse().toString().equals(input);
    }
}
