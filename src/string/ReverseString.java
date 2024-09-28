package string;

public class ReverseString {

    /**
     * Main method of the class for the following question:
     *   Reverse String of given string.
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Original: " + input);
        System.out.println("Reverse: " + reverseString(input));
        System.out.println("Reverse Brute Force: " + reverseStringBruteForce(input));
    }

    private static String reverseStringBruteForce(String input) {
        if (input == null)
            throw new NullPointerException("Null is not valid Input");

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(chars[i]);
        }

        return result.toString();
    }

    // Using Java Library:
    private static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
