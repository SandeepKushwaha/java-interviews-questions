package string;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrenceCounter {
    /**
     * Main method of the class for the following question:
     *   Find the counts the occurrences of each character in a given input string.
     * */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String input = scanner.nextLine();

        // Optimized Method:
        countCharacterOccurrences(input);

        System.out.println();

        // Brute Force Method:
        occurringChar(input);
    }

    // Brute Force Method:
    private static void occurringChar(String input) {
        int[] count = new int[256]; // ASCII_SIZE

        for (int i = 0; i < input.length(); i++)
            count[input.charAt(i)]++;

        char[] ch = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            ch[i] = input.charAt(i);
            int find = 0;

            for (int j = 0; j <= i; j++) {
                // If any matches found
                if (input.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println(input.charAt(i) + " : " + count[input.charAt(i)]);
        }
    }

    // Optimized Method:
    private static void countCharacterOccurrences(String input) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (countMap.containsKey(ch)) {
                countMap.put(ch, countMap.get(ch) + 1);
            } else {
                countMap.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
