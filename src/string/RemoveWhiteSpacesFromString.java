package string;

public class RemoveWhiteSpacesFromString {

    /**
     * Main method of the class for the following question:
     *   Write a Java program to remove white spaces from a string.
     * */
    public static void main(String[] args) {
        String str = "  Hello    World!,     I love       Java    Programming     language.    ";
        System.out.println("Original String: " + str);
        System.out.println("String after removing white spaces: " + removeWhiteSpacesFromString(str));
    }

    private static String removeWhiteSpacesFromString(String str) {
        return str.replaceAll("\\s+", " ").trim();
    }
}