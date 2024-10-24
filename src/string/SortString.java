package string;

/**
 *
 */
public class SortString {
    
    /**
     * The main method which serves as the entry point of the application.
     * It takes a string input from the user, sorts its characters in ascending order,
     * and then prints the sorted string.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter String: ");
        String input = scanner.nextLine();
        
        String sortedString = sortString(input);

        System.out.println("Sorted String: " + sortedString);
        System.out.println("Sorted String: " + sortStringBruteForce(input));
    }


    /**
     * Sorts the characters of the given string in ascending order and returns the result.
     *
     * @param str the string to be sorted
     * @return a new string with characters from the input string sorted in ascending order
     */
    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray).trim();
    }


    /**
     * Brute force method to sort the characters of the given string in ascending order and returns the result.
     *
     * @param str the string to be sorted
     * @return a new string with characters from the input string sorted in ascending order
     */
    public static String sortStringBruteForce(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return new String(charArray).trim();
    }
}

