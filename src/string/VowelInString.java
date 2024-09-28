package string;

public class VowelInString {
    /**
     * Main method of the class for the following question:
     *   Write a Java program to check if a vowel is present in a string.
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter input string: ");
        String input = scanner.nextLine();
        System.out.println(isStringContainsVowels(input));
    }

    private static boolean isStringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
