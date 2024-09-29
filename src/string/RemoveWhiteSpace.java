package string;

import java.util.Scanner;

public class RemoveWhiteSpace {

    /**
     * Main method of the class for the following question:
     *    Remove spaces from a string in Java.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        var input = scanner.nextLine();

        System.out.println(removeWhiteSpaceBruteForce(input));
        System.out.println(removeWhiteSpace(input));
    }

    // Brute Force:
    private static String removeWhiteSpaceBruteForce(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }

    // Optimized Method:
    private static String removeWhiteSpace(String input) {
        return input.replaceAll(" ", "");
    }
}
