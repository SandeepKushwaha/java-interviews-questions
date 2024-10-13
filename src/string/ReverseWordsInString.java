package string;

public class ReverseWordsInString {

    /**
     * Main method of the class for the following question:
     *    Reverse Words in a String.
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter input string: ");
        String input = scanner.nextLine();
        System.out.println("Reversed string: " + reverseWords(input));
        System.out.println("Reversed string: " + reverseWordsOptimized(input));
    }

    private static String reverseWordsOptimized(String input) {
        if (input == null || input.isEmpty())
            return input;

        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    private static String reverseWords(String input) {
        if (input == null || input.isEmpty())
            return input;

        String[] words = input.trim().split("\\s+");
        java.util.Collections.reverse(java.util.Arrays.asList(words));
        return String.join(" ", words);
    }
}